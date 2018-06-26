package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx_03_LayoutManager extends JFrame {
	private SwingEx_03_LayoutManager() {
		setTitle("LayoutManager Example"); // ������ ����
		
		setLocation(1400, 50); //��ġ ����
		setSize(500, 500); //ũ�� ����
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�ݱ� ����
		
		//--- ������ ���� �۾� ---
//		flowLayoutEx();
//		borderLayoutEx();
		gridLayoutEx();
		//---------------
		
		setVisible(true); //���̱� ����
	}

	private void gridLayoutEx() {
//		setLayout( new GridLayout() );
//		setLayout( new GridLayout(3, 0) );
//		setLayout( new GridLayout(0, 3) );
		setLayout( new GridLayout(0, 3, 10, 20) );
		
		JButton[] btn = new JButton[8];
		for(int i=0; i<btn.length; i++)
			btn[i] = new JButton("��ư"+(i+1));
		
		for(int i=0; i<btn.length; i++)
			add(btn[i]);
	}
	
	private void borderLayoutEx() {
//		setLayout( new BorderLayout() );
		setLayout( new BorderLayout(30, 15) );
		
		JButton[] btn = new JButton[5];
		for(int i=0; i<btn.length; i++)
			btn[i] = new JButton("��ư"+(i+1));

//		add(btn[0]);
		
		add(btn[0], "East");
		add(btn[1], "West");
		add("Center", btn[2]);
		add(btn[3], BorderLayout.NORTH);
		add(BorderLayout.SOUTH, btn[4]);
		
	}

	private void flowLayoutEx() {
//		setLayout( new FlowLayout() );
//		setLayout( new FlowLayout(FlowLayout.RIGHT) );
		setLayout( new FlowLayout(
				FlowLayout.CENTER, 20, 40) );
		
		add(new JButton("��ư3"));
		add(new JButton("��ư1"));
		add(new JButton("��ư5"));
		add(new JButton("��ư2"));
		add(new JButton("��ư7"));
		add(new JButton("��ư4"));
		add(new JButton("��ư66666666666666"));
		
		JButton btn = new JButton("��ư8");
		
//		btn.setSize(200,200);
		btn.setPreferredSize(new Dimension(200, 200));
		
		add(btn);
		
	}
	
	public static void main(String[] args) {
		new SwingEx_03_LayoutManager();
	}
}














