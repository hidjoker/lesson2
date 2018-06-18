package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		
		// ���� ��ü
		File src = new File("./src/stream_FilterStream/Source.txt");
		File dest = new File("./src/stream_FilterStream/Dest.txt");
		
		// �Է� ��Ʈ�� ��ü ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// ��� ��Ʈ�� ��ü ����
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// ���� ����� ���� ����
		byte[] buf = new byte[1024]; // ����
		int len = -1; // ����� ����(1ȸ)
		int tot = 0; // �� ����� ����
		
		try {
			// ���� �Է� ��Ʈ�� ����
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);
			
			// ���� ��� ��Ʈ�� ����
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
			// ���� �Է�
			while( (len=bis.read(buf)) != -1 ) {
				//���� ���
				bos.write(buf, 0, len);
				
				// ����ī�� �� ����
				tot += len;
			}
			bos.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���Ͻ�Ʈ�� ���� ����");
			System.out.println("\t>> ���� ����");
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ����� ����");
		} finally {
			try {
				// ��Ʈ�� �ݱ�
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
				
				if(bos!=null)	bos.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ���ϴݱ� ����");
			}
		}

		System.out.println(tot+" ����Ʈ ���� �Ϸ�");
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}















