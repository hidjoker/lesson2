package classBasic;

public class Calculator {
//	- ��� : ��Ģ���� ����
// 	- �޼ҵ� 4��
//		sum, sub, mul, div
//	- �Ű����� : ���� 2��
//	- return : ���� (div�� double)
	
//	  0. �޼ҵ��� �⺻���� �ۼ�
//		public void method() {
//		}
//	  1. �޼ҵ� �̸� ���ϱ�
//	  2. �Ű����� �ۼ�
//	  3. �ڵ� �ۼ�
//	  4. return �ڵ� �ۼ�
//	  5. return Type 
	
	public int sum(int n1, int n2) {
		return n1+n2;
	}

	public int sub(int n1, int n2) {
		return n1-n2;
	}

	public int mul(int n1, int n2) {
		return n1*n2;
	}

	public double div(int n1, int n2) {
		return n1/(double)n2; // int / int -> int
	}
	
}














