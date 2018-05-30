package array2DQuiz;

public class Array2DQuiz_02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 입력부
		int cur = 1;
		for( int i=0; i<5; i++ ) {	// i행, 0~4, 1씩증가, 5번
			for( int j=4; j>=0; j-- ) {	// j열, 4~0, 1씩감소, 5번
				arr[i][j] = cur++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}





