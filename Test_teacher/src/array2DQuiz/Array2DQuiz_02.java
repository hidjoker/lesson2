package array2DQuiz;

public class Array2DQuiz_02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// �Էº�
		int cur = 1;
		for( int i=0; i<5; i++ ) {	// i��, 0~4, 1������, 5��
			for( int j=4; j>=0; j-- ) {	// j��, 4~0, 1������, 5��
				arr[i][j] = cur++;
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}





