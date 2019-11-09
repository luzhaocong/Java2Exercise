abstract class output_alphabet{
	public abstract void output();
}
class output_english extends output_alphabet{
	public void output(){
		for(char c='a';c<='z';c++){
			System.out.printf("%3c",c);
		}
	}
}

class show_board{
	void show_mess(output_alphabet show){
		show.output();
	}
}
public class Example7_2 {
	public static void main(String[] args) {
		show_board board = new show_board();
		board.show_mess(new output_english());
		System.out.println("\n");
		board.show_mess(new output_alphabet(){
			public void output(){
				for(char c='α';c<='ω';c++){
					System.out.printf("%3c", c);
				}
			}
		}
				);
	}

}
