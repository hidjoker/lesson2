package array;

public class ArrayEx_02 {
	public static void main(String[] args) {

		// ������ ����� ���ÿ� �ʱ�ȭ
		int num = 123;
		
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] arr = {1,2,3,4,5};
		
		//int[] arr;
		//arr = new int[5];
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
		//arr[3] = 4;
		//arr[4] = 5;

		// ��� ���(element) ���
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		// ��� ���(element) ����
		for(int i=0; i<5; i++) {
			arr[i] = (i+1) * 10;
		}

		System.out.println("-----");
		// ��� ���(element) ���
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}
}












