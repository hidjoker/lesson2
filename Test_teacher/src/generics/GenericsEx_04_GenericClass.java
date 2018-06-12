package generics;

// Class04 정의

//	T 제네릭 적용
//	멤버필드 T obj 생성
//	getter, setter 생성

class Class04<T> {
	private T obj;
	
	public <K> void display(K obj) {
		System.out.println("데이터  : " + obj);
	}
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class GenericsEx_04_GenericClass {
	public static void main(String[] args) {
		
		Class04<String> c04 = new Class04<>();
		
		c04.setObj("Apple");
		
		String fruit = c04.getObj();
		
		System.out.println("과일 : " + fruit);
		
		
	}
}














