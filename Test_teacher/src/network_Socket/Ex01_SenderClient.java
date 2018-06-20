package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_SenderClient {
	public static void main(String[] args) {

		Socket sock = null; //클라이언트 소켓 객체
		PrintWriter out = null; //소켓 출력 스트림 객체
		
		Scanner sc = new Scanner(System.in); //키보드입력
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			
			// 접속 요청
			sock = new Socket("192.168.20.34", 10007);

			// 출력 스트림 개설, autoFlush=true
			out = new PrintWriter(
					sock.getOutputStream(), true );

			// ----- 데이터 통신 -----
			String msg = null; // 메세지
			
			while(true) {
				// 전송할 내용 입력
				System.out.print("\t보낼 메시지 : ");
				msg = sc.nextLine();
				
				// 통신 중단
				if( "/EXIT".equals(msg) )	break;
				
				// 서버로 전송
				out.println(msg);
			}
			System.out.println("+ + + 통신 완료 + + +");
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
