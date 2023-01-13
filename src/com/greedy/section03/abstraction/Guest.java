package com.greedy.section03.abstraction;

public class Guest {


	public void requestReceipt() {
		System.out.println("고객 : 영수증 요청합니다.");
	}
	public void paywithCard() {
		System.out.println("고객 : 카드 여기있습니다.");
	}
	public void receiveMenu(boolean menu) {
		if(menu) {
			System.out.println("고객 : 음식받았습니다.");
		}
		else { System.out.println("주문받지 않았습니다.");


		}
		}
}
