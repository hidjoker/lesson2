package condition;

import java.util.Scanner;

public class IfQuiz_03 {
	// + ������ �Է� �޾� ���� ū ���� ����Ͻÿ�

	public static void main(String[] args) {

		// 1. 3���� ���ڸ� ������ ���� ����
		int num1, num2, num3;
		
		// 2. ������ �Է� �ޱ�
		Scanner sc = new Scanner(System.in);//�Է°�ü
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num3 = sc.nextInt();
//		System.out.println("[TEST] "+num1+","+num2+","+num3);
		
		// 3. ���� ū �� �Ǻ�
		int max;	// ���� ū �� ����
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		// 4. ��� ���
		System.out.println(
			"�� ����["+num1+","+num2+","+num3+"] �� ���� ū �� : "
					+ max);

	}
}











