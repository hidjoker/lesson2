package generics;

class Parent01<T> {
	T data1;
}
class Child01 extends Parent01<String> {
	// data1은 String타입으로 상속된다
}

class Parent02<T> {
	
}
class Child02<K> extends Parent02<K> {
	// 상속받은 제네릭 타입결정 미루기
}

class Parent03<M> {
	
}
class Child03<M, N> extends Parent03<M> {
	// M : 상속받은 제네릭 타입 미결정
	// N : 자식클래스만의 제네릭 타입
}

public class GenericsEx_09_Inheritance {
	public static void main(String[] args) {
	}
}














