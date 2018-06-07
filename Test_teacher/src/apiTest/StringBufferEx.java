package apiTest;

public class StringBufferEx {
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
	
		System.out.println( str.length() );//0
		
		System.out.println( sb.length() );//0
		System.out.println( sb.capacity() );//16
		
		System.out.println("---sb2---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("len : "+sb2.length());//5
		System.out.println("cap : "+sb2.capacity());//16+5 = 21
		System.out.println("sb : "+sb2);
	
		System.out.println("---sb3---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("len : "+sb3.length());//0
		System.out.println("cap : "+sb3.capacity());//5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Apple�߰�--");
		sb3.append("Apple");
		System.out.println("len : "+sb3.length());//5
		System.out.println("cap : "+sb3.capacity());//5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Banana�߰�--");
		sb3.append("Banana");
		System.out.println("len : "+sb3.length());//
		System.out.println("cap : "+sb3.capacity());//
		System.out.println("sb : "+sb3);
		
		System.out.println("-----insert()-----");
		// 5��°�ε���(5 offset)�� "Orange" �ְ� ���
		
		System.out.println("-----deleteCharAt()-----");
		// 3��° �ε��� �����ϰ� ���
		
		System.out.println("-----delete()-----");
		// delete(0, 3) ȣ�� �� ���
	
		System.out.println("-----substring()-----");
		// substring(1,7) ȣ��

		// length, capacity Ȯ��
		// sb���
		// substring(1,7) ��� ���
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() ȣ��

		// length, capacity Ȯ��

		System.out.println("-----reverse()-----");
		// reverse() ȣ�� �� ��� Ȯ��

	}
}












