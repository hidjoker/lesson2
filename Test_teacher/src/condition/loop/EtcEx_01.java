package condition.loop;

public class EtcEx_01 {
	public static void main(String[] args) {
		
		// break
		//		if�� ������ ����� �ߴܽ�Ų��
		//		break�ڵ尡 ���Ե� �߰�ȣ�� ��� 1���� �ߴܽ�Ŵ
		
		// continue
		//		�ݺ������� �����
		//		���� �ݺ��� �����Ѵ�
		//		for - ���������� �̵�
		//		while - ���ǹ����� �̵�
		//		do-while - ���ǹ����� �̵�
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			if( i == 5 ) {
				break;
			}
		}
		System.out.println("-----");

		for(int i=0; i<10; i++) {
			if( i%2 == 0 ) { // ¦��
				continue;
			}

			System.out.println(i);
		}
		
	}
}












