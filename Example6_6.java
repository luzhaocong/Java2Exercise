interface advertisement {
	public void show_advertisement();

	public String get_corp_name();
}

class advertisementboard {
	public void show(advertisement adver) {
		System.out.println(adver.get_corp_name() + "�Ĺ�������:");
		adver.show_advertisement();
	}
}

class whitecloudcorp implements advertisement {
	public void show_advertisement() {
		System.out.println("@@@@@@@@@\n�ɻ��е�ս������Ŷyes��\n@@@@@@@@@");
	}

	public String get_corp_name() {
		return "���Ƽ���";
	}
}

class blacklandcorp implements advertisement {
	public void show_advertisement() {
		System.out.println("********\n�Ͷ��ǵ�\n��������\n********");
	}

	public String get_corp_name() {
		return "��������";
	}
}

public class Example6_6 {

	public static void main(String[] args) {
		advertisementboard board = new advertisementboard();
		board.show(new whitecloudcorp());
		board.show(new blacklandcorp());
	}

}
