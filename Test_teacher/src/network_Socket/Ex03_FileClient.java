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
		
		Socket sock = null;	// 클라이언트 소켓
		
		// 전송할 파일
		File file = new File("./src/network_Socket/data.txt");
		BufferedReader in = null; // 파일 입력 스트림
		
		PrintWriter out = null; // 소켓 출력 스트림
		
		try {
			sock = new Socket("localhost", 10021);
			System.out.println("--- 접속 완료 ---");
			
			// ----- 입출력 스트림 개설 -----
			// 파일 입력 스트림 - 전송할 파일 읽기
			in = new BufferedReader(new FileReader(file));
			
			// 소켓 출력 스트림 - 파일 내용 전송하기
			out = new PrintWriter(sock.getOutputStream(), true);
			// -------------------------
			
			// ----- 데이터 통신 및 처리 -----
			// in으로 읽어 out으로 출력하기
			char[] cbuf = new char[1024];
			int len = -1;
			
			while( (len=in.read(cbuf)) != -1 ) {
				out.write(cbuf, 0, len);
				out.flush();
			}
			// -------------------------
			
		} catch (UnknownHostException e) {
			System.out.println("[ERROR] 알 수 없는 호스트");
		} catch (IOException e) {
			System.out.println("[ERROR] 접속 실패");
		} finally {
			try {
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 소켓 닫기 실패");
			}
		}
		
	}
}
