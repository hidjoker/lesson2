package classBasic;

public class Method_03 {

	//0. �޼ҵ��� �⺻���� �ۼ�
	//	public void method() {
	//	}
	//1. �޼ҵ� �̸� ���ϱ�
	//2. �Ű����� �ۼ�
	//3. �ڵ� �ۼ�
	//4. return �ڵ� �ۼ�
	//5. return Type 

	//�迭�� ��� ��� 10��
	public void mul10(int[] a) {
		for(int i=0; i<5; i++)
			a[i] *= 10;
	}
	//�����迭�� ��� ����� 10�踦 ������ ���ο� �迭 ��ȯ
	public int[] mul10_v2(int[] a) {
		
		int[] res = new int[a.length];
		for(int i=0; i<res.length; i++) {
			res[i] = a[i] * 10;
		}
		
		return res;
	}

	//�迭�� ��� ��� ���
	public void print(int[] a) {
		for(int i=0; i<5; i++)
			System.out.println(a[i]);
	}
	
}















