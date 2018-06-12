package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
	// List<Object> 와 List<Integer>는 관계가 없기 때문에
	// <Object> 대신 <?>를 사용해야만 한다
//	public static void display(List<Object> l) {
	public static void display(List<?> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30);
		display(list);
		
		List<String> strList=Arrays.asList("A","B","C");
		display(strList);
		
		
		
		Object a = new Object();
		Integer b = new Integer(10);
		a = b;	// 자식클래스타입은 부모클래스타입이다
		
		List<Object> o = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
//		o = l;	// 자식제네릭타입과 부모제네릭타입은 무관하다

		
	}
}














