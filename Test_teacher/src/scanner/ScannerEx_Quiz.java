package scanner;

import java.util.Scanner;

public class ScannerEx_Quiz {

	public static void main(String[] args) {
		//1. �������� ���� ����
		String name; //�̸�
		int age; //����
		String gender; //����
		double height ; //Ű
	
		//2. ������ �˸´� Scanner �޼ҵ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		name = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		// �Է� ���� ���� �߻�!!
	    // Scanner�� nextLine()�� ������ nextXXX() �迭
		// �޼ҵ带 ȣ���ϸ� ���ۿ��� '���๮��(\r\n)'��
		// ó������ �ʰ� ���ܵΰ� �ȴ�
		// ���� nextLine()�� ����� ���
		// ������ ó������ ���� '���๮��(\r\n)'�� scan�ع�����
		// ����� �Է��� ���� ���� ��Ȳ
	
		sc.nextLine(); //�ذ�1. ������ \r\n�� �Է¹޾� ������
		sc.skip("\r\n"); //�ذ�2. ������ \r\n�� ��� �����
				
		
		System.out.print("���� �Է� : ");
		gender = sc.nextLine();
		
		System.out.print("Ű �Է� : ");
		height = sc.nextDouble();
		
		
		//3. ���
		System.out.println("--------------------");
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("���� : "+ gender);
		System.out.println("Ű : "+height);
		
		
		
	
	
	}
	
	
}
