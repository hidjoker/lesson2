package collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionEx_09_Set {
	public static void main(String[] args) {

//		Set set = new TreeSet();
		TreeSet tree = new TreeSet();
		
		tree.add("Banana");
		tree.add("Cherry");
		tree.add("Durian");
		tree.add("Apple");
		
		System.out.println(tree);
		
		System.out.println("-----");
		Set head = tree.headSet("Cherry");
		System.out.println(head);
		
		System.out.println("-----");
		Set tail = tree.tailSet("Cherry");
		System.out.println(tail);
		
		System.out.println("-----");
		Set sub = tree.subSet("Banana", "Cherry");
		System.out.println(sub);
		
	}
}
