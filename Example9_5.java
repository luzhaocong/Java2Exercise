import javax.swing.*;

class WindowBoxLayout extends JFrame {
	Box boxh, box_vone, box_vtwo;

	public WindowBoxLayout() {
		setLayout(new java.awt.FlowLayout());
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	void init() {
		boxh = Box.createHorizontalBox();
		box_vone = Box.createVerticalBox();
		box_vtwo = Box.createVerticalBox();
		box_vone.add(new JLabel("姓名:"));
		box_vone.add(new JLabel("职业:"));
		box_vtwo.add(new JTextField(10));
		box_vtwo.add(new JTextField(10));
		boxh.add(box_vone);
		boxh.add(Box.createHorizontalStrut(10));
		boxh.add(box_vtwo);
		add(boxh);

	}
}

public class Example9_5 {

	public static void main(String[] args) {
		WindowBoxLayout win = new WindowBoxLayout();
		win.setBounds(100, 100, 310, 260);
		win.setTitle("嵌套盒式布局容器");
	}

}
