package array;

import java.util.Scanner;

public class Array2DEx_05 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		// new : �����Ҵ� ������
		
		// �Ҵ� : �޸� ���� ����
		
		// ���� <-> ����
		// ���� : ������, run-time
		// ���� : ��������, Compile-time
				
		
		// ex) int num; // int�� ���� ���� -> ���� �Ҵ�
		
		// ex) int[] arr; // int[]�� ���� ���� -> ���� �Ҵ�
		//     arr = new int[5]; // int[5] ���� -> ���� �Ҵ�
		
		// int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i <arr.length ; i++) {
			System.out.print("Input size : ");
			int len = sc.nextInt();
			
			arr[i] = new int[len];
		}
		
		
		
		
		
	}
}













