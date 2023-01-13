package com.greedy.section03.abstraction;

import java.util.Scanner;

public class MenuGirl {
	
	private boolean menu;

	
	GimbapGirl make = new GimbapGirl();

	public void showMenu() {
		if(menu) {
			System.out.println("이미 주문하셨습니다.");
		} else {
			this.menu = true;
		
		System.out.println("====메뉴====");
		System.out.println("1.야채김밥 : 1000원");
		System.out.println("2.참치김밥 : 2000원");
		System.out.println("3.김치김밥 : 1500원");
		System.out.println("우리는 카드만 받습니다");

		takeMenu();
		}
//		} else {
//			this.menu = false;
//		3	System.out.println("주문완료");
//		}
	
	}
	

	public void takeMenu() {
		if(menu) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 1: make.makeYachaeGimbap();
			case 2: make.makeChamchiGimbap();break;
			case 3: make.makeGimchiGimbap();break;
			default:System.out.println("잘못된 번호를 선택하셨습니다.");break;
		}
		} else {System.out.println("주문을 먼저해주세요.");
		
		}
	}
		
		public void payMenu() {
			if(menu) {
			System.out.println("결제가 완료되었습니다.");
		} else {System.out.println("주문이 안되어 있습니다.");}
		}
		
		public void giveReciept() {
			if(menu) {
			System.out.println("사장: 영수증입니다.");
		}else System.out.println("결제가 안되어 있습니다.");
			}
		public boolean passGimbap() {
			if(menu) {
				System.out.println("알바생 : 김밥을 건내줍니다.");
			} else System.out.println("주문이 되어있지 않습니다.");
			
			return menu;
		}
		

//	}
}
