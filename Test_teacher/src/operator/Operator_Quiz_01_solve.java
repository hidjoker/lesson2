package operator;

import java.util.Scanner;

public class Operator_Quiz_01_solve {
	public static void main(String[] args) {
		// ���� ����
		int kor;	//��������
		int eng;	//��������
		int math;	//��������
		
		int sum;	//����
		double avg;	//���
		
		// �Է� ��ü Scanner
		Scanner sc = new Scanner(System.in);
		
		// ���� �Է�
		System.out.print("Input Korean : ");
		kor = sc.nextInt();
		System.out.print("Input English : ");
		eng = sc.nextInt();
		System.out.print("Input Mathematic : ");
		math = sc.nextInt();

		// 3���� �Է� TEST - �׽�Ʈ�Ϸ�
//		System.out.println("[TEST] "+kor+","+eng+","+math);

		// ����, ��� ���
		sum = kor + eng + math;	//���� ���
		avg = sum / (double)3;	//��� ���
		
		// ����,��� ���� TEST
//		System.out.println("[TEST] " + sum + ", " + avg);
		
		// ���
		System.out.println("--------���--------");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		
		System.out.println("���� : " + sum);
		
		// 1. ���� ������� ���
//		System.out.println("��� : " + avg);
		
		// 2. �Ҽ��� ��°�ڸ� ������� ��� - 1
		System.out.println("��� : "
				+ Math.round(avg*100)/(double)100 );

		// 3. �Ҽ��� ��°�ڸ� ������� ��� - 2
		System.out.printf("��� : %.2f", avg);
		// printf - print formatted
		//	���Ĺ��ڸ� �̿��� ���ڿ� ���
		//	���Ĺ��� - %s(���ڿ�) %d(10����) %c(����) %f(�Ǽ�)
	}
}
