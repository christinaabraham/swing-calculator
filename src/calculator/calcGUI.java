package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	private String operator;
	private double firstVal, secondVal, result;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 6));
		frame.setBounds(100, 100, 288, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(23, 25, 232, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC.setBounds(83, 92, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnReturn = new JButton("\u0008");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = textField.getText();
				if(txt.length() != 0)
					textField.setText(txt.substring(0, txt.length() - 1));
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturn.setBounds(23, 91, 50, 50);
		frame.getContentPane().add(btnReturn);
		
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstVal = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "\u00F7";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivide.setBounds(203, 93, 50, 50);
		frame.getContentPane().add(btnDivide);

		
		// ----------------- Row 1 -----------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn7.getText();
				textField.setText(input);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(23, 154, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn8.getText();
				textField.setText(input);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(83, 154, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn9.getText();
				textField.setText(input);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(143, 154, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnTimes = new JButton("x");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstVal = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x";
			}
		});
		btnTimes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTimes.setBounds(203, 154, 50, 50);
		frame.getContentPane().add(btnTimes);
		
		
		// ----------------- Row 2 -----------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn4.getText();
				textField.setText(input);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(23, 215, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn5.getText();
				textField.setText(input);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(83, 215, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn6.getText();
				textField.setText(input);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(143, 215, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstVal = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMinus.setBounds(203, 215, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		
		// ----------------- Row 3 -----------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn1.getText();
				textField.setText(input);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(23, 276, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn2.getText();
				textField.setText(input);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(83, 276, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn3.getText();
				textField.setText(input);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(143, 276, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstVal = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlus.setBounds(203, 276, 50, 50);
		frame.getContentPane().add(btnPlus);

		
		// ----------------- Row 4 -----------------
		
		JButton btnOps = new JButton("+/-");
		btnOps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() != 0) {
					double opposite = Double.parseDouble(String.valueOf(textField.getText()));
					opposite *= -1;
					textField.setText(String.valueOf(opposite));
				}
			}
		});
		btnOps.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOps.setBounds(23, 337, 50, 50);
		frame.getContentPane().add(btnOps);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText() + btn0.getText();
				textField.setText(input);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(83, 337, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnPeriod = new JButton(".");
		btnPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          textField.setText(textField.getText() + btnPeriod.getText());
			}
		});
		btnPeriod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPeriod.setBounds(143, 337, 50, 50);
		frame.getContentPane().add(btnPeriod);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result;
				secondVal = Double.parseDouble(textField.getText());
				
				if(operator == "+") {
					result = String.format("%.2f", firstVal + secondVal);
					textField.setText(result);
				} else if(operator == "-") {
					result = String.format("%.2f", firstVal - secondVal);
					textField.setText(result);
				} else if(operator == "x") {
					result = String.format("%.2f", firstVal * secondVal);
					textField.setText(result);
				} else if(operator == "\u00F7") {
					result = String.format("%.2f", firstVal / secondVal);
					textField.setText(result);
				} else if(operator == "%") {
					result = String.format("%.2f", firstVal % secondVal);
					textField.setText(result);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEquals.setBounds(203, 337, 50, 50);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstVal = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPercent.setBounds(143, 92, 50, 50);
		frame.getContentPane().add(btnPercent);
	}
}
