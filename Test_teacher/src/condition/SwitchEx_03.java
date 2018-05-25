package condition;

public class SwitchEx_03 {
	public static void main(String[] args) {

		char ch = 'q';
		
		switch( ch ) {
		case 'Q':
			System.out.println("대문자 큐");
			break;
		case 'q': // == 113
			System.out.println("소문자 큐");
			break;
		case 'a':
			System.out.println("에이");
			break;
		case 'B':
			System.out.println("비");
			break;
		}
	
		
		
		
		if( ch=='Q' ) {
			
		}else if( ch=='q') {
			
		}else if( ch=='A') {
			
		}else {
			System.out.println("적당한 문자없음");
		}
		
		
		
		
	}
}














