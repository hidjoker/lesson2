package condition;

import java.util.Scanner;

public class ControlQuiz_02 {
//	- �Է¹��� �μ��� �ּ� ������� �ִ� ������� ���ϴ� ���α׷��� �ۼ��϶�.
//	�ּҰ���� = ����� �߿��� ���� ���� ����
//	�ִ����� = ����� �߿��� ����ġ�� ���� ū ��
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();

		// �ִ�����
		// num1		num2
		//	24		32
		
		//	1		1
		//	2		2
		//	3		4
		//	4		8
		//	6		16
		//	8		32
		//	12		
		//	24
		
		int min = num1<num2 ?num1 :num2;

//		���1.
//		int gcd = 1;	//�ִ�����
//		for(int i=1; i<=min; i++) {
//			if( num1%i==0 && num2%i==0 ) { // �����
//				gcd = i;
//			}
//		}
		
//		���2.
		int gcd = 1;	//�ִ�����
		for(int i=min; i>=1; i--) {
			if( num1%i==0 && num2%i==0 ) { // �����
				gcd = i;
				break;
			}
		}		
		System.out.println("�ִ����� : " + gcd);
	
		
		//�ּҰ����
		// 	num1	num2
		//	3		4
		
		//	3		4
		//	6		8
		//	9		12
		//	12		16
		//	15
		
		int max = num1>num2 ?num1 :num2;

		// �־��� ���� �� ū �����κ��� 1�� ������Ű�鼭
		// �� ���� ��ο��� ������ �������� ù��° �� -> �ּҰ����
		for(int i=max; ; i++) {
			if( i%num1==0 && i%num2==0 ) {
				System.out.println("�ּҰ���� : " + i);
				break;
			}
		}
		
	}
}















