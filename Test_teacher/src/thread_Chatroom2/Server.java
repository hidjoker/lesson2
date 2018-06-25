package thread_Chatroom2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
	
	
	Map<String, PrintWriter> map = new HashMap<>();
	
	private static final int HOST_PORT = 20000;
	
	
	
	
	public static void main(String[] args) {
		
		Server s = new Server();
		s.servLink();
		
		
	}

	public void servLink() {
	
		System.out.println("== 채팅 서버링크 ==");
		
		ServerSocket serv = null;
		Socket sock = null;

		try {
			serv = new ServerSocket(HOST_PORT);
			
			while(true){
				System.out.println("통신 접속 대기...");
				sock = serv.accept();
				InetAddress ia = sock.getInetAddress();
				System.out.println("클라이언트 연결 성공");
				System.out.println("IP연결 : " + ia.getHostAddress()+" ,연결  PORT : "+sock.getPort());
				new ClientManager(sock).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(serv!=null) serv.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	class ClientManager extends Thread {
		
		private Socket sock = null;
		
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			
			String clientId = null;
			BufferedReader in = null;
			PrintWriter out = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream());
				
				String msg;

				while(true) {
					msg = in.readLine();
					if(msg==null) {
						System.out.println(clientId+"님 로그아웃");
						for(String id : map.keySet()) {
							if(clientId.equals(id)) continue;
							map.get(id).println("SYSTEM : "+id+"님이 로그아웃 하셨습니다");
							map.get(id).flush();
						}
						map.remove(clientId);
						break;
					}
					if(msg.contains("_IS_ID_")) {
						String[] msgArr = msg.split("_IS_ID_");
						clientId = msgArr[1];
						map.put(clientId, out);
						System.out.println(clientId+"님 로그인");
						for(String id : map.keySet()) {
							if(clientId.equals(id)) continue;
							map.get(id).println("SYSTEM : "+clientId+"님이 로그인 하셨습니다");
							map.get(id).flush();
						}
					}else{
						for(String id : map.keySet()) {
							if(clientId.equals(id)) continue;
							map.get(id).println(clientId+">"+msg);
							map.get(id).flush();
						}
						
					}
					
				}

			} catch (IOException e) {
				System.out.println("신호끊김");
			}finally {
			
				try {
					if(in!=null) in.close();
					if(out!=null) out.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	
}
