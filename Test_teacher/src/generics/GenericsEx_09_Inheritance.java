package generics;

class Parent01<T> {
	T data1;
}
class Child01 extends Parent01<String> {
	// data1�� StringŸ������ ��ӵȴ�
}

class Parent02<T> {
	
}
class Child02<K> extends Parent02<K> {
	// ��ӹ��� ���׸� Ÿ�԰��� �̷��
}

class Parent03<M> {
	
}
class Child03<M, N> extends Parent03<M> {
	// M : ��ӹ��� ���׸� Ÿ�� �̰���
	// N : �ڽ�Ŭ�������� ���׸� Ÿ��
}

public class GenericsEx_09_Inheritance {
	public static void main(String[] args) {
	}
}














