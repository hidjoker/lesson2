package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class Server {

	Map<String , PrintWriter> idMap = new HashMap<>();

	//Ŭ���̾�Ʈ �Ŵ��� ������
	public class ClientManager extends Thread{
				
		private String id;
		Socket sock=null;
				
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
				
		@Override
		public void run() {
			BufferedReader in = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			} catch (IOException e1) {
				System.out.println("[ERROR]�Է� ��Ʈ�� ���� ����");
			}
			String msg;
			String[] msgArr;
					
			while(true){
				try {
					msg = in.readLine();
					if(msg==null) { 
						for(String id : idMap.keySet()) {
							idMap.get(id).println(this.id+"���� �α׾ƿ� �ϼ̽��ϴ�");
						}
						idMap.get(id).close();
						idMap.remove(id);						
					}else if(msg.contains("_ID_IS_")) {
						msgArr = msg.split("_ID_IS_");
						this.id=msgArr[1];
						idMap.put(msgArr[1], new PrintWriter(sock.getOutputStream()));
						for(String id : idMap.keySet()) {
						idMap.get(id).println(this.id +"���� �α��� �Ǿ����ϴ�");
						}
					}else {
						for(String id : idMap.keySet()) {
							idMap.get(id).println("���� �޽���>>" + msg);
						}
					}
				} catch (IOException e) {
					System.out.println(" ����� ������ϴ�!! ");
				}finally {
					try {
						if(in!=null) in.close();
						System.out.println(" + + + ��� ���� + + + ");		
					} catch (IOException e) {
						System.out.println("[ERROR] �ڿ� Ŭ���� ����");
					}

			    }
			
		      }
						
         }
    }
	
		
	

	public static void main(String[] args) {

		ServerSocket serv=null; // ���� ���� ����
		Socket sock = null; // ��� ���� ����
		try {
			serv = new ServerSocket(20000);

			while(true) {
				System.out.println("Listening.....");
				sock = serv.accept();
				new Server().new ClientManager(sock).start();
			}
			
		} catch (IOException e) {
			System.out.println("���� ���� ����!!");
		}
		
		
	}
	

	
}
