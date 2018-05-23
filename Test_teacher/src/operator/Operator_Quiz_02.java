package operator;

public class Operator_Quiz_02 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 10, d;

		d = ++a * b--;
		System.out.println(
		  " a = " + a + ", b = " + b + ", d = " + d);

		d = a++ + ++c - b--;
		System.out.println(
		  "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

		
		
		
		System.out.println("------------------------------");
		boolean res1;
		a = 10;	b = 20; c = 30; d = 40;

		res1 = a < b || c++ < --d;
		System.out.println("result1 : " + res1);
		System.out.println(
		  "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

		
		
		
		System.out.println("------------------------------");
		boolean res2;
		a = 10;	b = 20; c = 30; d = 40;
		
		res2 = a > b && (c++ < --d + b++);
		System.out.println("result2 : " + res2);
		System.out.println(
		  "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	}
}

