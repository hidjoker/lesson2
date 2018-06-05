package interfaceEx;

interface InterA {
	public void getA();
}
interface InterB {
	public void getB();
}
interface InterC extends InterA, InterB {
	public void getC();
}

class Child implements InterC {
	@Override
	public void getC() {
	}
	
	@Override
	public void getB() {
	}
	
	@Override
	public void getA() {
	}
}

public class InterfaceEx_02 {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.getA();
		c.getB();
		c.getC(); //¡÷ºÆ!
	
		// ctrl + shift + -
		
		// ctrl + shift + [
		
	}
}













