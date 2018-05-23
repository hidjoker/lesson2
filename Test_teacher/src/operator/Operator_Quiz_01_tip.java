package operator;

public class Operator_Quiz_01_tip {
	public static void main(String[] args) {
		// 원본 값
		double avg = 3.12541245;
		// 소수점 둘째자리까지 표현한 값
		double res = Math.round( avg * 100 )/(double)100;
		
		// 0. 원본 데이터
		System.out.println("원본 값 : " + avg);
		
		// 1. 최종 값으로 사용될  소수점 둘째자리까지 정수부분으로 올리기 
		System.out.println("avg*100 : " + (avg*100) );
		
		// 2. 소수점 이하 반올림 -> 소수점이하 없애기
		System.out.println("Math.round : "
				+ Math.round(avg * 100) );
		
		// 3. 정수부분으로 올라갔던 2자리 내리기(100으로 나누기)
		System.out.println("결과 : "
				+ Math.round( avg * 100 )/(double)100 );
	}
}




