package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
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
				System.out.println(com); //TEST
				
				System.out.print("���������� �Է�(1~3) : ");
				user = sc.nextInt();
			} while(user<1 || user>3 );
			
			System.out.println("����� : " + toHangul(user) );
			System.out.println("��ǻ�� : " + toHangul(com) );
			
			if( user==com ) {
				System.out.println("���!");
			} else {
				if( user==1 ) { //����� : ����
					if( com==2 ) System.out.println("��ǻ�� ��!");
					else System.out.println("���� ��!");
					
				} else if( user==2 ) { //����� : ����
					if( com==1 ) System.out.println("���� ��!");
					else System.out.println("��ǻ�� ��!");
					
				} else { //����� : ��
					if( com==1 ) System.out.println("��ǻ�� ��!");
					else System.out.println("���� ��!");
				}
			} // if end - ���������� �º�
			
			System.out.println();
		} // while end - ���ѹݺ�
		
	}
	
	public static String toHangul(int num) {
		if(num==1)	return "����";
		else if(num==2)	return "����";
		else	return "��";
	}
}










