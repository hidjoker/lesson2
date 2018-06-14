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
//			System.out.println(" + + + 인덱스 벗어남 + + +");
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}












