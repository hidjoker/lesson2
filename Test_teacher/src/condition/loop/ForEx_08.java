package condition.loop;

public class ForEx_08 {
	public static void main(String[] args) {

		// if ��ø
		int num = 10;
		if( num >= 1 ) {
			System.out.println("1���� ũ�ų� ����");
			
			if( num <= 100) {
				System.out.println("1~100�� ����");
			}
			
			System.out.println("1���� ũ�ų� ����");
		}
		

		
//		System.out.println("------------------");
		// ��ø for loop

		// �߰� �������,
		//	�ٱ��� for���� �ݺ��ڰ� �����Ȼ��·�
		//	���� for���� ���Ӱ� �ݺ��ȴ�	
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("i:"+i+",j:"+j);// 9��
			}
			
			System.out.println("----------");// 3��
		}
		
	}
}














