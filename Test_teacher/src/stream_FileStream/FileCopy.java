package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		
		// 파일 객체
		File src = new File("./src/stream_FileStream/Source.txt");
		File dest = new File("./src/stream_FileStream/Dest.txt");
		
		// 입출력 스트림 객체 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 파일 입출력 보조 변수
		byte[] buf = new byte[1024]; // 버퍼
		int len = -1; // 입출력 길이(1회)
		int tot = 0; // 총 입출력 길이
		
		
		try {
			// 파일 입출력 스트림 개설
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			
			// 파일 입력
			while( (len=fis.read(buf)) != -1 ) {
				
				//파일 출력
//				fos.write(buf);//마지막출력에서 문제발생함
				fos.write(buf, 0, len);
				
				// 파일카피 총 길이
				tot += len;
			}

		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일스트림 개설 실패");
			System.out.println("\t>> 파일 없음");
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 입출력 실패");
		} finally {
			try {
				// 스트림 닫기
				if(fis!=null)	fis.close();
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 파일닫기 실패");
			}
		}
		
		System.out.println(tot+" 바이트 복사 완료");
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}















