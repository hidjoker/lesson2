package condition;

import java.util.Scanner;

public class ControlQuiz_03 {
//	- � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
//	��� = � ���� ������ ���� �� �ִ� ��
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		// 1���� �־��� ���ڱ��� 1�� ������Ű�� ��� ������ �������� ��
		// �������� 0�� ���ڵ�(���)�鸸 ����Ѵ�
		for(int i=1; i<=num; i++) { // 1 ~ num
			if( num%i==0 )
				System.out.println(i);
		}
		
	}
}















