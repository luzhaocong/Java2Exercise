package 货车的装载量;
interface computerweight {
	public double computer_weight();
}
class television implements computerweight {
	public double computer_weight(){
		return 3.5;
	}
}

class computer implements computerweight {
	public double computer_weight(){
		return 2.5;
	}
}

class washmachine implements computerweight {
	public double computer_weight(){
		return 4.5;
	}
}

class truck{
	computerweight [] goods;
	double total_weights = 0;
	truck(computerweight [] goods){
		this.goods= goods;
	}
	public void set_goods (computerweight [] goods){
		this.goods=goods;
	}
	public double get_total_weights(){
		total_weights=0;
		for(int i=0;i<goods.length;i++){
			total_weights+=goods[i].computer_weight();
		}
		return total_weights;
	}
}

public class checkcarweight {
	public static void main(String args[]){
		computerweight [] goods= new computerweight[650];
		for(int i= 0;i<goods.length;i++){
			if(i%3==0)
				goods[i]=new television();
			else if(i%3==1)
				goods[i] = new computer();
			else
				goods[i]= new washmachine();
		}
		truck t=new truck(goods);
		System.out.printf("\n货车装载的货物重量：%-8.5f kg\n",t.get_total_weights());
		goods=new computerweight[68];
		for(int i=0;i<goods.length;i++){
			if(i%2==0)
				goods[i]=new television();
			else
				goods[i] = new washmachine();
		}
		t.set_goods(goods);
		System.out.printf("货车装载的货物重量：%-8.5f kg\n",t.get_total_weights());
	}
}