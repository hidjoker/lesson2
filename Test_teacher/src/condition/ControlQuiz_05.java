package condition;

import java.util.Scanner;

public class ControlQuiz_05 {
//	- 1�������� �Էµ� � ������ ���� �ִ� �Ҽ���
//	 ã�� ���α׷��� �ۼ��϶�.
//		* �Ҽ� = 1 �� �ڽ��� ���ڷθ� ������ �������� ��
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		boolean flag = false; //�Ҽ��Ǻ� �÷���
		
		for(int i=2; i<=num; i++) {
			flag = false;
			
			// ���� �� ���� ���� �Ҽ� �Ǻ�
			for(int j=2; j<=i-1; j++) {
				if( i%j==0 ) {
					flag = true;
				}
			}
	
			if(flag == true) {
				System.out.println(i + " ��/�� �Ҽ��� �ƴ�");
			} else {
				System.out.println(i + " ��/�� �Ҽ�");
			}
		}
		
	}
}















