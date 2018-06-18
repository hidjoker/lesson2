package stream_FilterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		// ���� ��ü - ��� ���
		File file = new File(
				"./src/stream_FilterStream"
				, "TestOutput");
		
		// ���� ��Ʈ�� ��ü ����
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// ���� ��Ʈ�� ����
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

			bos.write( "Orange".getBytes() );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ���� ��Ʈ�� �ݱ�
				if(bos!=null)	bos.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}












