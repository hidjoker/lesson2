package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx2 {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader in = null; // 입력 스트림
		
		try {
			servSock = new ServerSocket(9988);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println("Linsten Port : "
					+ servSock.getLocalPort() );
			System.out.println("---------------");
			sock = servSock.accept(); // Listen
			
			System.out.println("클라이언트 접속!!");
			//클라이언트 ip정보 얻기
			InetAddress ip = sock.getInetAddress();
			System.out.println("\t>>클라이언트 IP : "
					+ ip.getHostAddress()); //IP
			System.out.println("\t>>클라이언트 Port : "
					+ sock.getPort() ); //Port
			
			// 입력 스트림 개설
			in = new BufferedReader(
					new InputStreamReader(
						sock.getInputStream() ));
			
			String receive = in.readLine();
			
			System.out.println("\n\t>>전송데이터 : " + receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close();
				if(sock!=null)	sock.close();
				if(servSock!=null)	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}












