package network_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_FileServer {
	public static void main(String[] args) {
		
		ServerSocket serv = null; // ���Ӽ���
		Socket sock = null; // ��ż���

		// �Է� ��Ʈ��
		BufferedReader in = null;

		// ��� ���� ����
		File file = new File("./src/network_Socket/recieveData.txt");
		BufferedWriter out = null; // ���� ��� ��Ʈ��
		
		try {
			// ���� ���� ����
			serv = new ServerSocket(10021);
			
			while(true) {
				System.out.println("---���� ����� [port:"
						+ serv.getLocalPort() + "]---");
				sock = serv.accept(); //Listen �� ��ż��� ����
				// ----- BLOCKED -----
				
				// ������ ����
				System.out.println("Ŭ���̾�Ʈ ["
						+ sock.getInetAddress().getHostAddress()
						+ ":"
						+ sock.getPort()
						+ "] ����!");
				
				// ----- ����� ��Ʈ�� ���� -----
				// ���� �Է� ��Ʈ�� - ���۵� ���� ���� �ޱ�
				in = new BufferedReader(
						new InputStreamReader(
							sock.getInputStream()));
				// ���� ��� ��Ʈ�� - ���۵� ������ ���Ϸ� ���� �ϱ�
				out = new BufferedWriter(
						new FileWriter(file));
				// -------------------------
				
				// ----- ������ ��� �� ó�� -----
				// in���� �޾� out���� ���
				char[] cbuf = new char[1024];
				int len = -1;
				
				while( (len=in.read(cbuf)) != -1 ) {
					out.write(cbuf, 0, len);
				}
				out.flush();
				// --------------------
				
			} // while end - Ŭ���̾�Ʈ���� �� ���
			
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ���� ����");
		} finally {
			try {
				if(serv!=null)	serv.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ���� ���� �ݱ� ����");
			}
		} // try end - ���� ���� ����
		
	}
}













