import javax.swing.*;
import java.awt.*;

public class Example9_1 {
	public static void main(String[] args) {
		JFrame win1 = new JFrame("��һ������");
		JFrame win2 = new JFrame("�ڶ�������");
		Container con = win1.getContentPane();
		con.setBackground(Color.yellow);
		win1.setBounds(60, 100, 188, 108);
		win2.setBounds(260, 100, 188, 108);
		win1.setVisible(true);
		win1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win2.setVisible(true);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
