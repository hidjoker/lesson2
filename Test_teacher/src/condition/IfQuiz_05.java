package condition;

import java.util.Scanner;

public class IfQuiz_05 {
	// + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ� ����� ��� ���

	public static void main(String[] args) {
		// 1. ������ ���� ���� ����
		int score1, score2, score3;
		
		// 2. �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Score1 : ");
		score1 = sc.nextInt();
		System.out.print("Input Score2 : ");
		score2 = sc.nextInt();
		System.out.print("Input Score3 : ");
		score3 = sc.nextInt();
//		System.out.println("[TEST] "+score1+","+score2+","+score3);
		
		// 3. �հ� ���ϱ�
		int sum = score1 + score2 + score3;
		
		// 4. ��� ���ϱ�
		double avg = sum / (double)3;
		
//		System.out.println("[TEST] " + sum + "," + avg);
		
		// 5. ����� ��� ���ϱ�
		char grade = '\0'; // �� ����, �ƽ�Ű�ڵ尡 0 �� ����
		if( avg>=90 ) {
			grade = 'A';
		} else if( avg>=80 ) {
			grade = 'B';
		} else if( avg>=70 ) {
			grade = 'C';
		} else if( avg>=60 ) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 6. ��� ����ϱ�
		System.out.println(grade + " ����Դϴ�");
	}
}










