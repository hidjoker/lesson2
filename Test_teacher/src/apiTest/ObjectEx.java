package apiTest;

class Point implements Cloneable {
	int x;
	int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point ("+x+","+y+")";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if( this.x == ((Point)obj).getX()
				&& this.y == ((Point)obj).getY() ) {
			return true;
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		
		Object o = new Object();
		
		System.out.println("---toString()---");
		// toString()
		//	��� : ��ü�� ���� ������ String���� ��ȯ
		//	���� : ��ü�� ����
		//	�⺻���� : ���۷�����ȯ
		//			( ������Ÿ��@���� )
		//	�������̵� ����
		
		// println() �޼ҵ尡 ��ü�� �������ڷ� ������
		// �ڵ����� ��ü�� toString()�� ȣ���� ���� ����ϵ��� �Ǿ�����
		System.out.println( o.toString() );
		System.out.println( o );
		
		Point p = new Point(10,20);
		System.out.println( p );
		
		
		System.out.println("\n---equals()---");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		
		System.out.println("p2==p3 : "+(p2==p3));
		System.out.println("p2.equals(p3):"
				+( p2.equals(p3) ));
		
		String str = new String("Apple");
		System.out.println("���ڿ��� : "
				+ "Apple".equals(str) );

		
		System.out.println("\n---hashCode()---");
		String str1 = new String("Apple");
		String str2 = new String("Apple");
		String str3 = new String("Banana");
		String str4 = str1;
		
		System.out.println("str1 : "+str1.hashCode());
		System.out.println("str2 : "+str2.hashCode());
		System.out.println("str3 : "+str3.hashCode());
		System.out.println("str4 : "+str4.hashCode());
		
		System.out.println("p : " + p.hashCode());
		System.out.println("p2 : "
				+ Integer.toHexString(p2.hashCode()));
		
		
		System.out.println("\n---getClass()---");
		System.out.println("p.getClass() : "+p.getClass());
		System.out.println("o.getClass() : "+o.getClass());
		System.out.println("str.getClass() : "+str.getClass());
		
		System.out.println("\n---clone()---");
		
		Point p_ori = new Point(33, 44);
		
		Point p_clone1 = p_ori; // ���� ����
		
		// ���� ���� - ������ �̿�
		Point p_clone2 = new Point(p_ori.x, p_ori.y);
		
		Point p_clone3 = null;
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println( p_ori.hashCode() );
		System.out.println( p_clone1.hashCode() );
		System.out.println( p_clone2.hashCode() );
		System.out.println( p_clone3.hashCode() );

	}
}
















