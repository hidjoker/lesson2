
package manage;

class Data {
	int num;
}

public class ForEach_02 {
	public static void main(String[] args) {
		
		Data[] arr = new Data[3];
		
		arr[0] = new Data();
		arr[1] = new Data();
		arr[2] = new Data();
		
		for(Data d : arr) {
			System.out.println(d.num);
		}
		
		for(Data d : arr) {     //Call by Reference ������ ���� - ���������� ���� ����
			d.num = 111;
		}
		
		System.out.println("--------");
		for(Data d : arr) {
			System.out.println(d.num);
		}
		
	}
}










