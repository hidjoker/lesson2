package condition.loop;

public class ForEx_03 {
	public static void main(String[] args) {
		
		for( int num=10; num>=1; num-- ) {
			System.out.println(num);
		}
		// 반복횟수 : 10회
		// 반복구간 : 10 -> 1
		
		System.out.println("-----");
		for( int i=0; i<10; i+=2 ) {
			System.out.println(i);
		}
		// 반복횟수 : 5회
		// 반복구간 : 0 2 4 6 8
		
	}
}














