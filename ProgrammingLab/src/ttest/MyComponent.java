package ttest;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyComponent {
	
	 JButton button1 =new JButton("Click Here"); 
	 JButton button2 =new JButton("Click Here");
	 JLabel label = new JLabel();
	 JTextField textField1 = new JTextField();
	 
	public JButton getButton1() {
		return button1;
	}
	public void setButton1(JButton button1) {
		this.button1 = button1;
	}
	public JButton getButton2() {
		return button2;
	}
	public void setButton2(JButton button2) {
		this.button2 = button2;
	}
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public JTextField getTextField1() {
		return textField1;
	}
	public void setTextField1(JTextField textField1) {
		this.textField1 = textField1;
	}  
	 

}
