package week6_Lab;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1 extends JFrame{
	
	public void JustShowFrame() {
		
		setSize(400,400);
//		setLocation(100,100);
		setTitle("Border layout for JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel("North");  
		add(label,BorderLayout.NORTH);
		JLabel label2 = new JLabel("South");  
		add(label2,BorderLayout.SOUTH);
		JLabel label3 = new JLabel("East");  
		add(label3,BorderLayout.EAST);
		JLabel label4 = new JLabel("West");  
		add(label4,BorderLayout.WEST);
		JLabel label5 = new JLabel("Center");  
		add(label5,BorderLayout.CENTER);
		setVisible(true);
	}
}
