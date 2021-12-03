import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel {
	JButton b = new JButton("Hochzählen");
	JLabel l = new JLabel("000");
	JButton b1 = new JButton("Runterzählen");
	JLabel l1 = new JLabel("000");
	JButton b2 = new JButton("set to 0");
	JLabel l2 = new JLabel("000");
	SimpleButton() {
		add(b);add(l);
		add(b1);add(l1);
		add(b2);add(l2);
	}

	public static void main(String[] artgs) {
		ShowInFrame.show(new SimpleButton());

	}

}
