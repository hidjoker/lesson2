package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		// InetAddress - IP������ �ٷ�� Ŭ����
		
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(
			"HostName : "+ip.getHostName() );
		System.out.println(
			"HostAddress : "+ip.getHostAddress() );
		System.out.println(
			"toString() : " + ip );
		
		System.out.println("----------");
		byte[] ipAddr = ip.getAddress();
		System.out.println(
			"getAddress() : " + Arrays.toString(ipAddr) );
		
		for(byte i : ipAddr) {
			System.out.print( (i<0) ?i+256 :i );
			
			System.out.print(".");
		}
		System.out.println();
		
		System.out.println("---localhost-------");
		try {
			// �ڱ� �ڽ� ȣ��Ʈ ���� ���
			ip = InetAddress.getLocalHost();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(
			"HostName : "+ip.getHostName() );
		System.out.println(
			"HostAddress : "+ip.getHostAddress() );
		System.out.println(
			"toString() : " + ip );
		
		
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}











