package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_EchoClient {
	public static void main(String[] args) {
	
		Socket sock = null; //Ŭ���̾�Ʈ ���� ��ü
		
		PrintWriter out = null; //���� ��� ��Ʈ�� ��ü
		BufferedReader in = null; //���� �Է� ��Ʈ�� ��ü
		
		Scanner sc = new Scanner(System.in); //Ű�����Է�
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			
			// ���� ��û
			sock = new Socket("192.168.20.34", 10010);

			// ��� ��Ʈ�� ����, autoFlush=true
			out = new PrintWriter(
					sock.getOutputStream(), true );

			// �Է� ��Ʈ�� ����
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			
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
				
				// ECHO
				System.out.println(">> ���� �޽��� : "
						+ in.readLine() );
			}
			System.out.println("+ + + ��� �Ϸ� + + +");
			// --------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] �� �� ���� ȣ��Ʈ�Դϴ�");
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����, ������ ����� �� �����ϴ�");
		} finally {
			try {
				if(out!=null)	out.close();
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ� ���� ����");
			}
		}		

	}
}
