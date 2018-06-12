package generics;

public class GenericsEx_08_Extends {
	
	public static void main(String[] args) {
//		print(123);
//		print(345.345);
		print("Apple");
	}
	
	public static <T extends String> void print(T t1) {
		System.out.println("-----");
		System.out.println(t1);
	}
	
}














