package condition;

import java.util.Scanner;

public class IfElseIfElseEx {
	public static void main(String[] args) {
		
		//	if(���ǽ�1) {
		//		//���ǽ�1�� ���� �� ����
		//	} else if(���ǽ�2) {
		//		//���ǽ�1�� �����̰�
		//		//���ǽ�2�� ���� �� ����
		//	} else if(���ǽ�3) {
		//		//���ǽ�1�� �����̰�
		//		//���ǽ�2�� �����̰�
		//		//���ǽ�3�� ���� �� ����
		//	} else {
		//		// ���� ��� ���ǽ��� ������ �� ����
		//	}
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Input Number : " );
		num = sc.nextInt();
		
		if( num>0 ) {
			// num�� ����� ��� ����
			System.out.println("num["+num+"]��/�� ���");
		} else if( num<0 ) {
			// num�� ����� �ƴϰ�
			// num�� ������ �� ����
			System.out.println("num["+num+"]��/�� ����");
		} else {
			// num�� ����� �ƴϰ�
			// num�� ������ �ƴ� �� ����
			System.out.println("num["+num+"]��/�� 0");
		}
		
	}
	
}


