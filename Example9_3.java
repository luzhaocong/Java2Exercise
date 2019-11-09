import java.awt.*;

import javax.swing.*;

class ComponentInWindow extends JFrame {
	JCheckBox check_box1, check_box2;
	JRadioButton radiom, radiof;
	ButtonGroup group;
	JComboBox combox;

	ComponentInWindow() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void init() {
		setLayout(new FlowLayout());
		combox = new JComboBox();
		check_box1 = new JCheckBox("喜欢音乐");
		check_box2 = new JCheckBox("喜欢旅游");
		group = new ButtonGroup();
		radiom = new JRadioButton("男");
		radiof = new JRadioButton("女");
		group.add(radiom);
		group.add(radiof);
		add(check_box1);
		add(check_box2);
		add(radiom);
		add(radiof);
		combox.addItem("音乐天地");
		combox.addItem("武术天地");
		add(combox);
	}
}

public class Example9_3 {
	public static void main(String[] args) {
		ComponentInWindow win = new ComponentInWindow();
		win.setBounds(100, 100, 450, 260);
		win.setTitle("常用组件");
	}

}
