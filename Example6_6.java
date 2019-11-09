interface advertisement {
	public void show_advertisement();

	public String get_corp_name();
}

class advertisementboard {
	public void show(advertisement adver) {
		System.out.println(adver.get_corp_name() + "的广告词如下:");
		adver.show_advertisement();
	}
}

class whitecloudcorp implements advertisement {
	public void show_advertisement() {
		System.out.println("@@@@@@@@@\n飞机中的战斗机，哦yes！\n@@@@@@@@@");
	}

	public String get_corp_name() {
		return "白云集团";
	}
}

class blacklandcorp implements advertisement {
	public void show_advertisement() {
		System.out.println("********\n劳动是爹\n土地是妈\n********");
	}

	public String get_corp_name() {
		return "黑土集团";
	}
}

public class Example6_6 {

	public static void main(String[] args) {
		advertisementboard board = new advertisementboard();
		board.show(new whitecloudcorp());
		board.show(new blacklandcorp());
	}

}
