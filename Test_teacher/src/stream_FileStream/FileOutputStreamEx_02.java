package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	public static void main(String[] args) {
		
		// ��� ��� ����
		File file = new File(
			"./src/stream_FileStream/", "Result");
		
		// ���� ��� ��Ʈ�� ����
		FileOutputStream fos = null;
		
//		byte[] buf = new byte[1024];
//		buf[0] = 'A';
//		buf[1] = 'B';
		
		String str = "�ȳ��ϼ��� �ڹ�!!";
		byte[] buf = str.getBytes();
		
		try {
			// ���� ��ü ���� 
			// ������ ������ �����Ѵ�
			// FileNotFoundExcpetion ó�� �ʼ�
			fos = new FileOutputStream(file, false);
			// �������� �ι�° ���ڴ� append ��� ������
			//	false(�⺻��) : �ű� ���
			//	true : �߰� ���

			// ���� ��� �ڵ�
//			fos.write(buf);
			fos.write(buf, 0, buf.length);
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� ����");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ����� ���� �߻�");
		} finally {
			try {
				if(fos!=null)	fos.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("[ERROR] ���� �ݱ� ����");
			}
		}
		
		System.out.println("+ + ���α׷� ���� ���� + +");
		
		
	}
}














