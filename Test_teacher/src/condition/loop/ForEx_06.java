package condition.loop;

public class ForEx_06 {
	public static void main(String[] args) {
		// ������ 2���� ���
		
		// ��� ����)
		//	2 x 1 = 2
		//	2 x 2 = 4
		//	...
		//	2 x 8 = 16
		//	2 x 9 = 18
		
		//�ݺ�Ƚ�� : 9��
		//�ݺ����� : 1~9

		//�ʱ�� : int i=1;
		//���ǽ� : i<=9; 
		//������ : i++
		
		for(int i=1; i<=9; i++) {
			System.out.println("2 x "+i+" = "+(2*i));
		}

	}
}














