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
		menu = new JMenu("�˵�");
		sub_menu = new JMenu("�����Ŀ");
		item1 = new JMenuItem("Jave����", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\java.jpg"));
		item2 = new JMenuItem("��������", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\tuzi.jpg"));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.add(sub_menu);
		sub_menu.add(new JMenuItem("��������ϵͳ", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\qiche.png")));
		sub_menu.add(new JMenuItem("ũ����Ϣϵͳ", new ImageIcon("C:\\Users\\Administrator\\Desktop\\lzc\\Image\\��.jpg")));
		menubar.add(menu);
		setJMenuBar(menubar);

	}
}

public class Example9_2 {
	public static void main(String[] args) {
		window_menu win = new window_menu("���˵��Ĵ���", 20, 30, 200, 190);
	}

}
