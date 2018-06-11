package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx_10_Map {
	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println(map);
		
		System.out.println("-----");
		System.out.println( map.get(3) );
		
		System.out.println("-----");
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D"));
	
		System.out.println("-----");
		map.put(2, "Orange");	// 키 중복 X
		map.put(4, "Apple");	// 값 중복 O
		System.out.println(map);

		System.out.println("-----");
		System.out.println( map.containsKey(5) );
		System.out.println( map.containsValue("Apple") );
		
		if( !map.containsKey(5) ) {
			map.put(5, "Pineapple");
		}
	
		if( map.containsKey("D") ) {
			System.out.println( map.get("D") );
		}
		
		if( map.containsKey("555") ) {
			String str = (String) map.get(555);
			System.out.println( str.length() );
		}
		
		System.out.println("-----");
		System.out.println("size : " + map.size());
		
		System.out.println("-----");
		System.out.println("비었는가? " + map.isEmpty());
		
		System.out.println("-----");
		map.remove(3);
		System.out.println(map);
		
		System.out.println("-----");
		map.remove(2, "Apple");
		System.out.println(map);
		
		System.out.println("-----");
		map.put(10, null);
		map.put(null, "Bob");
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("-----");
		Set keySet = map.keySet();
		Set entrySet = map.entrySet();
		
		System.out.println("key : "+keySet);
		System.out.println("entry : "+entrySet);
	
	}
}
