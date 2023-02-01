package ttest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	// import statements omitted

	private MyComponent component;

	int count = 0;
	public MyFrame() {
	// size and close information omitted component = new MyComponent(this); add (component);
	}
	
	public static void main(String[] args) {
		MyFrame gui = new MyFrame();
		gui.setVisible(true);
	}	
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == component.getButton1()) {
			count++;
			component.getLabel().setText("I'm waiting, count=" + count);
		} else {
			if (e.getSource() == component.getButton2()) {
				if (count >= 3) {
				component.getLabel().setText("Boom!");
				count = 0;
				} 
				else {
				count = 0;
				}
			component.getLabel().setText("Diffused!");			
		} else {
			component.getLabel().setText(component.getTextField1().getText());
			component.getButton1().setEnabled(false); component.getButton2().setEnabled(false);
		}

	}

	}

}
