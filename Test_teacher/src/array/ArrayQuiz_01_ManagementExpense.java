package array;

import java.util.Scanner;

public class ArrayQuiz_01_ManagementExpense {
	
	// 1�δ� ������
	public static final int FEE = 13000;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] people = new int[6];	//������ �ο� + ���ο�
		int[] expense = new int[6];	//������ ������ + �Ѱ�����
		
		System.out.println("-- �� ���� �ο� �Է� --");
		
		for(int i=0; i<5; i++) {
			System.out.print( (i+1) + "���� �ο���? ");
			// �� ���� �ο� �Է�
			people[i] = sc.nextInt();
			
			people[5] += people[i];	// �� �ο� ���ϱ�
		}
//		people[5] = people[0] + people[1] + people[2] + people[3] + people[4]; 

		// ������ ���ϱ�
		for(int i=0; i<6; i++) {
			expense[i] = people[i] * FEE;
		}
		
		// ������ ���
		System.out.println("\n-- �� ���� ������ ��� --");
		for(int i=0; i<5; i++) {
			System.out.println(
				(i+1) + "���� ������ : "
				+ expense[i] + "��");
		}
		
		// ���� ���
		System.out.println("\n�� �ο��� " + people[5] + "�� �Դϴ�");
		System.out.println("�� ������� " + expense[5] + "�� �Դϴ�");
		
	}
}












