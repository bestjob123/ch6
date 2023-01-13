package com.greedy.teachMe;

public class Chef {
	public void makeGimbap(int num) {
		// TODO Auto-generated method stub
		String kind = "";
		
		if(num==1) {
         	kind = "참치";
         }else if(num==2) {
         	kind = "제육";
         }
		 
		System.out.println("Chef : "+kind+ "김밥이 나왔습니다.");
		
	}

}
