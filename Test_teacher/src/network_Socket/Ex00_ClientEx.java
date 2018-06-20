package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex00_ClientEx {
	public static void main(String[] args) {
		
		Socket sock = null; // Ŭ���̾�Ʈ ���� ��ü
		PrintWriter out = null;
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			
			// ���� ��û
			sock = new Socket("127.0.0.1", 9988);

			// ��� ��Ʈ�� ����
			out = new PrintWriter(
					sock.getOutputStream(), true );
			
			// ������ ��� - ������ ������ ���� 
			out.println("Hello");
			
			// ����(���) �Ϸ�
//			out.flush();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null)	out.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}











