package condition;

import java.util.Scanner;

public class IfEx_03_Quiz {
	public static void main(String[] args) {

		// if ���
		// ���� �ϳ��� �Է¹޾�
		// ����� ��� "���"��� ����ϰ�
		// ������ ��� "����"��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Input Number : ");
		num = sc.nextInt();

		if(num>0) {
			System.out.println(num +"��/�� ���");
		}

		if(num<0) {
			System.out.println(num +"��/�� ����");
		}

		if(num==0) {
			System.out.println("�Է��� ���ڴ� 0�Դϴ�");
			System.out.println("0�� ������ ���ڸ� �־��ּ���");
		}
		
	}
}












