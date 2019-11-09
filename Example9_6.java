import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class WindowActionEvent extends JFrame {
	JTextField text;
	ActionListener listener;

	public WindowActionEvent() {
		setLayout(new FlowLayout());
		text = new JTextField(10);
		add(text);
		listener = new ReaderListen();
		text.addActionListener(listener);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ReaderListen implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		System.out.println(str + ":" + str.length());
	}
}

public class Example9_6 {

	public static void main(String[] args) {
		WindowActionEvent win = new WindowActionEvent();
		win.setTitle("处理ActionEvent事件");
		win.setBounds(100, 100, 310, 260);
	}

}
