import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FunGraphics extends JFrame {
	JButton red = new JButton("Red");
	JButton blue = new JButton("Blue");
	JButton green = new JButton("Green");
	JButton yellow = new JButton("Yellow");
	
	public FunGraphics() {
		super("Fun Graphics");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		ActionListener act = (event) -> {
			if (event.getSource() == red) {
				this.getContentPane().setBackground(Color.RED);
			}
			
			if (event.getSource() == blue) {
				this.getContentPane().setBackground(Color.BLUE);
			}
			
			if (event.getSource() == green) {
				this.getContentPane().setBackground(Color.GREEN);
			}
			
			if (event.getSource() == yellow) {
				this.getContentPane().setBackground(Color.YELLOW);
			}
			
		};
		add(red);
		red.addActionListener(act);
		add(blue);
		blue.addActionListener(act);
		add(green);
		green.addActionListener(act);
		add(yellow);
		yellow.addActionListener(act);
		setVisible(true);
	}

	public void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// do nothing
		}
	}
	
	public static void main(String[] args) {
		new FunGraphics();

	}

}
