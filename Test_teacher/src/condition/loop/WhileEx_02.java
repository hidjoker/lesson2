package condition.loop;

public class WhileEx_02 {
	public static void main(String[] args) {
		
		// while �� �̿�

		// 1��. 0~9���� ���
		//�ݺ�Ƚ�� : 10�� 
		//�ݺ����� : 0~9

		//�ʱ�� : i=0;
		//���ǽ� : i<10;
		//������ : i++;
		
		int i=0;//�ʱ��
		while(i<10) { //���ǽ�
			
			// ���� �ڵ�
			System.out.println(i);
			
			i++;//������
		}
		System.out.println("-----");
		
		// 2��. Hello 6�� ����ϱ�
		i=0;//�ʱ��
		while(i<6) { //���ǽ�
			
			// ���� �ڵ�
			System.out.println("Hello");
			
			i++;//������
		}
		System.out.println("-----");
		
		// 3��. 5 4 3 2 1 0 ���� ����ϱ�
		//�ݺ�Ƚ�� : 6
		//�ݺ����� : 5 -> 0

		//�ʱ�� : i = 5;
		//���ǽ� : i >= 0
		//������ : i--;
		
		i = 5;
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
	}
}















