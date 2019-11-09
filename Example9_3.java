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
		check_box1 = new JCheckBox("ϲ������");
		check_box2 = new JCheckBox("ϲ������");
		group = new ButtonGroup();
		radiom = new JRadioButton("��");
		radiof = new JRadioButton("Ů");
		group.add(radiom);
		group.add(radiof);
		add(check_box1);
		add(check_box2);
		add(radiom);
		add(radiof);
		combox.addItem("�������");
		combox.addItem("�������");
		add(combox);
	}
}

public class Example9_3 {
	public static void main(String[] args) {
		ComponentInWindow win = new ComponentInWindow();
		win.setBounds(100, 100, 450, 260);
		win.setTitle("�������");
	}

}
