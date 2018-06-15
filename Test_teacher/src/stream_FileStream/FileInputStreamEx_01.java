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
		
		// 전체 읽은 데이터 저장
		StringBuffer sb = new StringBuffer();
		int in = -1; // 한 글자씩 입력된 데이터
		
		try {
			fis = new FileInputStream(file);
			
			// EOF, End Of File
			while( (in=fis.read()) != -1 ) {
				sb.append( (char)in );
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 파일 존재하지 않음");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 입출력 문제 발생");
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("=====읽어온 데이터=====");
		System.out.println(sb);
		System.out.println("====================");
		
		System.out.println("+ + 프로그램 정상 종료 + +");
	}
}













