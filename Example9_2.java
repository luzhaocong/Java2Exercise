import javax.swing.*;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

class window_menu extends JFrame {
	JMenuBar menubar;
	JMenu menu, sub_menu;
	JMenuItem item1, item2;

	window_menu() {

	}

	window_menu(String s, int x, int y, int w, int h) {
		init(s);
		setLocation(x, y);
		setSize(w, h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	void init(String s) {
		setTitle(s);
		menubar = new JMenuBar();
		menu = new JMenu("菜单");
		sub_menu = new JMenu("软件项目");
		item1 = new JMenuItem("Jave话题", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\java.jpg"));
		item2 = new JMenuItem("动画话题", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\tuzi.jpg"));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.add(sub_menu);
		sub_menu.add(new JMenuItem("汽车销售系统", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\qiche.png")));
		sub_menu.add(new JMenuItem("农场信息系统", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\田.jpg")));
		menubar.add(menu);
		setJMenuBar(menubar);

	}
}

public class Example9_2 {
	public static void main(String[] args) {
		window_menu win = new window_menu("带菜单的窗口", 20, 30, 200, 190);
	}

}
