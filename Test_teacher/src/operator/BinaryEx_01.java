package operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		// ���������
		int num1 = 17;
		int num2 = 4;
		
		int result = (num1 + num2);
		//int result = 17 + 4;
		//int result = 21;
		
		// ** ���Կ����� =
		// **	������ ���� ���� ���� ���� ������ �����Ѵ�
		
		System.out.println("��� : " + result);
		
		System.out.println("-----");
		System.out.println(num1 + num2);//add(����)
		System.out.println(num1 - num2);//sub(����)
		System.out.println(num1 * num2);//mul(���ϱ�)
		System.out.println(num1 / num2);//div(������)
		System.out.println(num1 % num2);//mod(������)
		
		System.out.println("-----");
		System.out.println(num1/(double)num2);//�Ҽ������� ���
						// 17/(double)4
						// 17.0/4.0
						// 4.2500000
		System.out.println((double)num1/num2);//�Ҽ������� ���
		
		System.out.println("-----");
		// double �������� ������ ����
		System.out.println(num1%2.4);
		
		System.out.println("--���ܻ�Ȳ---");
		
		// divide by zero
//		System.out.println( 11 / 0 );//ArithmeticException
		
		System.out.println( 12.34 / 0 );//Infinity
	}
}













