package operator;

public class Operator_Quiz_01_tip {
	public static void main(String[] args) {
		// ���� ��
		double avg = 3.12541245;
		// �Ҽ��� ��°�ڸ����� ǥ���� ��
		double res = Math.round( avg * 100 )/(double)100;
		
		// 0. ���� ������
		System.out.println("���� �� : " + avg);
		
		// 1. ���� ������ ����  �Ҽ��� ��°�ڸ����� �����κ����� �ø��� 
		System.out.println("avg*100 : " + (avg*100) );
		
		// 2. �Ҽ��� ���� �ݿø� -> �Ҽ������� ���ֱ�
		System.out.println("Math.round : "
				+ Math.round(avg * 100) );
		
		// 3. �����κ����� �ö󰬴� 2�ڸ� ������(100���� ������)
		System.out.println("��� : "
				+ Math.round( avg * 100 )/(double)100 );
	}
}




