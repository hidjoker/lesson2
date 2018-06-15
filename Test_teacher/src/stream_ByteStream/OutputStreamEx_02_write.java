package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_02_write {
	public static void main(String[] args) {
		
		OutputStream os;
		os = System.out;// PrintStream -> OutputStream
		
		byte[] buf = new byte[1024];
		
		buf[0] = 65; // 'A'
		buf[1] = 66; // 'B'
		buf[2] = 67; // 'C'
		buf[3] = 10; // '\n'
		
		buf[4] = 'H'; // 72 
		buf[5] = 'i'; // 105
		buf[6] = '\n'; // 10
		
		System.out.println("length : "+buf.length);
		
		try {
			
			os.write(buf);
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















