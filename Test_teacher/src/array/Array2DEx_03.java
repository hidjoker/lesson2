package array;

import java.util.Scanner;

public class Array2DEx_03 {
	public static void main(String[] args) {
		
		// 1~3�г�
		// 2����
		// 4��
		// 3���� ����
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] s1 = new int[2][4][3];
		int[][][] s2 = new int[2][4][3];
		int[][][] s3 = new int[2][4][3];
		
		
		// 2���� ����, ����, ���� ������ �����ϴ� �迭
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2];	// 2���� ���� �迭
		double[] avg = new double[2];	// 2���� ��� �迭
		
		Scanner sc = new Scanner(System.in);
		// 1. ���� �Է�
		String[] subject = {"����","����","����"};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(
					(i+1)+"��° �л��� "+subject[j]+"���� �Է� : ");
				
				sco[i][j] = sc.nextInt();
			}
		}
		
		// 2. ���� ���
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				sum[i] += sco[i][j];
			}
		}
		
		// 3. ��� ���
		for(int i=0; i<2; i++) {
			avg[i] = sum[i] / (double)3;
		}
		
		// 4. ���
		// ex)	��ȣ  ����  ����  ����  ����  ���
		//		1��   ??? ??? ??? ??? ???
		//		2��   ??? ??? ??? ??? ???
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		for(int i=0; i<2; i++) { // ���° �л����� �����ϴ� for��
			System.out.print(i+1+"\t"); // ��ȣ
			
			for(int j=0; j<3; j++) { // ���° �������� �����ϴ� for��
				System.out.print(sco[i][j]+"\t"); // ����
			}
			
			System.out.println(sum[i]+"\t"+avg[i]); //����,���
		}
		
	}
}













