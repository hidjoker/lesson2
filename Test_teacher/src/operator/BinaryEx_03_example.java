package operator;

public class BinaryEx_03_example {
	public static void main(String[] args) {
		// ���� ���� ������ ����
		
		int num1;
		int num2;
	
		
		num1 = 17;
		num2 = 4;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("----------");

		num2 += num1;
		System.out.print("num2 += num1 ���� �� num2 �� : ");
		System.out.println(num2);

		num1 = 17;
		num2 = 4;
		num2 -= num1;
		System.out.print("num2 -= num1 ���� �� num2 �� : ");
		System.out.println(num2);

		num1 = 17;
		num2 = 4;
		num2 *= num1;
		System.out.print("num2 *= num1 ���� �� num2 �� : ");
		System.out.println(num2);

		num1 = 17;
		num2 = 4;
		num2 /= num1;
		System.out.print("num2 /= num1 ���� �� num2 �� : ");
		System.out.println(num2);

		num1 = 17;
		num2 = 4;
		num2 %= num1;
		System.out.print("num2 %= num1 ���� �� num2 �� : ");
		System.out.println(num2);
	}
}











