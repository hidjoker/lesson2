package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		//  boolean add(E e); // E == Object �� ��޵�
		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);

		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);

//		list2.add(123);	// String Ÿ�Ը� ����
//		list3.add(true); // Integer Ÿ�Ը� ����
	
		list1.add("A");
		list1.add(111);
		
		list2.add("B");
		
		String str1 = (String)list1.get(0);
		int num1 = (Integer)list1.get(1);
		
		String str2 = list2.get(0);
		
	}
}
