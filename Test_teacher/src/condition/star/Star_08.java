package condition.star;

public class Star_08 {
	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		// �� �� - �ٱ��� for�� - i, 5ȸ, 0~4 - �� ��
		// �� �� - ���� for�� - j
		//	1ȸ - 0~0
		//	2ȸ - 0~1
		//	3ȸ - 0~2
		//	4ȸ - 0~3
		//	5ȸ - 0~4
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}












