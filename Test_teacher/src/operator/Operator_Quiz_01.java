package operator;

import java.util.Scanner;

public class Operator_Quiz_01 {
	
	public static void main(String[] args) {
		// ����, ����, ���� ���� �Է� �ޱ�
		// ���� ���
		// ��� ���
		
		// ���
		// ���� : xxx
		// ���� : xxx
		// ���� : xxx
		// ���� : xxx
		// ��� : xx.xxxxxxxxx
		
		// **���� �ټ��� �� �����
		
		// **�߰�����
		//	- ��� �Ҽ������� ��°�ڸ����� ǥ�������ϸ� �غ���
		//	- ã�ƺ����Ұ�...

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Kor Score : ");		
		int kor=sc.nextInt();
		System.out.print("Input Eng Score : ");
		int eng=sc.nextInt();
		System.out.print("input Math Score : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)( kor + eng + math) /3;
		
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+total);
		System.out.println("��� : "+(Math.round(avg*100))/(double)100);
		System.out.printf("���� :	%.2f",avg);
			
		
		
		
	
	
	
	}
}






