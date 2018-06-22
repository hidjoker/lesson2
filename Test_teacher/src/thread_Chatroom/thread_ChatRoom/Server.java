package thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static void main(String[] args) {
		Server s = new Server();
		s.initChatRoom();
	}

	private final int PORT = 9988;
	
	private Map<String, PrintWriter> writerToClients;
	
	public void initChatRoom() {
		writerToClients = new HashMap<String, PrintWriter>();
		
		try {
			ServerSocket serv = new ServerSocket(PORT);
			
			while(true) {
				Socket sock = serv.accept();
				
				ClientManager manager
					= new ClientManager(sock);
				manager.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ClientManager extends Thread {
		private Socket sock;
		private String clientID;
		
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				
				String msg;
				while(true) {
					msg = reader.readLine();
					System.out.println(clientID+">"+msg);
					
					// 로그아웃 처리
					if(msg == null) {
						System.out.println(clientID + " 로그아웃");

						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "님이 채팅방을 나가셨습니다.");
							writerToClients.get(id).flush();
						}

						// 처리 종료
						break;
					}
					
					// key값이 되는 ID 에 대한 중복 처리 필요
					// 로그인 처리
					String[] res = msg.split("_ID_IS_");
					if(res.length == 2) { // && "CLIENT".equals(res[0])) {
						clientID = res[1];
						System.out.println(clientID + " 로그인");
						
						writerToClients.put(
								clientID,	// Key
								new PrintWriter(sock.getOutputStream()) // Value
						);
						
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "님이 채팅방을 입장하셨습니다.");
							writerToClients.get(id).flush();
						}
						
						// 메시지 처리로 넘기기
						continue;
					}
					
					// 메세지 처리
					for(String id : writerToClients.keySet()) {
						if(id.equals(clientID)) continue;
						
						writerToClients.get(id).println(clientID + "> " + msg);
						writerToClients.get(id).flush();
					}
				}
				
				// 로그아웃 시 소켓 제거
				writerToClients.remove(clientID);
				sock.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}




