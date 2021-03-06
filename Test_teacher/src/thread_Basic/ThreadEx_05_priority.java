package thread_Basic;

import java.util.Random;

public class ThreadEx_05_priority extends Thread {
	
	private int idx; //스레드 인덱스
	
	public ThreadEx_05_priority(int i) {	idx=i; }
	
	@Override
	public void run() {
//		System.out.println(idx + " 스레드 시작");
		
		for(int i=0; i<100; i++) {
			System.out.print(idx);
		}
		
//		System.out.println(idx + " 스레드 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");

		ThreadEx_05_priority t1 = new ThreadEx_05_priority(1);
		ThreadEx_05_priority t2 = new ThreadEx_05_priority(2);
		ThreadEx_05_priority t3 = new ThreadEx_05_priority(3);
		
		//우선 순위 조절
		t1.setPriority(Thread.MIN_PRIORITY); // Thread.MIN_PRIORITY, 1
		t2.setPriority(5); // Thread.NORM_PRIORITY, 5
		t3.setPriority(10); // Thread.MAX_PRIORITY, 10
		
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









