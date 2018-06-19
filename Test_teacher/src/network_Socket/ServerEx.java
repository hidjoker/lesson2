package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader in = null; // 입력 스트림
		
		try {
			servSock = new ServerSocket(9988);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println("Listening...!!");
			sock = servSock.accept();
			
			System.out.println("Client Accepted!!");
			
			// 입력 스트림 개설
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			
			String receive = in.readLine();
			
			System.out.println("\n\t>>전송데이터 : " + receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}












