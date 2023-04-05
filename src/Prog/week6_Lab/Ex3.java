package Prog.week6_Lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ex3 extends JFrame{
	
	public void JustShowFrame() {
		
		setSize(400,400);
//		setLocation(100,100);
		setTitle("Border layout for JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new BorderLayout());
		Border blackline = BorderFactory.createLineBorder(Color.black);
		Font f = new Font("TimesRoman", Font.PLAIN, 24); 
		
		JPanel northPanel = new JPanel();		
		JLabel label = new JLabel("North");
		label.setFont(f);
		northPanel.add(label);
		northPanel.setBorder(blackline); 
		add(northPanel,BorderLayout.NORTH);
		
		JPanel southPanel = new JPanel();	
		JLabel label2 = new JLabel("South");
		southPanel.add(label2);
		add(southPanel,BorderLayout.SOUTH);
		
		JPanel eastPanel = new JPanel();		
		JLabel label3 = new JLabel("East"); 
		eastPanel.add(label3);
		eastPanel.setLayout(new GridBagLayout()); // this is new
		
		add(eastPanel,BorderLayout.EAST);
		
		JPanel westPanel = new JPanel();	
		JLabel label4 = new JLabel("West");
		westPanel.add(label4);
		westPanel.setLayout(new GridBagLayout()); // this is new
		
		add(westPanel,BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
//		JLabel label5 = new JLabel("Center"); 
		JLabel leftLabel = new JLabel("<html> W <br> E <br> S <br> T </html>");
//		JLabel leftLabel = new JLabel("<html> W <br> E <br> S <br> T </html>");
		centerPanel.setLayout(new GridBagLayout()); // this is new
//		centerPanel.add(label5);
		centerPanel.add(leftLabel);
		add(centerPanel,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
