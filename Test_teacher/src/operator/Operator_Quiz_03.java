package operator;

import java.util.Scanner;

public class Operator_Quiz_03 {
	public static void main(String[] args) {
		// �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		//	���ǿ����� ���
		
		// ex)
		// Input Number1 : 123		<- ���� �Է�
		// Input Number2 : 333		<- ���� �Է�
		// �� ū ���� 333 �Դϴ�
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		System.out.println("�� ū ���� " + (num1>num2 ?num1 :num2) + "�Դϴ�" );

	}
}







