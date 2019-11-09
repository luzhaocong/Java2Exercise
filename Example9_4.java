import java.awt.*;
import javax.swing.*;

class ShowLayout extends JFrame {
	panelGridLayout pannelGrid;
	panelNullLayout panelNull;
	JTabbedPane p;

	ShowLayout() {
		pannelGrid = new panelGridLayout();
		panelNull = new panelNullLayout();
		p = new JTabbedPane();
		p.add("���񲼾ֵ����", pannelGrid);
		p.add("�ղ��ֵ����", panelNull);
		add(p, BorderLayout.CENTER);
		add(new JButton("������BorderLayout����"), BorderLayout.NORTH);
		add(new JButton("��"), BorderLayout.SOUTH);
		add(new JButton("��"), BorderLayout.WEST);
		add(new JButton("��"), BorderLayout.EAST);
		setBounds(10, 10, 570, 390);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		validate();

	}

}

class panelGridLayout extends JPanel {
	panelGridLayout() {
		GridLayout grid = new GridLayout(12, 12);
		setLayout(grid);
		Label label[][] = new Label[12][12];
		for (int i = 0; i < 12; i++)
			for (int j = 0; j < 12; j++) {
				label[i][j] = new Label();
				if ((i + j) % 2 == 0)
					label[i][j].setBackground(Color.black);
				else
					label[i][j].setBackground(Color.white);
				add(label[i][j]);
			}
	}
}

class panelNullLayout extends JPanel {
	JButton button;
	JTextField text;

	panelNullLayout() {
		setLayout(null);
		button = new JButton("ȷ��");
		text = new JTextField();
		add(text);
		add(button);
		text.setBounds(190, 30, 90, 30);
		button.setBounds(190, 30, 66, 30);

	}
}

public class Example9_4 {
	public static void main(String[] args) {
		new ShowLayout();
	}

}
