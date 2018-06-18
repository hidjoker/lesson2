package stream_FilterStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05_DataInputStream {
	public static void main(String[] args) {
		
		// ���� ��ü ����
		File file = new File(
				"./src/stream_FilterStream"
				, "DataTest");
	
		// ���� �Է� ��Ʈ�� ���� 
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			// ���� �Է� ��Ʈ�� ����
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			int resInt = dis.readInt(); // int
			boolean resBoolean = dis.readBoolean(); // boolean
			char resChar = dis.readChar(); // char

			System.out.println("int : " + resInt);
			System.out.println("boolean : " + resBoolean);
			System.out.println("char : " + resChar);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null)	dis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}













