package 家中的电视;

public class tv {
	int channel;
	void set_channel(int m) {
		if(m>=1)
			channel = m;
	}
	int get_channel() {
		return channel;
	}
	void show_program() {
		switch(channel) {
		case 1:System.out.println("综合频道");break;
		case 2:System.out.println("经济频道");break;
		case 3:System.out.println("文艺频道");break;
		case 4:System.out.println("国际频道");break;
		case 5:System.out.println("体育频道");break;
		default :System.out.println("不能收看"+channel+"频道");
		}
	}
}

