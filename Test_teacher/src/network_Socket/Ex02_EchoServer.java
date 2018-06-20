package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_EchoServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader in = null; // ���� �Է� ��Ʈ��
		PrintWriter out = null;	// ���� ��� ��Ʈ��

		try {
			servSock = new ServerSocket(10010);
			System.out.println("+ + + ���� ���� ���� + + +");
			
			// ���� �� ��� �ݺ�
			while(true) {
				try {
					System.out.println("----- ���� ����� -----");
					System.out.println("Linsten Port : "
							+ servSock.getLocalPort() );
					System.out.println("--------------------");
					sock = servSock.accept(); // Listen
					
					// ----- BLOCK -----
					
					System.out.println("Ŭ���̾�Ʈ ����!!");
					// Remote ���� Ȯ��
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>Ŭ���̾�Ʈ IP : "
							+ ip.getHostAddress()); //IP
					System.out.println("\t>>Ŭ���̾�Ʈ Port : "
							+ sock.getPort() ); //Port
							
					// �Է� ��Ʈ�� ����
					in = new BufferedReader(
							new InputStreamReader(
								sock.getInputStream() ));
					
					// ��� ��Ʈ�� ����, autoFlush=true
					out = new PrintWriter(
							sock.getOutputStream(), true);
					
					// ----- ������ ��� -----
					String msg = null;
					
					while( (msg = in.readLine()) != null ) {
						System.out.println(" �����޽���>> " + msg);
						out.println(msg); // ECHO
					}
					// --------------------
		
					System.out.println("+ + + Ŭ���̾�Ʈ ���� ���� + + +");
					
				} catch (IOException e) {
					System.out.println("+ + + Ŭ���̾�Ʈ ���� ���� + + +");
				} finally {
					try {
						if(in!=null)	in.close();
						if(out!=null)	out.close();
						if(sock!=null)	sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] �ڿ����� ����");
					}
				} // try end - Ŭ���̾�Ʈ ���� �� ���
				
			}	// while end - ���� ���� �ݺ�
			
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����");
		} finally {
			try {
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ����� ����");
			}
		}
		
	}	
}
