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
		
		ServerSocket serv = null; // 접속소켓
		Socket sock = null; // 통신소켓

		// 입력 스트림
		BufferedReader in = null;

		// 출력 파일 설정
		File file = new File("./src/network_Socket/recieveData.txt");
		BufferedWriter out = null; // 파일 출력 스트림
		
		try {
			// 서버 소켓 생성
			serv = new ServerSocket(10021);
			
			while(true) {
				System.out.println("---접속 대기중 [port:"
						+ serv.getLocalPort() + "]---");
				sock = serv.accept(); //Listen 및 통신소켓 생성
				// ----- BLOCKED -----
				
				// 원격지 정보
				System.out.println("클라이언트 ["
						+ sock.getInetAddress().getHostAddress()
						+ ":"
						+ sock.getPort()
						+ "] 접속!");
				
				// ----- 입출력 스트림 생성 -----
				// 소켓 입력 스트림 - 전송된 파일 정보 받기
				in = new BufferedReader(
						new InputStreamReader(
							sock.getInputStream()));
				// 파일 출력 스트림 - 전송된 데이터 파일로 저장 하기
				out = new BufferedWriter(
						new FileWriter(file));
				// -------------------------
				
				// ----- 데이터 통신 및 처리 -----
				// in으로 받아 out으로 출력
				char[] cbuf = new char[1024];
				int len = -1;
				
				while( (len=in.read(cbuf)) != -1 ) {
					out.write(cbuf, 0, len);
				}
				out.flush();
				// --------------------
				
			} // while end - 클라이언트접속 및 통신
			
		} catch (IOException e) {
			System.out.println("[ERROR] 서버 소켓 생성 실패");
		} finally {
			try {
				if(serv!=null)	serv.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 서버 소켓 닫기 실패");
			}
		} // try end - 서버 소켓 생성
		
	}
}













