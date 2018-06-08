package apiTest;

public class StringBufferEx {
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
	
		System.out.println( str.length() );//0
		
		System.out.println( sb.length() );//0
		System.out.println( sb.capacity() );//16
		
		System.out.println("---sb2---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("len : "+sb2.length());//5
		System.out.println("cap : "+sb2.capacity());//16+5 = 21
		System.out.println("sb : "+sb2);
	
		System.out.println("---sb3---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("len : "+sb3.length());//0
		System.out.println("cap : "+sb3.capacity());//5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Apple추가--");
		sb3.append("Apple");
		System.out.println("len : "+sb3.length());//5
		System.out.println("cap : "+sb3.capacity());//5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Banana추가--");
		sb3.append("Banana");
		System.out.println("len : "+sb3.length());//
		System.out.println("cap : "+sb3.capacity());//
		System.out.println("sb : "+sb3);
		
		
		System.out.println("\n-----insert()-----");
		// 5번째인덱스(5 offset)에 "Orange" 넣고 출력
		sb3.insert(5, "Orange");
		System.out.println("sb : " + sb3);
		
		
		System.out.println("\n-----deleteCharAt()-----");
		// 3번째 인덱스 삭제하고 출력
		sb3.deleteCharAt(3);
		System.out.println("sb : " + sb3);
		
		
		System.out.println("\n-----delete()-----");
		// delete(0, 3) 호출 후 출력
		sb3.delete(0, 3);
		System.out.println("sb : " + sb3);
	
		
		System.out.println("\n-----substring()-----");
		// substring(1,7) 호출

		// length, capacity 확인
		// sb출력
		// substring(1,7) 결과 출력
		
		String subStr = sb3.substring(1, 7);
		System.out.println("len : " + sb3.length()); // 25
		System.out.println("cap : " + sb3.capacity()); // 34
		System.out.println("sb : " + sb3);
		System.out.println("subStr : " + subStr);
		
		
		System.out.println("\n-----trimToSize()-----");
		// trimToSize() 호출
		sb3.trimToSize();

		// length, capacity 확인
		System.out.println("len : " + sb3.length()); // 25
		System.out.println("cap : " + sb3.capacity()); // 25
		
		
		System.out.println("\n-----reverse()-----");
		// reverse() 호출 후 결과 확인
		sb3.reverse();
		System.out.println("sb : " + sb3);

	}
}












