package Example5_2;

class goods{
	public double weight;
	public void old_set_weight(double w) {
		weight = w;
		System.out.println("double�͵�weight="+weight);
	}
	public double old_get_price() {
		double price = weight*10;
		return price;
	}
}

class cheapgoods extends goods {
	public int weight;
	public void new_set_weight(int w) {
		weight = w;
		System.out.println("int�͵�weight="+weight);
	}
	public double new_get_price() {
		return weight*10;
	}
}
public class Example5_3 {

	public static void main(String[] args) {
		cheapgoods cg = new cheapgoods();
		cg.new_set_weight(198);
		System.out.println("����cheapgoods��weight��ֵ�ǣ�"+cg.weight);
		System.out.println("cheapgoods�������������Żݷ�������۸�"+cg.new_get_price());
		cg.old_set_weight(198.987);
		System.out.println("cheapgoodsʹ�ü̳еķ��������Żݣ�����۸�"+cg.old_get_price());

	}

}
