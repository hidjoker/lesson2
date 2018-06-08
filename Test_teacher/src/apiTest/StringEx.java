package apiTest;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";
		// String str = new String("Hello Java");
		
		System.out.println("---length()---");
		System.out.println("str의 길이 : " + str.length());
		
		System.out.println("---toUpperCase()---");
		// 모두 대문자로 변환한 upperCase를 출력
		System.out.println("toUpperCase() : "
				+ str.toUpperCase() );
	
		System.out.println("-----toLowerCase()-----");
		// 모두 소문자로 변환한 lowerCase를 출력
		System.out.println("toLowerCase() : "
				+ str.toLowerCase() );
		
		System.out.println("-----charAt()-----");
		// "Hello Java"에서 J 값 얻어서 char변수 ch에 저장,출력
		char ch = str.charAt(6);
		System.out.println("charAt(6) : " + str.charAt(6));
		
		
		System.out.println("-----concat()-----");
		// str에 ", HIHIHI" 라는 문자열 추가하고 출력
		String concat = str.concat(", HIHIHI");
		System.out.println("concat() : " + concat);
		
		String concat2 = str+", HIHIHI";
		System.out.println("문자열 + : " + concat2);
		
		System.out.println("-----replace()-----");
		// 'l'을 'X'로 변환
		String replace1 = str.replace('l', 'X');
		System.out.println("replace() : " + replace1);
				
		// "ava"를 "AVA"로 변환
		String replace2 = str.replace("ava", "AVA");
		System.out.println("replace() : " + replace2);
		
		
		System.out.println("-----substring()-----");
		// "Ja" 찾아서 출력
		// Hello Java
		String sub = str.substring(6, 8);
		System.out.println("substring() : " + sub);
		
		
		System.out.println("-----contains()-----");
		// str에 "Java"가 있는지 판별
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
		// 스트림
		// I/O
		
	}
}













