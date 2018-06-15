package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
		
		OutputStream os;
		os = System.out;// PrintStream -> OutputStream
		
//		PrintStream ps;
//		ps = System.out;
//		ps.println();
		
//		os.println(); // 불가
		
		
		try {
//			os.write(97);
//			os.write(98);
//			os.write(99);
//			os.write(10);

			os.write('a');
			os.write('b');
			os.write('c');
			os.write('\n');

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os!=null)	os.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}















