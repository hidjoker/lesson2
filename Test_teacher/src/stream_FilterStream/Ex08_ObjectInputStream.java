package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex08_ObjectInputStream {
	public static void main(String[] args) {

		// ���� ��ü ����
		File file = new File(
				"./src/stream_FilterStream"
				, "ObjectTest");
		
		// �Է� ��Ʈ�� ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			List list = (List) ois.readObject();
			System.out.println(list);
			System.out.println("--------");
			
			for(int i=0; i<list.size(); i++) {
				
				if( list.get(i) instanceof Person ) {
					// Person Ŭ���� ��ü(�ν��Ͻ�)
					System.out.println(
						((Person)list.get(i)).getName() );
				} else if( list.get(i) instanceof Point ) {
					// Point Ŭ���� ��ü(�ν��Ͻ�)
					System.out.println(
						((Point)list.get(i)).getY() );
				}
				
			}
			
		} catch (FileNotFoundException e) {	e.printStackTrace();
		} catch (IOException e) {	e.printStackTrace();
		} catch (ClassNotFoundException e) {	e.printStackTrace();
		} finally {
			try {
				if(ois!=null)	ois.close();
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {	e.printStackTrace();
			}
		}
		System.out.println("+ + + ���α׷� ���� ���� + + +");		
	}
}














