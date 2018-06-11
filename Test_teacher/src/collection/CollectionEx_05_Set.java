package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEx_05_Set {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(22);
		set.add(33);
		set.add(11);
		
		System.out.println(set);
		
		System.out.println("-----");
		System.out.println("크기 : " + set.size());
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("22가 있는가? " + set.contains(22));
		System.out.println("33제거 : " + set.remove(33));
		System.out.println("55제거 : " + set.remove(55));
		System.out.println(set); //최종출력
		
		System.out.println("-----");
//		set.clear();// set 전부 삭제
//		System.out.println("비었는가? " + set.isEmpty());
//		System.out.println(set);
		
		List list = Arrays.asList(11,22,33,44,55);
		set.removeAll(list);
		System.out.println(set);
		
	}
}















