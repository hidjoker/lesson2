package array;

public class ArrayEx_03 {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		// 배열의 길이, 크기, 요소의 갯수
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		arr[5] = 99; //ArrayIndexOutOfBoundsException
//		arr[-1] = 88; //ArrayIndexOutOfBoundsException
		
//		int[] arr2 = new int[-10]; //NegativeArraySizeException
		
	}
}












