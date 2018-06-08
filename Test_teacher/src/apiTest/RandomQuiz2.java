package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz2 {
	public static void main(String[] args) {
		
		// ���������� ���� �����
		
		// int user : ������Է� (1~3)
		// int com : ��ǻ�� ���� (1~3)
		
		// 1 : ����, 2 : ����, 3 : ��
		
		// I. Random�� �̿��Ͽ� com�� �� ����
		// II. user�� �Է¹ޱ�
		// III. com, user �� (���������� �º�)
		// IV. ��� ��� (����)
		
		// V. I~IV �ݺ�..
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int user; // �����
		int com; // ��ǻ��
		
		while(true) {
			com = ran.nextInt(3)+1;
			
			do {
//				System.out.println(com); //TEST
				System.out.print("���������� �Է�(1~3) : ");
				user = sc.nextInt();
			} while(user<1 || user>3 );
			
			// �� ����
			// ���� 1
			// ���� 2
			// �� 4
			if(user==3) user++;
			if(com==3)	com++; 
			
			System.out.println("����� : " + toHangul(user) );
			System.out.println("��ǻ�� : " + toHangul(com) );

			int res = user - com;
			
			if( res == 0 ) { // ���
				System.out.println("���");
			} else if( res==-3 || res==1 || res==2 ) {
				System.out.println("����� ��");
			} else if( res==-1 || res==-2 || res==3) {
				System.out.println("��ǻ�� ��");
			}

			System.out.println();
		} // while end - ���ѹݺ�
		
	}
	
	public static String toHangul(int num) {
		if(num==1)	return "����";
		else if(num==2)	return "����";
		else	return "��";
	}
}










