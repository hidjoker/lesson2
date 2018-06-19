package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader in = null; // �Է� ��Ʈ��
		
		try {
			servSock = new ServerSocket(9988);
			System.out.println("+ + + ���� ���� ���� + + +");
			
			System.out.println("Listening...!!");
			sock = servSock.accept();
			
			System.out.println("Client Accepted!!");
			
			// �Է� ��Ʈ�� ����
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			
			String receive = in.readLine();
			
			System.out.println("\n\t>>���۵����� : " + receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}












