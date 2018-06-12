package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
	// List<Object> �� List<Integer>�� ���谡 ���� ������
	// <Object> ��� <?>�� ����ؾ߸� �Ѵ�
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
		a = b;	// �ڽ�Ŭ����Ÿ���� �θ�Ŭ����Ÿ���̴�
		
		List<Object> o = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
//		o = l;	// �ڽ����׸�Ÿ�԰� �θ����׸�Ÿ���� �����ϴ�

		
	}
}














