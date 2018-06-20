package network_Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex03_FileClient {
	public static void main(String[] args) {
		
		Socket sock = null;	// Ŭ���̾�Ʈ ����
		
		// ������ ����
		File file = new File("./src/network_Socket/data.txt");
		BufferedReader in = null; // ���� �Է� ��Ʈ��
		
		PrintWriter out = null; // ���� ��� ��Ʈ��
		
		try {
			sock = new Socket("localhost", 10021);
			System.out.println("--- ���� �Ϸ� ---");
			
			// ----- ����� ��Ʈ�� ���� -----
			// ���� �Է� ��Ʈ�� - ������ ���� �б�
			in = new BufferedReader(new FileReader(file));
			
			// ���� ��� ��Ʈ�� - ���� ���� �����ϱ�
			out = new PrintWriter(sock.getOutputStream(), true);
			// -------------------------
			
			// ----- ������ ��� �� ó�� -----
			// in���� �о� out���� ����ϱ�
			char[] cbuf = new char[1024];
			int len = -1;
			
			while( (len=in.read(cbuf)) != -1 ) {
				out.write(cbuf, 0, len);
				out.flush();
			}
			// -------------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] �� �� ���� ȣ��Ʈ");
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ����");
		} finally {
			try {
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ����");
			}
		}
		
	}
}
