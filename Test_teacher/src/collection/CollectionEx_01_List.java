package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx_01_List {
	public static void main(String[] args) {
		
		// Ž��(��ȸ), ����/�߰�, ����, ����
		
		List list;
		list = new ArrayList();
		
		System.out.println("---����---");
		list.add("Apple"); // ����
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list);
		
		System.out.println("\n---����(2)---");
		list.remove(2); // ����
		System.out.println(list);
	
		System.out.println("\n---��ȸ(1)---");
		System.out.println( list.get(1) );
		
		System.out.println("\n---����---");
		list.add(1, "Tomato");
		System.out.println(list);
		
		System.out.println("\n---contains()---");
		System.out.println( list.contains("Tomato") );
		
		System.out.println("\n---isEmpty()---");
		System.out.println( list.isEmpty() );
		
		System.out.println("\n---clear()---");
		list.clear();
		System.out.println(list);
		
		System.out.println("\n----------");
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		System.out.println("--------");
		for(Object s : list) {
			System.out.println(s);
		}
		
		
		System.out.println("--------");
		list.add(100);
		list.add(true);
		list.add(123.456);
		System.out.println(list);
	}
}














