package condition.loop;

public class ForEx_07 {

	public static void main(String[] args) {
		
	// ù���� 10���� �����ϰ�,
	// ���������� ������ 2�踦 �����ϴ� �������
    // ����(15��) ���� ������ �ݾ���?

		
		// �ݺ�Ƚ�� : 14��
		// �ݺ����� : 2~15

		// �ʱ�� : n=2
		// ���ǽ� : n<=15
		// ������ : n++
		
		
		// 1. ����
		
		int won=10, sum=10;
		
		
		
		for(int n=2 ; n <= 15 ; n++) {
		
			won *= 2;
			sum += won;
			
		}
		
		System.out.println("������ �ݾ��� : " + sum + "��");
	}
	
}
