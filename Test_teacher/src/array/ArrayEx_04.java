package array;

public class ArrayEx_04 {
	public static void main(String[] args) {

		// ���ڿ�
		// ���� �迭
		//char[] ch_arr;
		
		String str = "Apple";
		//	'A' 'p' 'p' 'l' 'e'
		
		System.out.println( str.charAt(0) );
		System.out.println( str.charAt(3) );
		
		// ���ڿ� ����
		System.out.println("length() : " + str.length());
		
		char[] c_arr = str.toCharArray();
		System.out.println("length : " + c_arr.length);
		
	}
}












