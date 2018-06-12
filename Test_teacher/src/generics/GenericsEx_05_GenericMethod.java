package generics;

class Class05 {
	
	public <T> T out(T obj) {
		System.out.println("제네릭 메소드");
		System.out.println("데이터 : " + obj);
		
		T data = obj;
		
		return obj;
	}
	
	public <T> void display(Integer num) {
		
		T data;

		data = (T)num;
		
	}
}

public class GenericsEx_05_GenericMethod {
	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		
		c05.out(123);	// 자동으로 T 가 Integer로 결정됨
		c05.out("Alice"); // 자동으로 String으로 결정
		
		c05.<Integer>out(555); // 명시적으로 T를 Integer로 결정
//		c05.<Integer>out("Bob"); // String 전달 불가
		
		c05.<String>display(8989);
		
	}
}














