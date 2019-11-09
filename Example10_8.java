import java.io.*;

public class Example10_8 {
	public static void main(String[] args) {
		RandomAccessFile inAndout = null;
		int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			inAndout = new RandomAccessFile("tom.dat", "rw");
			for (int i = 0; i < data.length; i++) {
				inAndout.writeInt(data[i]);
			}
			for (long i = data.length - 1; i >= 0; i--) {
				inAndout.seek(i * 4);
				System.out.printf("\t%d", inAndout.readInt());
			}
			inAndout.close();
		} catch (IOException e) {

		}
	}

}
