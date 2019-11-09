package Example9_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface MyCommandListener extends ActionListener {
	public void setJTextField(JTextField text);

	public void setJTextArea(JTextArea area);
}

class PoliceListen implements MyCommandListener {
	JTextField text_input;
	JTextArea text_show;

	public void setJTextField(JTextField text) {
		text_input = text;
	}

	public void setJTextArea(JTextArea area) {
		text_show = area;
	}

	public void actionPerformed(ActionEvent e) {
		String str = text_input.getText();
		text_show.append(str + "的长度：" + str.length() + "\n");
	}
}

class WindowActionEvent extends JFrame {
	JTextField input_text;
	JTextArea text_show;
	JButton button;
	MyCommandListener listener;

	public WindowActionEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		input_text = new JTextField(10);
		button = new JButton("确定");
		text_show = new JTextArea(9, 30);
		add(input_text);
		add(button);
		add(new JScrollPane(text_show));

	}

	void setMyCommandListener(MyCommandListener listener) {
		this.listener = listener;
		listener.setJTextField(input_text);
		listener.setJTextArea(text_show);
		input_text.addActionListener(listener);
		button.addActionListener(listener);
	}
}

public class Example9_7 {

	public static void main(String[] args) {
		WindowActionEvent win = new WindowActionEvent();
		PoliceListen police = new PoliceListen();
		win.setMyCommandListener(police);
		win.setBounds(100, 100, 460, 360);
		win.setTitle("处理ActionEvent事件");
	}

}
