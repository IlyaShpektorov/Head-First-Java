package Part2;

import java.util.Scanner;

public class Television {
	int currectChannel;
	int currectVolume;
	//������ ����/���
	boolean status;

	
	//����������� ���������
	public void show() {
		while (status = true) {
			//showTV
			System.out.println("TV on");
		};
	}
	
	//������ � ��������
	public void channelUp() {
		currectChannel++;
		if (currectChannel > 40 ) {
			currectChannel = 0;
		};
		System.out.println(currectChannel);
	}
	
	public void channelDown() {
		currectChannel--;
		if (currectChannel <= 0 ) {
			currectChannel = 40;
		};
		System.out.println("�����: " + currectChannel);
	}
	
	public void chooseChannel() {
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		
		currectChannel = sc1.nextInt();
		
		if (currectChannel <= 0 ) {
			currectChannel = 0;
		} if (currectChannel > 40 ) {
			currectChannel = 40;
		};
		System.out.println("�����: " + currectChannel);
	}
	
	//������ � ����������
	
	public void volumeUp() {
		currectVolume++;
		
	}
	
	public void volumeDown() {
		currectVolume--;	
	}
	
	public void chooseVolume(int volume) {
		currectVolume = volume;
		System.out.println("���������: "+ currectVolume);
		
		if (currectVolume > 100) {
			currectVolume = 100;
			System.out.println("Max Volume");
		} if (currectVolume < 0) {
			currectVolume = 0;
			System.out.println("Min Volume");
		} 
	}
	
	public void volumeMute() {
		currectVolume = 0;	
	}
	
}
