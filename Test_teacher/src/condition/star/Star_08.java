package condition.star;

public class Star_08 {
	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		// 각 행 - 바깥쪽 for문 - i, 5회, 0~4 - 각 줄
		// 각 열 - 안쪽 for문 - j
		//	1회 - 0~0
		//	2회 - 0~1
		//	3회 - 0~2
		//	4회 - 0~3
		//	5회 - 0~4
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}












