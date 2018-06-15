package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		File file1 = new File("./src/stream_FileStream/","Source.txt");
		File file2 = new File("./src/stream_FileStream/","Dest.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024];
		
		int len = -1;
		int total = 0;
		
		try {
			
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			while((len=fis.read(buf))!=-1) {
				fos.write(buf, 0, len);
				total+=len;
			}
						
			System.out.println("���� �Ϸ�, "+total+" Byte");
	
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� ����");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ����� ���� �߻�");
		} finally {
				try {
					if(fis!=null) fis.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		
		System.out.println(" + + ���α׷� ���� ���� + + ");
				
		
		
		
	}
	
}
