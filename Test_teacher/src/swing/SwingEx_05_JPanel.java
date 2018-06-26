package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEx_05_JPanel extends JFrame {
	private SwingEx_05_JPanel() {
		setTitle("JPanel Example");
		setBounds(1400, 50, 600, 400); //��ġ�� ũ�⸦ �ѹ���! 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pane1 = new JPanel();
		
		pane1.add(new JButton("��ư1"));
		pane1.add(new JButton("��ư2"));
		pane1.add(new JButton("��ư3"));
		
		add(pane1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx_05_JPanel();
	}
	
}





