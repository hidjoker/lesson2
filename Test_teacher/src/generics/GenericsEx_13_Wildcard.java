package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_13_Wildcard {

	public static void display(List<? super Integer> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		display(list);
		
		
	}
}














