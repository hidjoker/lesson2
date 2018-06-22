package thread_Synchronized;

class SyncTest01 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println( i + "�� ���� ���ϱ�");
			total += i;
		}
	}
}

public class WaitNotifyEx_01 {
	public static void main(String[] args) {
		
		SyncTest01 st = new SyncTest01();
		st.start();
		
		try {
			st.join();
		} catch (InterruptedException e) { }
		
		System.out.println("1~100�� �� : " + st.total);
		
	}
}
















