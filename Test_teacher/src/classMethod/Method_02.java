package classMethod;

public class Method_02 {
	
//	1. 1~100���� ������ ����ϴ� ���
	public void print100() {
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//	2. ���޹��� ���� ����ŭ "Apple" �ݺ� ���
	public void printApple(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.println("Apple");
		}
	}

	
//	3. ù��°�� ���޹��� ���� ����ŭ
//	   �ι�°�� ���޹��� ���ڿ��� �ݺ� ���
	public void printString(int cnt, String str) {
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
	
}














