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
		
		URL url = null;	// URL 정보 객체
		URLConnection conn = null; // URL 접속 객체
		
		BufferedReader reader = null; // 입력스트림
		char[] cbuf = new char[1024]; // 입력스트림 보조 버퍼
		int len = -1; // 입력스트림 입력 길이
		
		try {
			url = new URL(urlStr); // 연결할 URL 생성
			conn = url.openConnection(); // 연결 수립
			
			// 연결 객체로 부터 스트림 얻기
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














