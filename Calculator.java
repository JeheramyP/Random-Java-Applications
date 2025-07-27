import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Calculator extends JFrame {
	JComboBox operation = new JComboBox();
	JTextField inputField = new JTextField(30);
	JButton calculate = new JButton("Calculate");
	JLabel label = new JLabel("Select your operation and enter numbers in the text field.");
	
	 	public Calculator() {
		super("Calculator");
		setSize(550, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		operation.addItem("Add");
		operation.addItem("Subtract");
		operation.addItem("Multiply");
		operation.addItem("Divide");
		operation.addItem("Modulus");
		operation.setEditable(false);
		add(label);
		add(inputField);
		add(operation);
		add(calculate);
		ActionListener act = (event) -> {
			if (event.getSource() == calculate) {
				if (operation.toString().endsWith("Add]")) {
					add();
				}
				if (operation.toString().endsWith("Subtract]")) {
					subtract();
				}
				if (operation.toString().endsWith("Multiply]")) {
					multiply();
				}
				if (operation.toString().endsWith("Divide]")) {
					divide();
				}
				if (operation.toString().endsWith("Modulus]")) {
					modulus();
				}
			}
		};
		calculate.addActionListener(act);
		setVisible(true);
	}
	 	
	 	public void add() {
	 		float sum = 0;
	 		boolean shouldOutputSum = true;
	 		StringTokenizer st = new StringTokenizer(inputField.getText());
	 		try {
	 			int times = st.countTokens();
	 			float[] args = new float[times];
	 			if (args.length > 1) {
	 				for (int i = 0; i < times; i++) {
	 					try {
	 						args[i] = Float.parseFloat(st.nextToken());
	 						sum += args[i];
	 					} catch (NumberFormatException e) {
	 						label.setText("All arguments must be numbers.");
	 						shouldOutputSum = false;
	 						break;
	 					}
	 				}
	 				if (shouldOutputSum) {
	 					label.setText("The sum of those numbers is " + sum);
	 				}
	 				
	 				sum = 0;
	 			} else {
	 				label.setText("You must have at least two arguments.");
	 			}
	 			
	 		} catch (NoSuchElementException exc) {
	 			// ignore error
	 		}
	 	}
	 	
	 	public void subtract() {
	 		float difference = 0;
	 		boolean shouldOutputDiff = true;
	 		StringTokenizer st = new StringTokenizer(inputField.getText());
	 		try {
	 			int times = st.countTokens();
	 			float[] args = new float[times];
	 			if (args.length > 1) {
	 				for (int i = 0; i < times; i++) {
	 					try {
	 						args[i] = Float.parseFloat(st.nextToken());
	 						if (i == 0) {
	 							// do nothing
	 						} else if (i == 1) {
	 							difference = args[0] - args[1];
	 						} else {
	 							difference -= args[i];
	 						}
	 					
	 					} catch (NumberFormatException e) {
	 						label.setText("All arguments must be numbers.");
	 						shouldOutputDiff = false;
	 						break;
	 					}
	 				}
	 				if (shouldOutputDiff) {
	 					label.setText("The difference between those numbers is " + difference);
	 				}
	 				
	 				difference = 0;
	 			} else {
	 				label.setText("You must have at least two arguments");
	 			}
	 			
	 		} catch (NoSuchElementException exc) {
	 			// ignore error
	 		}
	 	}
	 	
	 	public void multiply() {
	 		float product = 0;
	 		boolean shouldOutputProduct = true;
	 		StringTokenizer st = new StringTokenizer(inputField.getText());
	 		try {
	 			int times = st.countTokens();
	 			float[] args = new float[times];
	 			if (args.length > 1) {
	 				for (int i = 0; i < times; i++) {
	 					try {
	 						args[i] = Float.parseFloat(st.nextToken());
	 						if (i == 0) {
	 							// do nothing
	 						} else if (i == 1) {
	 							product = args[0] * args[1];
	 						} else {
	 							product *= args[i];
	 						}
	 					
	 					} catch (NumberFormatException e) {
	 						label.setText("All arguments must be numbers.");
	 						shouldOutputProduct = false;
	 						break;
	 					}
	 				}
	 				if (shouldOutputProduct) {
	 					label.setText("The product of those numbers is " + product);
	 				}
	 				
	 				product = 0;
	 			} else {
	 				label.setText("You must have at least two arguments.");
	 			}
	 			
	 		} catch (NoSuchElementException exc) {
	 			// ignore error
	 		}
	 	}
	 	
	 	public void divide() {
	 		float quotient = 0;
	 		boolean shouldOutputQuotient = true;
	 		StringTokenizer st = new StringTokenizer(inputField.getText());
	 		try {
	 			int times = st.countTokens();
	 			float[] args = new float[times];
	 			if (args.length > 1) {
	 				for (int i = 0; i < times; i++) {
	 					try {
	 						args[i] = Float.parseFloat(st.nextToken());
	 						if (i == 0) {
	 							// do nothing
	 						} else if (i == 1) {
	 							quotient = args[0] / args[1];
	 						} else {
	 							quotient /= args[i];
	 						}
	 					
	 					} catch (NumberFormatException e) {
	 						label.setText("All arguments must be numbers.");
	 						shouldOutputQuotient = false;
	 						break;
	 					}
	 				}
	 				if (shouldOutputQuotient) {
	 					if (!Float.isInfinite(quotient)) {
	 						label.setText("The quotient of those numbers is " + quotient);
	 					} else {
	 						label.setText("You cannot divide by zero.          ");
	 					}
	 					
	 				}
	 				
	 				quotient = 0;
	 			} else {
	 				label.setText("You must have at least two arguments.");
	 			}
	 			
	 		} catch (NoSuchElementException exc) {
	 			// ignore error
	 		}
	 	}
	 	
	 	public void modulus() {
	 		float modulus = 0;
	 		boolean shouldOutputModulus = true;
	 		StringTokenizer st = new StringTokenizer(inputField.getText());
	 		try {
	 			int times = st.countTokens();
	 			float[] args = new float[times];
	 			if (args.length > 1) {
	 				for (int i = 0; i < times; i++) {
	 					try {
	 						args[i] = Float.parseFloat(st.nextToken());
	 						if (i == 0) {
	 							// do nothing
	 						} else if (i == 1) {
	 							modulus = args[0] % args[1];
	 						} else {
	 							modulus %= args[i];
	 						}
	 					
	 					} catch (NumberFormatException e) {
	 						label.setText("All arguments must be numbers.");
	 						shouldOutputModulus = false;
	 						break;
	 					}
	 				}
	 				if (shouldOutputModulus) {
	 					if (!Float.isNaN(modulus)) {
	 						label.setText("The the remainder from dividing those numbers is " + modulus);
	 					} else {
	 						label.setText("You cannot divide by zero.          ");
	 					}
	 					
	 				}
	 				
	 				modulus = 0;
	 			} else {
	 				label.setText("You must have at least two arguments.");
	 			}
	 			
	 		} catch (NoSuchElementException exc) {
	 			// ignore error
	 		}
	 	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}
