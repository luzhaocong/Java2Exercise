package ���еĵ���;

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
		case 1:System.out.println("�ۺ�Ƶ��");break;
		case 2:System.out.println("����Ƶ��");break;
		case 3:System.out.println("����Ƶ��");break;
		case 4:System.out.println("����Ƶ��");break;
		case 5:System.out.println("����Ƶ��");break;
		default :System.out.println("�����տ�"+channel+"Ƶ��");
		}
	}
}

