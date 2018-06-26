package swing;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx_02_MyFrame extends JFrame {
	
	// ���̺�
	private JLabel lbl;
	
	// ��ư 3��
	private Button btn1;
	private JButton btn2;
	private JButton btn3;
	
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

	private void initFrame() {
		// ���̺� 1��, ��ư 3�� ����
		lbl = new JLabel("���̺�");
		lbl.setHorizontalAlignment(JLabel.CENTER);

		btn1 = new Button("��ư1");
		btn2 = new JButton("��ư2");
		btn3 = new JButton("��ư3");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(lbl);
	}
	
	private void initEvent() {
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("");
			}
		});
		// ��ư�� ������ ���̺� �ؽ�Ʈ�� ���̵��� �ۼ�
		// 	btn2 -> ��ư2����!!
		// 	btn3 -> ��ư3����!!
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("2�� ����!!!!");
			}
		});

		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("3�� ����!!!!");
			}
		});
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame(); //������ ����
	}
}














