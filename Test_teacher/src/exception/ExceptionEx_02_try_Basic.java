package exception;

public class ExceptionEx_02_try_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			for(int i=0; true; i++) {
				arr[i] = i+1;
				System.out.println(arr[i]);
			}
		} catch ( Exception e ) {
//			System.out.println(" + + + �ε��� ��� + + +");
//			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
		
	}
}












