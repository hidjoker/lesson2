package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		File file = new File(
			"./src/stream_FileStream/", "Hello");
		
		FileInputStream fis = null;
		
		// ��ü ���� ������ ����
		StringBuffer sb = new StringBuffer();
		int in = -1; // �� ���ھ� �Էµ� ������
		
		try {
			fis = new FileInputStream(file);
			
			// EOF, End Of File
			while( (in=fis.read()) != -1 ) {
				sb.append( (char)in );
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� �������� ����");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ����� ���� �߻�");
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("=====�о�� ������=====");
		System.out.println(sb);
		System.out.println("====================");
		
		System.out.println("+ + ���α׷� ���� ���� + +");
	}
}













