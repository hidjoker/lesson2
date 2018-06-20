package thread_Basic;

class ThreadTest01 extends Thread {
	@Override
	public void run() {
	
		for(int i=0; i<100; i++) {
			System.out.println("ThreadTest : " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
	
	}
}

public class ThreadEx_01_classThread {
	public static void main(String[] args) {
		
		ThreadTest01 tt = new ThreadTest01();
		tt.start(); //스레드 실행
//		tt.run();

		ThreadTest01 tt2 = new ThreadTest01();
		ThreadTest01 tt3 = new ThreadTest01();

		tt2.start();
		tt3.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
			
		}
		
	}
}








