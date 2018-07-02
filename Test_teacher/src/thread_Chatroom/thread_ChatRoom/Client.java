package thread_Chatroom.thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Client c = new Client();
		c.initClient();
	}

	private final String HOST = "localhost";
	private final int PORT = 9988;

	private String clientID;
	
	public void initClient() {
		try {
			Socket sock = new Socket(HOST, PORT);
			
			chat(sock);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void chat(Socket sock) {
		Reciever reciever = new Reciever(sock);
		reciever.start();
		
		Sender sender = new Sender(sock);
		sender.start();
	}

	class Reciever extends Thread {
		private Socket sock;
		private BufferedReader reader;
		
		public Reciever(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg;
				while( (msg = reader.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	class Sender extends Thread {
		private Socket sock;
		private PrintWriter writer;
		private BufferedReader reader;
		
		public Sender(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			try {
				writer = new PrintWriter(sock.getOutputStream());
				reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("사용할 ID를 입력하세요 : ");
				clientID = reader.readLine();
				writer.println("CLIENT_ID_IS_" + clientID);
				writer.flush();
				
				while(true) {
					String msg;
					msg = reader.readLine();

					if(msg.equals("EXIT")) break; 
					
					writer.println(msg);
					writer.flush();
				}
				
				writer.close();
				reader.close();
				sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
