package array2DQuiz;

public class Array2DQuiz_01 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		
		// 1�� ���� //
		
		
		// �Էº�
		int cur = 1;
		for( int i=0; i<5; i++ ) {	// i��
			for( int j=0; j<5; j++ ) {	// j��
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
		
		
		System.out.println("--------------");
		// 2�� ���� //
		
		// �Էº�
		
		int cur2 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=4 ; j>=0 ; j--) {
				arr[i][j] = cur2++;
								
			}
		}
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
				
		System.out.println("--------------");
		// 3�� ���� //
				
		// �Էº�
				
		int cur3 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[j][i] = cur3++;
								
			}
		}
				
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------");
		// 4�� ���� //
		
        // �Էº�
		int cur4 = 1;
		for( int i=0; i<5; i++ ) {	// i��
			for( int j=4; j>=0; j-- ) {	// j��
				arr[j][i] = cur4++;				
			}
		}
		
		// ��º� - ���� ����
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		// 5�� ���� //
		
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






