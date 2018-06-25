package thread_Chatroom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private static final String HOST_ID = "localhost";
	private static final int HOST_PORT = 20000;
	
	public static void main(String[] args) {
	
		Client c = new Client();
		c.sockLink();	
		
	}
	
	public void sockLink() {
		
		Socket sock = null;
		try {
			sock = new Socket(HOST_ID,HOST_PORT);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		chat(sock);
	
	}
	
	public void chat(Socket sock) {
		
		new Receiver(sock).start();
		new Sender(sock).start();
		
		
	}
	
	class Receiver extends Thread{
		
		Socket sock = null;
		
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			
			BufferedReader in = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg;
				while((msg=in.readLine())!=null) {
					System.out.println(msg);
				}
				
				
			} catch (IOException e) {
				System.out.println("접속을 중단합니다");
			}finally {
				try {
					if(in!=null) in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
		}
		
	}
	class Sender extends Thread{
		
		Socket sock = null;
		
		public Sender(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			BufferedReader in = null;
			PrintWriter out = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				out = new PrintWriter(sock.getOutputStream());
				
				String msg;
				System.out.println("접속했습니다");
				System.out.println("ID를 입력하세요");
				msg=in.readLine();
				out.println("Client_IS_ID_"+msg);
				out.flush();
				
				
				while(true) {
					msg=in.readLine();
					if(msg.equals("/EXIT")) break;
					out.println(msg);
					out.flush();

				}
				System.out.println(" = 접속을 종료합니다 = ");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(in!=null)in.close();
					if(out!=null) out.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			
			
			
			
		}
		
	}
	
	
}
