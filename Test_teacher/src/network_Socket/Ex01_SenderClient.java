package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_SenderClient {
	public static void main(String[] args) {

		Socket sock = null; //Ŭ���̾�Ʈ ���� ��ü
		PrintWriter out = null; //���� ��� ��Ʈ�� ��ü
		
		Scanner sc = new Scanner(System.in); //Ű�����Է�
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			
			// ���� ��û
			sock = new Socket("192.168.20.34", 10007);

			// ��� ��Ʈ�� ����, autoFlush=true
			out = new PrintWriter(
					sock.getOutputStream(), true );

			// ----- ������ ��� -----
			String msg = null; // �޼���
			
			while(true) {
				// ������ ���� �Է�
				System.out.print("\t���� �޽��� : ");
				msg = sc.nextLine();
				
				// ��� �ߴ�
				if( "/EXIT".equals(msg) )	break;
				
				// ������ ����
				out.println(msg);
			}
			System.out.println("+ + + ��� �Ϸ� + + +");
			// --------------------
			
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
