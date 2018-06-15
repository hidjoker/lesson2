package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		// ��� ��� ����
		File file = new File(
			"./src/stream_FileStream/", "Result");
		
		// ���� ��� ��Ʈ�� ����
		FileOutputStream fos = null;
		
		try {
			// ���� ��ü ���� 
			// ������ ������ �����Ѵ�
			// FileNotFoundExcpetion ó�� �ʼ�
			fos = new FileOutputStream(file);
			
			// IOException ó�� �ʼ�
			fos.write(65);	// A ���
			fos.write('C');	// 66 ���
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + ���α׷� ���� ���� + +");
		
		
	}
}














