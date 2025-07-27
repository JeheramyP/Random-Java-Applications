import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BetterCalculator extends JFrame {
	JTextField inputField = new JTextField();
	JButton equals = new JButton("=");
	JButton undo = new JButton("↩");
	JButton clear = new JButton("C");
	JButton square = new JButton("x²");
	
	boolean shouldOutputResult;
	
	public BetterCalculator() {
		super("Calculator");
		setSize(600, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		inputField.setFont(new Font("SansSerif", Font.PLAIN, 22));
		inputField.setEditable(false);
		// prepare user interface
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(gridbag);
		
		// set up action listener
		ActionListener act = (event) -> {
			String buttonString = event.getActionCommand();
			if ((event.getSource() != equals) && (event.getSource() != undo) && (event.getSource() != square) && (event.getSource() != clear)) {
				inputField.setText(inputField.getText() + buttonString);
				
			} else if (event.getSource() == equals) {
				calculate();
				
			} else if (event.getSource() == undo) {
				undo();
				
			} else if (event.getSource() == square) {
				inputField.setText(inputField.getText() + "²");
				
			} else if (event.getSource() == clear) {
				clear();
				
			}
		};
		
		// local inner class containing a method to create buttons
		class Inner {
			protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints c) {
				 Button button = new Button(name);
		         gridbag.setConstraints(button, c);
		         button.setFont(new Font("SansSerif", Font.BOLD, 16));
		         add(button);
		         button.addActionListener(act);
			}
		}
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(inputField, c);
		add(inputField);
		
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.gridwidth = 1;
		c.fill = GridBagConstraints.BOTH;
		
		Inner instance = new Inner();
		
		instance.makebutton("7", gridbag, c);
		instance.makebutton("8", gridbag, c);
		instance.makebutton("9", gridbag, c);
		instance.makebutton("÷", gridbag, c);
		gridbag.setConstraints(undo, c);
        undo.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(undo);
		undo.addActionListener(act);
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		gridbag.setConstraints(clear, c);
        clear.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(clear);
		clear.addActionListener(act);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.BOTH;
		instance.makebutton("4", gridbag, c);
		instance.makebutton("5", gridbag, c);
		instance.makebutton("6", gridbag, c);
		instance.makebutton("×", gridbag, c);
		instance.makebutton("(", gridbag, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		instance.makebutton(")", gridbag, c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.BOTH;
		instance.makebutton("1", gridbag, c);
		instance.makebutton("2", gridbag, c);
		instance.makebutton("3", gridbag, c);
		instance.makebutton("-", gridbag, c);
		gridbag.setConstraints(square, c);
        square.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(square);
		square.addActionListener(act);
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		instance.makebutton("√", gridbag, c);
		
		c.gridwidth = 1;
		c.fill = GridBagConstraints.BOTH;
		instance.makebutton("0", gridbag, c);
		instance.makebutton(".", gridbag, c);
		instance.makebutton("%", gridbag, c);
		instance.makebutton("+", gridbag, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		equals.setBackground(Color.GREEN);
		gridbag.setConstraints(equals, c);
        equals.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(equals);
		equals.addActionListener(act);
		
		setVisible(true);
	}
	
	public void calculate() {
		StringTokenizer st = new StringTokenizer(inputField.getText(), "÷×-+%^()");
		//StringTokenizer stDiv = new StringTokenizer(inputField.getText(), "÷");
		//StringTokenizer stMult = new StringTokenizer(inputField.getText(), "×");
		//StringTokenizer stSub = new StringTokenizer(inputField.getText(), "-");
		//StringTokenizer stAdd = new StringTokenizer(inputField.getText(), "+");
		try {
			float result = 0.0F;
 			float[] args = new float[st.countTokens()];
 			if (args.length > 0) {
 				for (int i = 0; i < args.length; i++) {
 					try {
 	 					if (hasChar(inputField.getText(), '÷')) {
 	 						
 	 						shouldOutputResult = true;
 	 						args[i] = Float.parseFloat(st.nextToken());
 	 						try {
 	 							
 	 							result = args[0] / args[1];
 	 							
 	 						} catch (Exception e) {
 	 							System.out.println(e.getMessage());
 	 						}
 	 						
 	 					}
 	 					
 	 				} catch(NumberFormatException e) {
 	 					System.out.println(e.getMessage());
 	 				} catch (ArithmeticException e) {
 	 					System.out.println(e.getMessage());
 	 				}
 	 				
 	 			} // end of for loop
 				
 				for (int i = 0; i < args.length; i++) {
 					try {
 						
 						if (hasChar(inputField.getText(), '×')) {
 							
 							shouldOutputResult = true;
 							args[i] = Float.parseFloat(st.nextToken());
 							try {
 								
 								result = args[0] * args[1];
 								
 							} catch (Exception e) {
 								System.out.println(e.getMessage());
 							}
 							
 						}
 						
 					} catch (NumberFormatException e ) {
 						System.out.println(e.getMessage());
 					} catch (ArithmeticException e) {
 						System.out.println(e.getMessage());
 					}
 					
 					
 				} // end of for loop
 				
 				for (int i = 0; i < args.length; i++) {
 					try {
 						
 						if (hasChar(inputField.getText(), '+')) {
 							
 							shouldOutputResult = true;
 							args[i] = Float.parseFloat(st.nextToken());
 							try {
 								
 								result = args[0] + args[1];
 								
 							} catch (Exception e) {
 								System.out.println(e.getMessage());
 							}
 							
 						}
 						
 					} catch (NumberFormatException e ) {
 						System.out.println(e.getMessage());
 					} catch (ArithmeticException e) {
 						System.out.println(e.getMessage());
 					}
 					
 					
 				} // end of for loop
 				
 				for (int i = 0; i < args.length; i++) {
 					try {
 						
 						if (hasChar(inputField.getText(), '-')) {
 							
 							shouldOutputResult = true;
 							args[i] = Float.parseFloat(st.nextToken());
 							try {
 								
 								result = args[0] - args[1];
 								
 							} catch (Exception e) {
 								System.out.println(e.getMessage());
 							}
 							
 						}
 						
 					} catch (NumberFormatException e ) {
 						System.out.println(e.getMessage());
 					} catch (ArithmeticException e) {
 						System.out.println(e.getMessage());
 					}
 					
 					
 				} // end of for loop
 			
 				if (shouldOutputResult) {
 					inputField.setText("" + result);
 					result = 0;
 				}
 				
 			}
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void undo() {
		try {
			inputField.setText(inputField.getText().substring(0, inputField.getText().length() - 1));
		} catch (StringIndexOutOfBoundsException e) {
			// ignore error
		}
		
	}
	
	public void clear() {
		inputField.setText("");
	}
	
	public boolean hasChar(String str, char character) {
		if (str.indexOf(character) != -1) {
			return true;
		}
		return false;
	}
	
	public void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// do nothing
		}
	}
	
	public static void main(String[] args) {
		new BetterCalculator();
	}
	
}
