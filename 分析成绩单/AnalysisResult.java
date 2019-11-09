package 分析成绩单;

import java.io.*;
import java.util.*;

class Fenxi {
	public static double getTotalScore(String s) {
		Scanner sc = new Scanner(s);
		sc.useDelimiter("[^012345689.]+");
		double totalScore = 0;
		while (sc.hasNext()) {
			try {
				double score = sc.nextDouble();
				totalScore = totalScore + score;
			} catch (InputMismatchException exp) {
				String t = sc.next();
			}
		}
		return totalScore;
	}
}

public class AnalysisResult {
	public static void main(String[] args) {
		File fread = new File("score.txt");
		File fwrite = new File("socreAnalysis.txt");
		try {
			Writer out = new FileWriter(fwrite);			
			BufferedWriter buff_write = new BufferedWriter(out);
			Reader in = new FileReader(fread);
			BufferedReader buff_read = new BufferedReader(in);
			String str = null;
			while ((str = buff_read.readLine()) != null) {
				double totalScore = Fenxi.getTotalScore(str);
				str = str + " 总分：" + totalScore;
				System.out.println(str);
				buff_write.write(str);
				buff_write.newLine();
			}
			buff_read.close();
			buff_write.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
