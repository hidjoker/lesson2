package condition.loop;

import java.util.Scanner;

public class WhileEx_03_Quiz {
	public static void main(String[] args) {

//		���� �ϳ��� �Է¹ް�
//		1���� �Է��� ���ڱ���
//		��� ���ڸ� ���ؼ� ����ϱ�
//		(while �̿�)
		
//		+ �����غ� ��
//		 - �ʿ��� ����(�� ����)
//		 - �ݺ� ���� �ʱ�ȭ�ؾ��ϴ� ����
//		 - �ݺ� �� ������ ���(����)
//		 - �ݺ� �� ��� ó��(���)

//		1. ���� �� �� ���� ����
		int input;
		
//		2. �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ������ ���� ���ڴ�? ");
		input = sc.nextInt();
		
//		3. 1~�Է��� ��  ���� ���ϱ�
		int total = 0;
		//�ݺ�Ƚ�� : �Է��� ����ŭ (input)
		//�ݺ����� : 1~input

		//�ʱ�� : int i=1;
		//���ǽ� : i<=input
		//������ : i++;
		int i=1;
		while(i<=input) {
			total += i;
			
			i++;
		}
		
//		4. ����ϱ�
		System.out.println("1���� "+input+"������ �� : "+total);
	}
}















