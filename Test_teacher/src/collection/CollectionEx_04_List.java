package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx_04_List {
	public static void main(String[] args) {

		// import ����ȭ : ctrl + shift + o
		
		List list = new Vector();
		list.add("Apple");
		list.add("Banana");

		Vector v = new Vector(2, 5);
		
		v.add("���");
		v.add("����");
		v.add("����");
		v.add("���ξ���");
		
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		
		System.out.println(v);
		
		System.out.println("--------");
		
		List llist = new LinkedList();
		llist.add("Apple");
		llist.add("Banana");
		llist.add("Cherry");
		
		System.out.println(llist);
		
	}
}














