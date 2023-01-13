package com.greedy.teachMe;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		  Customer cumtomer = new Customer();
			
		    Scanner sc = new Scanner(System.in);
		    
		    while(true) {
				System.out.println("====== 싸다깁밥 프로그램 =======");
				System.out.println("1. 참치김밥주문");
				System.out.println("2. 제육김밥주문");
				System.out.println("3. 영수증요청");
				System.out.println("4. 카드결제");
				System.out.println("9. 프로그램 종료");
				System.out.print("메뉴 선택 : ");
				int no = sc.nextInt();
				
				switch(no) {
					case 1 : cumtomer.order(1); break;
					case 2 : cumtomer.order(2); break;
					case 3 : cumtomer.requestReceipt(); break;
					case 4 : cumtomer.pay(); break;
				//	case 4 : cumtomer.turnOff(); break;
					case 9 : System.out.println("프로그램을 종료합니다."); return;
					default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
				}
			}
	}

}
