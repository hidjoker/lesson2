package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {
		
		File file = new File(
			"./src/stream_FileStream/", "Hello");
		
		// ���� �Է� ��Ʈ�� ��ü ����
		// try ���� �ȿ��� ��ü�� �����ϱ� ������ 
		// ��ü ���� ���и� ����ؼ� null�� �ʱ�ȭ�صд�
		FileInputStream fis = null;
		
		// ��ü ���� ������ ����
		StringBuffer sb = new StringBuffer();

		// �ѹ��� �о�鿩 �����ϴ� �迭
		byte[] buf = new byte[8];
		
		int len = -1; // �о���� ����Ʈ ��
		int total = 0; // �� �о���� ����Ʈ ��
		
		try {
			fis = new FileInputStream(file);
			
			// EOF, End Of File
			while( (len=fis.read(buf)) != -1 ) {
				sb.append( new String(buf, 0, len) );
//				sb.append( new String(buf) );
				System.out.println("���� ����Ʈ �� : "+len);
				total += len;
				
				// buf �迭 �ʱ�ȭ
//				Arrays.fill(buf, (byte)0);
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
		System.out.println("=====�о�� �� ����Ʈ ��=====");
		System.out.println(total + " Bytes");
		System.out.println("=====�о�� ������=====");
		System.out.println(sb);
		System.out.println("====================");
		
		System.out.println("+ + ���α׷� ���� ���� + +");
	}
}













