package array;

import java.util.Scanner;

public class Array2DEx_06 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// new int[5] ��> int[0] = int[1] = int[2] = int[3] =int[4] =0(null)
		
		arr[0] = 10;
		arr[1] = 20;
		
		arr = new int[3];
		
		// ���ο� ������� reference�� ����. int[0] = int[1] = int[2] = 0(null)
		// jvm(GC_�������÷���) ��> ������ ���� ���� ��������� ��������
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		
		
		
	}
}













