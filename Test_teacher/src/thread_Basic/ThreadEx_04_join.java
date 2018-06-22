package thread_Basic;

import java.util.Random;

public class ThreadEx_04_join extends Thread {
	
	private int idx; //스레드 인덱스
	
	public ThreadEx_04_join(int i) {	idx=i; }
	
	@Override
	public void run() {
		System.out.println(idx + " 스레드 시작");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) { }
		
		System.out.println(idx + " 스레드 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");

		ThreadEx_04_join t1 = new ThreadEx_04_join(1);
		ThreadEx_04_join t2 = new ThreadEx_04_join(2);
		ThreadEx_04_join t3 = new ThreadEx_04_join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			// 다른 스레드의 종료 기다리기
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 종료");
	}
	
}









