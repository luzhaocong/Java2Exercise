package Example9_8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.io.*;

class WindowOperation extends JFrame {
	JTextField input_number_one, input_number_two;
	JComboBox choice_fuhao;
	JTextArea text_show;
	JButton button;
	OperatorListener operator;
	ComputerListener computer;

	public WindowOperation() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.TEXT_CURSOR);
	}

	void init() {
		setLayout(new FlowLayout());
		input_number_one = new JTextField(5);
		input_number_two = new JTextField(5);
		choice_fuhao = new JComboBox();
		button = new JButton("º∆À„");
		choice_fuhao.addItem("—°‘Ò‘ÀÀ„∑˚∫≈");
		String[] a = { "+", "-", "*", "/" };
		for (int i = 0; i < a.length; i++)
			choice_fuhao.addItem(a[i]);
		text_show = new JTextArea(9, 30);
		operator = new OperatorListener();
		computer = new ComputerListener();
		operator.setJComboBox(choice_fuhao);
		operator.setWorkTogether(computer);
		computer.setJTextFieldOne(input_number_one);
		computer.setJTextFieldTwo(input_number_two);
		computer.setJTextArea(text_show);
		choice_fuhao.addItemListener(operator);
		button.addActionListener(computer);
		add(input_number_one);
		add(choice_fuhao);
		add(input_number_two);
		add(button);
		add(new JScrollPane(text_show));
	}
}

class OperatorListener implements ItemListener {
	JComboBox choice;
	ComputerListener work_together;

	public void setJComboBox(JComboBox box) {
		choice = box;
	}

	public void setWorkTogether(ComputerListener computer) {
		work_together = computer;
	}

	public void itemStateChanged(ItemEvent e) {
		String fuhao = choice.getSelectedItem().toString();
		work_together.setFuhao(fuhao);
	}
}

class ComputerListener implements ActionListener {
	JTextField input_number_one, input_number_two;
	JTextArea text_show;
	String fuhao;

	public void setJTextFieldOne(JTextField t) {
		input_number_one = t;
	}

	public void setJTextFieldTwo(JTextField t) {
		input_number_two = t;
	}

	public void setJTextArea(JTextArea area) {
		text_show = area;
	}

	public void setFuhao(String s) {
		fuhao = s;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			double number1 = Double.parseDouble(input_number_one.getText());
			double number2 = Double.parseDouble(input_number_two.getText());
			double result = 0;
			if (fuhao.equals("+"))
				result = number1 + number2;
			else if (fuhao.equals("*"))
				result = number1 * number2;
			else if (fuhao.equals("-"))
				result = number1 - number2;
			else if (fuhao.equals("/"))
				result = number1 / number2;
			text_show.append(number1 + " " + fuhao + number2 + " = " + result + "\n");
		} catch (Exception esp) {
			text_show.append("\n«Î ‰»Î ˝◊÷◊÷∑˚\n");
		}
	}

}

public class Example9_8 {

	public static void main(String[] args) {
		WindowOperation win = new WindowOperation();
		win.setBounds(100, 100, 390, 360);
		win.setTitle("ºÚµ•º∆À„∆˜");
	}

}
