package stream_CharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		
		// ���� ��ü
		File src = new File("./src/stream_CharStream/Source.txt");
		File dest = new File("./src/stream_CharStream/Dest.txt");
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
		int tot = 0;

		try {
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			
			while( (len=br.read(cbuf)) != -1 ) {
				bw.write(cbuf, 0, len);
				tot += len;
			}
			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)	bw.close();
				if(br!=null) 	br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		// Source.txt�� �� ũ��� 4,210 ����Ʈ�̴�.
		// ������ ����� ���ڼ��� 4202 �� �� ���´�.
		// 	-> �ѱ��� �ϳ��� ���ڷ� �νĵǱ� ����
		System.out.println("������ �� ���� �� : " + tot);
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}










