package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtEx {
	
	// �����̳� Frame 
	private Frame fr;
	
	// ������Ʈ Button
	private Button btn1;
	private Button btn2;
	
	// ������Ʈ Label
	private Label lbl;
	
	private AwtEx() {
		//--- ������ ���� ---
		fr = new Frame("myFrame"); //������ Ÿ��Ʋ����
		fr.setVisible(true); // ������ ���̱� ����
		//---------------
		
		//--- ������ ���� ---
		fr.setLayout(new GridLayout(3,1));//��ġ������ ����
		fr.setLocation(1400, 50);//������ ��ġ
		fr.setSize(500, 500);//������ ũ��
		//---------------
		
		//--- �������̺�Ʈ ���� ---
		windowEvent(fr);
		//---------------------
		
		//--- ������Ʈ ���� ---
		showLabel();
		showButton();
		//------------------
	}

	private void showButton() {
		// ��ư ����
		btn1 = new Button("�ȳ��ϼ���");
		btn2 = new Button();
		btn2.setLabel("�ݰ�����");
		
		//��ư�̺�Ʈ �߰�
		buttonEvent();
		
		// �����ӿ� ��ư �߰�
		fr.add(btn1);
		fr.add(btn2);
	}

	private void buttonEvent() {
		//��ư1�� �̺�Ʈ ������ ���
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				lbl.setText("��ư1�� �۵���(����)");
			}
		});
		
		//��ư2�� �̺�Ʈ ������ ���
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("��ư2 �۵�!!");
			}
		});
	}

	private void showLabel() {
		lbl = new Label(); //���̺� ����
		lbl.setText("���̺��Դϴ�");//���̺��ؽ�Ʈ ����
		
		lbl.setAlignment(Label.CENTER);//�������
		lbl.setBackground(Color.gray);//���� ȸ��
		
		fr.add(lbl); //�����ӿ� ���̺� �߰�
	}

	// ������ �̺�Ʈ ���
	private void windowEvent(Frame fr) {
		//--- ������ �̺�Ʈ ��� ---
//		WindowListener l;
//		l = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println(e);
//				System.exit(0);
//			}
//		};
//		fr.addWindowListener(l);
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//---------------------
	}
	
	public static void main(String[] args) {
		new AwtEx();
	}
}










