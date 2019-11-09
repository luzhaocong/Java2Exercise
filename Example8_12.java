import java.util.*;

class pricetoken {
	public double get_price_sum(String shopping_receipt) {
		String regex = "[^0123456789.]+";
		shopping_receipt = shopping_receipt.replaceAll(regex, "#");
		StringTokenizer fenxi = new StringTokenizer(shopping_receipt, "#");
		double sum = 0;
		while (fenxi.hasMoreElements()) {
			String item = fenxi.nextToken();
			double price = Double.parseDouble(item);
			sum += price;
		}
		return sum;
	}

	public double get_aver_price(String shopping_receipt) {
		double price_sum = get_price_sum(shopping_receipt);
		int goods_amount = get_goods_amount(shopping_receipt);
		return price_sum / goods_amount;
	}

	public int get_goods_amount(String shopping_receipt) {
		String regex = "[^0123456789.]+";
		shopping_receipt = shopping_receipt.replaceAll(regex, "#");
		StringTokenizer fenxi = new StringTokenizer(shopping_receipt, "#");
		int amount = fenxi.countTokens();
		return amount;
	}
}

public class Example8_12 {

	public static void main(String[] args) {
		String shopping_receipt = "牛奶：8.5元，香蕉3.6元，酱油2.8元";
		pricetoken look_price_mess = new pricetoken();
		System.out.println(shopping_receipt);
		double sum = look_price_mess.get_price_sum(shopping_receipt);
		System.out.printf("购物总价格%-7.2f", sum);
		int amount = look_price_mess.get_goods_amount(shopping_receipt);
		double aver = look_price_mess.get_aver_price(shopping_receipt);
		System.out.printf("\n商品数目：%d，平均价格：%-7.2f", amount, aver);
	}

}
