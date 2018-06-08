package apiTest;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";
		// String str = new String("Hello Java");
		
		System.out.println("---length()---");
		System.out.println("str�� ���� : " + str.length());
		
		System.out.println("---toUpperCase()---");
		// ��� �빮�ڷ� ��ȯ�� upperCase�� ���
		System.out.println("toUpperCase() : "
				+ str.toUpperCase() );
	
		System.out.println("-----toLowerCase()-----");
		// ��� �ҹ��ڷ� ��ȯ�� lowerCase�� ���
		System.out.println("toLowerCase() : "
				+ str.toLowerCase() );
		
		System.out.println("-----charAt()-----");
		// "Hello Java"���� J �� �� char���� ch�� ����,���
		char ch = str.charAt(6);
		System.out.println("charAt(6) : " + str.charAt(6));
		
		
		System.out.println("-----concat()-----");
		// str�� ", HIHIHI" ��� ���ڿ� �߰��ϰ� ���
		String concat = str.concat(", HIHIHI");
		System.out.println("concat() : " + concat);
		
		String concat2 = str+", HIHIHI";
		System.out.println("���ڿ� + : " + concat2);
		
		System.out.println("-----replace()-----");
		// 'l'�� 'X'�� ��ȯ
		String replace1 = str.replace('l', 'X');
		System.out.println("replace() : " + replace1);
				
		// "ava"�� "AVA"�� ��ȯ
		String replace2 = str.replace("ava", "AVA");
		System.out.println("replace() : " + replace2);
		
		
		System.out.println("-----substring()-----");
		// "Ja" ã�Ƽ� ���
		// Hello Java
		String sub = str.substring(6, 8);
		System.out.println("substring() : " + sub);
		
		
		System.out.println("-----contains()-----");
		// str�� "Java"�� �ִ��� �Ǻ�
		System.out.println( str.contains("Java") );

		
		System.out.println("---trim()---");
		String trim = "   AABASDF  123123    ";
		System.out.println( trim.trim() );
		
		
		System.out.println("---split()---");
		String splitData = "1,2,3,4,5";
		
		String[] splitted = splitData.split(",");
		
		for(String s : splitted) {
			System.out.println(s);
		}
		
		
		System.out.println("---getBytes()---");
		
		byte[] bytes = str.getBytes();
		
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		// ��Ʈ��
		// I/O
		
	}
}













