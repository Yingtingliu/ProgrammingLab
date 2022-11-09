package week6_Lab;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex2 extends JFrame{
	
	public void JustShowFrame() {
		
		setSize(400,400);
//		setLocation(100,100);
		setTitle("Border layout for JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();		
		JLabel label = new JLabel("North");
		northPanel.add(label);
		add(northPanel,BorderLayout.NORTH);
		
		JPanel southPanel = new JPanel();	
		JLabel label2 = new JLabel("South");
		southPanel.add(label2);
		add(southPanel,BorderLayout.SOUTH);
		
		JPanel eastPanel = new JPanel();		
		JLabel label3 = new JLabel("East");  
		eastPanel.add(label3);
		add(eastPanel,BorderLayout.EAST);
		
		JPanel westPanel = new JPanel();	
		JLabel label4 = new JLabel("West");
		westPanel.add(label4);
		add(westPanel,BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		JLabel label5 = new JLabel("Center"); 
		centerPanel.add(label5);
		add(centerPanel,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
