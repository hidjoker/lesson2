package abstractEx;

// 추상클래스
abstract class Person {
	public String name;//이름
	
	// 추상메소드
	public abstract void out();
}

class Professor extends Person {
	public String major;//전공
	
	public Professor(String major) {
		this.major = major;
	}
	
	@Override
	public void out() {
		System.out.println("교수입니다");
		System.out.println(major + "을 전공했습니다");
	}
}

class Student extends Person {
	public String subject;//과목
	
	public Student(String subject) {
		this.subject = subject;
	}

	@Override
	public void out() {
		System.out.println("학생입니다");
		System.out.println(subject + "수업을 듣고 있습니다");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		
		arr[0] = new Student("자바");
		arr[1] = new Professor("컴퓨터공학");
		
		arr[0].out();
		arr[1].out();
	}
}
















