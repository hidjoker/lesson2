
package manage;

public class ForEach {

	public static void main(String[] args) {
		
		// for each
		//	�迭�� ��� ��Ҹ� �ѹ��� �����ϱ� ���ϰ� ���ִ� �ݺ���

		// for( �迭���Ÿ�� ������ : �迭�� ) {
		//
		//		�迭�� ��� ��Ҹ� ������ �ѹ��� ��� �ڵ� �ݺ�
		//
		// }

		
		
		int[] arr = {1,2,3,4,5};
		
		// for each loop
		for(int num : arr) {
			System.out.println(num);
		}
		
		for(int num : arr) {
			num += 100;
		}
		
		System.out.println("--------");
		
		for(int num : arr) {
			System.out.println(num);
		}


		// �Ϲ� for loop
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		

		
	}
}










