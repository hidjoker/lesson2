package condition;

import java.util.Scanner;

public class IfQuiz_04 {
	//  + �μ��� �Է� �޾� ���� ¦���̰� 3�� ������� �Ǻ��Ͻÿ�

	public static void main(String[] args) {
		// 1. �� �� ���� ����
		int num1, num2;
		
		// 2. �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
//		System.out.println("[TEST] "+num1+","+num2);
		
		// 3. �� ���ϱ�
		int sum = num1 + num2;
		
		// 4. ¦���鼭 3�� ������� �Ǻ��ϱ�
		// ¦���� 2�� ���
		
		// 2�� ����� 3�� ����� �Ǻ��� �� ���ڷ� �������� ��
		// �������� 0�� ������ �Ǻ��Ѵ�
		
		// ¦�� �Ǻ� �ڵ� : sum%2==0
		// 3�� ��� �Ǻ� �ڵ� : sum%3==0
		boolean b = false; // ¦���̸鼭 3�ǹ������ �Ǵܰ�� ����
		if( sum%2==0 && sum%3==0 ) {
			b = true;
		}
		
		// 5. ��� ����ϱ�
		System.out.print("["+num1+"],["+num2+"] �� ��["
				+sum+"] ��/�� ");
		if( b == true ) {
			// ������ ���� ����
			System.out.println("¦���̸鼭 3�� ����̴�");
		} else {
			// ���� �Ҹ���
			System.out.println("¦���鼭 3�� ����� �ƴϴ�");
		}
	}
}











