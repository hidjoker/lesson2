package apiTest;

public class WrapperEx {
	
	public static void main(String[] args) {
		
		System.out.println("---박싱------");
		// int -> Integer
		int i1 = 10;
		
		Integer iVal1 = new Integer(i1);
		System.out.println(i1 + ", " + iVal1);
		
		Integer iVal2 = new Integer("1234");
		System.out.println(iVal1 + ", " + iVal2);
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1);
		System.out.println("dVal1 : "+ dVal1);
		
		System.out.println("iVal1+iVal2 : "+(iVal1+iVal2));
		
		System.out.println("\n-----언박싱-----");
		int i2 = iVal1.intValue();
		int i3 = iVal2.intValue();
		double d2 = dVal1.doubleValue();
		int i4 = dVal1.intValue(); // 형변환해서 반환
		System.out.println(i4);
		
		System.out.println("\n-----오토 박싱-----");
		//Integer iVal3 = new Integer(55);
		Integer iVal3 = 55;
		
		System.out.println("\n-----오토 언박싱-----");
		int i5 = iVal3;
		
	}
}
