package classBasic.defaultTest;

import classBasic.ClassEx_03;

public class MainClass_defaultTest {
	public static void main(String[] args) {
		ClassEx_03 ce = new ClassEx_03();
//		System.out.println( ce.num1 );	// private
//		System.out.println( ce.num2 );	// default
//		System.out.println( ce.num3 );	// protected
		System.out.println( ce.num4 );	// public
		
//		ce.num1 = 100;
		ce.setNum1(100);
		
	}
}












