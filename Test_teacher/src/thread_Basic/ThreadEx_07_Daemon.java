package thread_Basic;

class DaemonThreadTest implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " HI");
		}
	}
}

public class ThreadEx_07_Daemon {
	public static void main(String[] args) {

		System.out.println("--- Main Start ---");
		
		DaemonThreadTest dt = new DaemonThreadTest();
		
		Thread th = new Thread(dt);
		
		th.setDaemon(true);
		
		th.start();
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("--- Main End ---");
	}
}














