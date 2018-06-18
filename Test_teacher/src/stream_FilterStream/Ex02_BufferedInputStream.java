package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex02_BufferedInputStream {
	public static void main(String[] args) {
		
		// ���� ��ü
		File file = new File(
				"./src/stream_FilterStream/"
				, "Test");
		
		// ���� �Է� ��Ʈ�� ��ü ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// ���� �Է� ���� ����
		byte[] buf = new byte[1024]; //�Է� ������ ����
		int len = -1; // �Է� ������ ����
		
		try {
			// ���� �Է½�Ʈ�� ����
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while( (len=bis.read(buf)) != -1 ) {
				System.out.println( new String(buf).trim() );
				
				Arrays.fill(buf, (byte)0 );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				//���Ͻ�Ʈ�� �ݱ�
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}












