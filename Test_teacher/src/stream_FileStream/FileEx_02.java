package stream_FileStream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// File Class
		//	파일 정보를 다루는 클래스
		
//		File file = new File(
//		 "D:/workspace\\JavaBasic\\src\\stream_FileStream\\Hello");

		File file = new File("./src/stream_FileStream/Hello");
		
		System.out.println("toString() : " + file);
		System.out.println("length() : "+file.length());
		System.out.println("exists() : "+file.exists());
	
		System.out.println("-----");
		System.out.println("canRead() : "+file.canRead());
		System.out.println("canWrite() : "+file.canWrite());

		System.out.println("-----");
		System.out.println("isDirectory() : "
				+file.isDirectory());

	
	
		// escape sequence
		// escape character
		
//		String str = "\t";	// 수평 탭
//		String str1 = "\b"; // Backspace
//		String str2 = "\r"; // Carriage Return
//		String str3 = "\n"; // New Line
////		String str4 = "\a"; // Alarm
//		
//		System.out.println("100\\");
		
	
	
	}
}












