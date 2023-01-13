package com.greedy.teachMe;

public class Customer {

	    
		int num;
		
		private OrderTaker orderTaker = new OrderTaker();
		
		
		public void order(int num) {
			// TODO Auto-generated method stub
			
			this.num = num;
			
			orderTaker.takeOrder(num);
					
		}

		public void requestReceipt() {
			// TODO Auto-generated method stub
			System.out.println("Customer : 영수증을 요청합니다");
			orderTaker.makeReceipt();
			
		}

		public void pay() {
			// TODO Auto-generated method stub
			System.out.println("Customer : 카드결제했습니다");
			orderTaker.confirmPayment();
			

			
		}
		
		

	
}
