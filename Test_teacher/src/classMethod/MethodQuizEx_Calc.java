package classMethod;

import java.util.Scanner;

import classBasic.Calculator;

public class MethodQuizEx_Calc {
	public static void main(String[] args) {
		// ���� 2�� �Է�
		// ������ ��ȣ 1�� �Է�
		
		// �����ڱ�ȣ�� ���� ���� ����
		
		// ��� ���
		
		
		
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		while(true) {
			
			// ������ ��ȣ �Է� �ޱ�
			System.out.print("������ �Է� >> ");
			char oper = sc.nextLine().charAt(0);
			
			//�߸��� ������ �Է����� �� ó��
			if( oper!='+' && oper!='-' && oper!='*' && oper!='/' ) { 
				System.out.println("�߸��� �����ȣ �Է�!!");
//				return;	// �޼ҵ� �ߴ�
				break;	// �ݺ��� �ߴ�
			}
			
			// ���� 2�� �Է� �ޱ�
			System.out.print("ù��° ���� �Է� >> ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� �Է� >> ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); //���ۺ���
			
			// TEST
	//		System.out.println("[TEST] "+oper+","+num1+","+num2);
			
			// ������Ʈ
			switch (oper) {
			case '+':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+c.sum(num1, num2));
				break;
	
			case '-':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+(num1-num2));
				break;
	
			case '*':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+(num1*num2));
				break;
	
			case '/':
				System.out.print(
				"\n  RESULT >> "+num1+oper+num2+"=");
				System.out.printf("%.2f", (num1/(double)num2));
				System.out.println();
				break;
	
	//		default:
	//			System.out.println("�߸��� �����ȣ �Է�!!");
			}
		}
	}
}
















