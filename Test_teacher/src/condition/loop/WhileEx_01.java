package condition.loop;

import java.util.Scanner;

public class WhileEx_01 {
	public static void main(String[] args) {
		
		// �ݺ��� while
		
		// while(���ǽ�) {
		//		//���ǽ��� true�̸� �ݺ��Ǵ� ����
		// }
		
//		while(true) { // ���� Loop
//			System.out.println("Hello");
//		}


//		for(�ʱ��;���ǽ�;������) { 
//		
//		}
	
//		�ʱ��;
//		while(���ǽ�) {
//			// �����ڵ�
//			
//			������;
//		}

		
		int i=0;
		
		while(i<10) {
			System.out.println(i);

			i++;
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);

		String name = "";

		while( !name.equals("Alice") ) {
			name = sc.nextLine();
		}
	}
}












