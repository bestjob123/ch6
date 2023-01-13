package com.greedy.teachMe;

public class OrderTaker {

    private Chef chef = new Chef();
    
    public void takeOrder(int num) {
        
    	String kind = null;
    	
        if(num==1) {
        	kind = "참치";
        }else if(num==2) {
        	kind = "제육";
        }
    	System.out.println("Order Taker : "+kind +"주문을 받았습니다");
    	
    	 if(num==1) {
 	    	chef.makeGimbap(1);

            }else if(num==2) {
            	chef.makeGimbap(2);
            	
         }
    	 

    }

	public void makeReceipt() {
		// TODO Auto-generated method stub
		
		System.out.println("Order Taker :영수증을 주었습니다");
		
	}

	public void confirmPayment() {
		// TODO Auto-generated method stub
		System.out.println("Order Taker :결제가 정상처리되었습니다");

		
	}
		

}
