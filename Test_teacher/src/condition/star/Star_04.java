package condition.star;

public class Star_04 {
	public static void main(String[] args) {
		
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		
		// 각 행 - 바깥쪽 for문 - i, 5회, 0~4 - 5줄 - 한번에 한줄 
		// 각 열 - 안쪽 for문 - j, 5회, 0~4 - 1, 2, 3, 4, 5
		
		for(int i=0; i<5; i++) {	// 각 행
			for(int j=0; j<5; j++) {	// 하나의 행
				System.out.print(i+1);
			}
			System.out.println();
		}
		
	}
}












