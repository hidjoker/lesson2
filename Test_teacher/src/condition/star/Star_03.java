package condition.star;

public class Star_03 {
	public static void main(String[] args) {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		// 각 행 - 바깥쪽 for문 - 5회, 0~4 - 5줄출력(개행)
		// 각 열 - 안쪽 for문 - 5회, 0~4 - 5개 '*' 출력
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}










