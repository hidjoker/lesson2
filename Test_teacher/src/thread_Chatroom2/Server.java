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
	
		System.out.println("== ä�� ������ũ ==");
		
		ServerSocket serv = null;
		Socket sock = null;

		try {
			serv = new ServerSocket(HOST_PORT);
			
			while(true){
				System.out.println("��� ���� ���...");
				sock = serv.accept();
				InetAddress ia = sock.getInetAddress();
				System.out.println("Ŭ���̾�Ʈ ���� ����");
				System.out.println("IP���� : " + ia.getHostAddress()+" ,����  PORT : "+sock.getPort());
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
						System.out.println(clientId+"�� �α׾ƿ�");
						for(String id : map.keySet()) {
							if(clientId.equals(id)) continue;
							map.get(id).println("SYSTEM : "+id+"���� �α׾ƿ� �ϼ̽��ϴ�");
							map.get(id).flush();
						}
						map.remove(clientId);
						break;
					}
					if(msg.contains("_IS_ID_")) {
						String[] msgArr = msg.split("_IS_ID_");
						clientId = msgArr[1];
						map.put(clientId, out);
						System.out.println(clientId+"�� �α���");
						for(String id : map.keySet()) {
							if(clientId.equals(id)) continue;
							map.get(id).println("SYSTEM : "+clientId+"���� �α��� �ϼ̽��ϴ�");
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
				System.out.println("��ȣ����");
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
