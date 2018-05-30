package classBasic;

public class MainClass_01 {
	public static void main(String[] args) {
		
		ClassEx ce;	// ClassEx타입 객체 변수 ce 선언
		
		ce = new ClassEx();	// ClassEx 객체 생성
		
		ce.num = 100;
		ce.str = "Apple";

//		System.out.println("num : " + ce.num);
//		System.out.println("str : " + ce.str);

		// 수행코드
		ce.display();	// 메소드 사용, 메소드 호출, method call
		
//		MainClass_01 mc = new MainClass_01();
//		mc.main(null);
		
	}
	
}















