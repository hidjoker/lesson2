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
					
					// �α׾ƿ� ó��
					if(msg == null) {
						System.out.println(clientID + " �α׾ƿ�");

						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "���� ä�ù��� �����̽��ϴ�.");
							writerToClients.get(id).flush();
						}

						// ó�� ����
						break;
					}
					
					// key���� �Ǵ� ID �� ���� �ߺ� ó�� �ʿ�
					// �α��� ó��
					String[] res = msg.split("_ID_IS_");
					if(res.length == 2) { // && "CLIENT".equals(res[0])) {
						clientID = res[1];
						System.out.println(clientID + " �α���");
						
						writerToClients.put(
								clientID,	// Key
								new PrintWriter(sock.getOutputStream()) // Value
						);
						
						for(String id : writerToClients.keySet()) {
							if(id.equals(clientID)) continue;
							
							writerToClients.get(id).println("SYSTEM : " + clientID + "���� ä�ù��� �����ϼ̽��ϴ�.");
							writerToClients.get(id).flush();
						}
						
						// �޽��� ó���� �ѱ��
						continue;
					}
					
					// �޼��� ó��
					for(String id : writerToClients.keySet()) {
						if(id.equals(clientID)) continue;
						
						writerToClients.get(id).println(clientID + "> " + msg);
						writerToClients.get(id).flush();
					}
				}
				
				// �α׾ƿ� �� ���� ����
				writerToClients.remove(clientID);
				sock.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}




