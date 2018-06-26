package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class SwingEx_07_ContentPane
					extends JFrame
					implements ActionListener {

	//---��Ʈ �����̳� ������ �ʿ��� ����---
	private Container root; //��Ʈ �����̳�
	
	// ù ��° �ǳ�
	private JPanel pane;
	private JButton btnHi;
	private JButton btnBye;
	private JButton btnChange;
	//------------------------------
	
	//---�޴� ������ �ʿ��� ����---
	private JMenuBar menuBar;
	
	private JMenu menu;
	
	private JMenuItem item1;
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem exitItem;
	//------------------------
	
	public SwingEx_07_ContentPane() {
		setTitle("Top-Level Component Example");
		setBounds(1400, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// �޴��� ����
		initMenuBar();
		
		// ��Ʈ�����̳� ����
		initRootContainer();
		
		setVisible(true);
	}

	private void initRootContainer() {
		// ��Ʈ �����̳� �ޱ�
		root = getContentPane();
		
		initPane(); //ù ��° �ǳ� �����ϱ�
		
		root.add(pane); //���������ӿ� ù ��° �ǳ� �߰��ϱ�
	}

	private void initPane() {
		pane = new JPanel();
		
		btnHi = new JButton("�ȳ�");
		pane.add(btnHi);
		btnHi.addActionListener(this);
		
		btnBye = new JButton("����");
//		pane.add(btnBye);
		btnBye.addActionListener(this);
		
		btnChange = new JButton("�ٲٱ�");
		pane.add(btnChange);
		btnChange.addActionListener(this);
	}

	private void initMenuBar() {
		menuBar = new JMenuBar(); // �޴��� ����
		
		menu = new JMenu("�޴�"); // �޴� ����
		
		// �޴� ������ ����
		item1 = new JMenuItem("������1");
		item2 = new JMenuItem("������2");
		item3 = new JMenuItem("������3");
		exitItem = new JMenuItem("����(X)");
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator(); //��輱�߰�
		menu.add(exitItem);
		
		menuBar.add(menu);
		
		// �޴������� �̺�Ʈ �ɱ�
		initExitItem();	//�����ư �̺�Ʈ ����
		
		setJMenuBar(menuBar); //�����ӿ� �޴��� �����ϱ�
	}
	
	private void initExitItem() {
		// Action Event ó�� �޼ҵ� ���
		exitItem.addActionListener(this);
		
		// ����
		exitItem.setToolTipText("���α׷� �ݱ�");
		
		// ���Ű
		exitItem.setMnemonic(KeyEvent.VK_X);//'X',0x58,88
		
		// ����Ű (����Ű)
		//  alt + q : ���� ����Ű
		exitItem.setAccelerator(
			KeyStroke.getKeyStroke(
				KeyEvent.VK_Q, KeyEvent.ALT_MASK) );
	}

	// Action Event ó�� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == exitItem ) {
			System.exit(0); //���α׷� ����
			
		} else if ( e.getSource() == btnHi ) {
			pane.remove(btnHi); // "�ȳ�"��ư ����
			pane.add(btnBye); // "����"��ư Ȱ��ȭ
			pane.add(btnChange); // ��ư������ ���� �ٽ� add
			
			pane.validate(); // ������Ʈ ���� (�޸𸮻���Ȯ��)
			pane.repaint(); // �ٽ� �׸���
			
		} else if ( e.getSource() == btnBye ) {
			pane.remove(btnBye);// "����"��ư ����
			pane.add(btnHi);// "�ȳ�"��ư Ȱ��ȭ
			pane.add(btnChange);
			
			pane.validate(); // ������Ʈ ���� (�޸𸮻���Ȯ��)
			pane.repaint(); // �ٽ� �׸���
			
		} else if ( e.getSource() == btnChange ) {
			
		}
	}

	public static void main(String[] args) {
		new SwingEx_07_ContentPane();
	}
}
















