package com.greedy.section03.abstraction;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		MenuGirl menu = new MenuGirl();
		GimbapGirl girl = new GimbapGirl();
		Guest guest = new Guest();
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("싸다김밥에 오신걸 환영합니다");
			System.out.println("1. 주문");
			System.out.println("2. 결제");
			System.out.println("3. 물건 받기");
			System.out.println("4. 영수증 받기");
			System.out.println("9. 프로그램 종료");

			int a = sc.nextInt();

			switch(a) {
			case 1: menu.showMenu();break;
			case 2: menu.payMenu();break;
			case 3: guest.receiveMenu(menu.passGimbap());break;
			case 4: guest.requestReceipt();menu.giveReciept();break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호를 선택하셨습니다.");break;
			}
		}
	}

}
