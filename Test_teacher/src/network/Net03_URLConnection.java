package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		
		String urlStr
			= "https://www.oracle.com:443/downloads/index.html"; 
		
		URL url = null;	// URL ���� ��ü
		URLConnection conn = null; // URL ���� ��ü
		
		BufferedReader reader = null; // �Է½�Ʈ��
		char[] cbuf = new char[1024]; // �Է½�Ʈ�� ���� ����
		int len = -1; // �Է½�Ʈ�� �Է� ����
		
		try {
			url = new URL(urlStr); // ������ URL ����
			conn = url.openConnection(); // ���� ����
			
			// ���� ��ü�� ���� ��Ʈ�� ���
			reader = new BufferedReader(
						new InputStreamReader(
							conn.getInputStream() ));
			// conn -> InputStream
			// InputStream -> Reader
			// Reader -> BufferedReader
			
			while( (len=reader.read(cbuf)) != -1 ) {
				System.out.print(
					new String(cbuf, 0, len) );
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}














