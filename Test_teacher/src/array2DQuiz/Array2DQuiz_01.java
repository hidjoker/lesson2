package array2DQuiz;

public class Array2DQuiz_01 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		
		// 1번 문제 //
		
		
		// 입력부
		int cur = 1;
		for( int i=0; i<5; i++ ) {	// i행
			for( int j=0; j<5; j++ ) {	// j열
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
		
		
		System.out.println("--------------");
		// 2번 문제 //
		
		// 입력부
		
		int cur2 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=4 ; j>=0 ; j--) {
				arr[i][j] = cur2++;
								
			}
		}
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
				
		System.out.println("--------------");
		// 3번 문제 //
				
		// 입력부
				
		int cur3 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[j][i] = cur3++;
								
			}
		}
				
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------");
		// 4번 문제 //
		
        // 입력부
		int cur4 = 1;
		for( int i=0; i<5; i++ ) {	// i행
			for( int j=4; j>=0; j-- ) {	// j열
				arr[j][i] = cur4++;				
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		// 5번 문제 //
		
		int cur5 = 1;
		for(int i=0 ; i<5 ; i++) {
			
			
			for(int j=0 ; j<5-i ; j++) {				
				
			    arr[j+i][4-i]= cur5++;
			}
					
			for(int j=0 ; j<4-i ; j++) {
				
					
				arr[4-i][4-i-j]= cur5++;
				
			}
		
		}			
					
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}			

					
					
					
					
							
				
		
		
		

	} 
}






