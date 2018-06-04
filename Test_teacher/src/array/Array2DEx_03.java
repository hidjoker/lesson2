package array;

import java.util.Scanner;

public class Array2DEx_03 {
	public static void main(String[] args) {
		
		// 1~3학년
		// 2개반
		// 4명
		// 3과목 점수
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] s1 = new int[2][4][3];
		int[][][] s2 = new int[2][4][3];
		int[][][] s3 = new int[2][4][3];
		
		
		// 2명의 국어, 영어, 수학 점수를 저장하는 배열
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2];	// 2명의 총점 배열
		double[] avg = new double[2];	// 2명의 평균 배열
		
		Scanner sc = new Scanner(System.in);
		// 1. 점수 입력
		String[] subject = {"국어","영어","수학"};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(
					(i+1)+"번째 학생의 "+subject[j]+"점수 입력 : ");
				
				sco[i][j] = sc.nextInt();
			}
		}
		
		// 2. 총점 계산
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				sum[i] += sco[i][j];
			}
		}
		
		// 3. 평균 계산
		for(int i=0; i<2; i++) {
			avg[i] = sum[i] / (double)3;
		}
		
		// 4. 출력
		// ex)	번호  국어  영어  수학  총점  평균
		//		1번   ??? ??? ??? ??? ???
		//		2번   ??? ??? ??? ??? ???
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<2; i++) { // 몇번째 학생인지 관리하는 for문
			System.out.print(i+1+"\t"); // 번호
			
			for(int j=0; j<3; j++) { // 몇번째 과목인지 관리하는 for문
				System.out.print(sco[i][j]+"\t"); // 과목
			}
			
			System.out.println(sum[i]+"\t"+avg[i]); //총점,평균
		}
		
	}
}













