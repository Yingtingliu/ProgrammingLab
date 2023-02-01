package lab_Swing1;
// The fully pretty one!
// Simply add labels with string "NORTH", "EAST", "SOUTH", "WEST" to a JFrame with Border Layout

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderFrame extends JFrame {

	public BorderFrame() {
		this.setTitle("Border layout for JFrame");
		final int WIDTH = 400;
		this.setSize(WIDTH, WIDTH);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		//now I'm adding panels to all sides so that I can add border
		//didn't originally need for the E and W ones
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel leftLabel = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E &nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
		this.add(leftLabel, BorderLayout.WEST);
		
		JLabel rightLabel = new JLabel("<html>&nbsp E &nbsp<br>&nbsp A &nbsp<br>&nbsp S &nbsp<br>&nbsp T &nbsp</html>");
		this.add(rightLabel, BorderLayout.EAST);
		
		JPanel topPanel = new JPanel(); //have to use panels for N & S to center
		JLabel topLabel = new JLabel("NORTH");
		topPanel.add(topLabel);
		this.add(topPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridBagLayout());
		JLabel centerLabel = new JLabel("CENTER"); // have to use this layout to center both horizontally and vertically!!!
		centerPanel.add(centerLabel);
		
		JPanel bottomPanel = new JPanel();
		JLabel bottomLabel = new JLabel("SOUTH");
		bottomPanel.add(bottomLabel);
		this.add(bottomPanel, BorderLayout.SOUTH);
		topPanel.setBorder(blackline);
		bottomPanel.setBorder(blackline);
		centerPanel.setBorder(blackline);
		this.add(centerPanel, BorderLayout.CENTER);
		
		
		
		//make fonts in labels bigger
		Font f = new Font("TimesRoman", Font.PLAIN, 24);
		 //Set JLabel font using new created font
		 topLabel.setFont(f);
		 bottomLabel.setFont(f);
		 leftLabel.setFont(f);
		 rightLabel.setFont(f);
		 centerLabel.setFont(f);
		 

		

	}

	/*
	 * Main method -- creates the BorderFrame object
	 */
	public static void main(String[] args) {

		BorderFrame gui = new BorderFrame();
		gui.setVisible(true);
	}
}
