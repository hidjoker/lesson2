package thread_Basic;

class ThreadDemo extends Thread {
	@Override
	public void run() {
		runMethod1();
	}
	public void runMethod1() {
		runMethod2();
	}
	public void runMethod2() {
		runMethod3();
	}
	public void runMethod3() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadEx_06_StackTrace {
	public static void main(String[] args) {
		
		// ���� Ʈ���̽� Ȯ���ϱ�
		ThreadDemo td = new ThreadDemo();
		
		td.start(); // �߰� �������� ����Ʈ���̽�
		
		td.runMethod1(); // ���� �������� ����Ʈ���̽�
		
	}
}











