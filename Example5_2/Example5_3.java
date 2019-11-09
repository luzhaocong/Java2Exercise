package Example5_2;

class goods{
	public double weight;
	public void old_set_weight(double w) {
		weight = w;
		System.out.println("double型的weight="+weight);
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
		System.out.println("int型的weight="+weight);
	}
	public double new_get_price() {
		return weight*10;
	}
}
public class Example5_3 {

	public static void main(String[] args) {
		cheapgoods cg = new cheapgoods();
		cg.new_set_weight(198);
		System.out.println("对象cheapgoods的weight的值是："+cg.weight);
		System.out.println("cheapgoods用子类新增的优惠方法计算价格："+cg.new_get_price());
		cg.old_set_weight(198.987);
		System.out.println("cheapgoods使用继承的方法（无优惠）计算价格："+cg.old_get_price());

	}

}
