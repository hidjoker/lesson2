package array;

public class ArrayEtc_04_BubbleSort {
	public static void main(String[] args) {
//		int[] arr = {3, 2, 1, 4, 5};
//
//		// ���� ���
//		for(int k=0;k<arr.length;k++)
//			System.out.print(arr[k]+" ");
//
//		// ���� ����
//		for(int i=0; i<arr.length-1; i++){	// ROUND
//			
//			// ROUND�� ����
//			for(int j=0; j <arr.length-i-1; j++){
//				
//				// ����
//				if(arr[j]>arr[j+1]){
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}//if
//
//			}//for j
//		}//for i
//
//	}
	
	
    int a[] = {3, 2, 5, 4, 1};
	 
	 System.out.printf("%-16s","���� ������ : ");
	 for(int k=0;k<a.length;k++)
		 System.out.print(a[k]+" ");
	 
	 for(int i=0; i<a.length-1; i++){
		 System.out.println();
		 for(int j=0; j <a.length-i-1; j++){
			 System.out.print("i = " + i  + "\t" + "j = " + j + "\t" + "[ ");
			 if(a[j]>=a[j+1]){
				 int imsi = a[j];
				     a[j] = a[j+1];
				     a[j+1] = imsi;
			 }//if
			 
		  for(int k=0;k<a.length;k++)
				 System.out.print(a[k]+" ");
		  
		  System.out.println("]");
		 }//for j
	   
		
	 }//for i
				 
  } 
}













