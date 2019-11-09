class  battery {
	int ele;
	battery(int amount){
		ele= amount;
	}
}

class radio {
	void openradio(battery bat){
		bat.ele-=10;
	}
}
public class Example4_7 {
	public static void main(String[] args) {
		battery nanfu = new battery(100);
		System.out.println("南孚电池的储电量的："+nanfu.ele);
		radio rad = new radio();
		System.out.println("开始使用南孚电池：");
		rad.openradio(nanfu);
		System.out.println("目前南孚电池的电量为："+nanfu.ele);
		
		
	}

}
