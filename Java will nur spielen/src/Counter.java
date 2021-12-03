import javax.swing.*;

import util.ShowInFrame;

import java.awt.event.*;

public class Counter extends SimpleButton{
	public int i=0;
	public Counter() {
		b.addActionListener(
				new ActionListener(){
			   
				public void actionPerformed(ActionEvent e) {
				i++;
				l.setText(""+i);
				}
		}
	);
		b1.addActionListener(
				new ActionListener(){
			    
				public void actionPerformed(ActionEvent e) {
				i--;
				l.setText(""+i);
				}
		}
	);
		b2.addActionListener(
				new ActionListener(){
			    
				public void actionPerformed(ActionEvent e) {
				i=0;
				l.setText("0");
				}
		}
	);
}

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());

	}
}
