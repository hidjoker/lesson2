package swing;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class SwingEx_02_MyFrame extends JFrame {
	
	private SwingEx_02_MyFrame() {
		// ����ǥ���� ����
		setTitle("GUI Program");
		
		setLocation(1400, 50); //��ġ ����
		setSize(500, 500); //ũ�� ����
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�ݱ� ����
		
		setLayout(new GridLayout(2,2)); //��ġ������ ����
		
		initFrame(); //������Ʈ ����
		initEvent(); //�̺�Ʈ ����
		
		setVisible(true); //���̱� ����
	}

	private void initEvent() {
	}

	private void initFrame() {
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame(); //������ ����
	}
}














