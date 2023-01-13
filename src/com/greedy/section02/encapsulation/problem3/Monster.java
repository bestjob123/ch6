package com.greedy.section02.encapsulation.problem3;

public class Monster {

	
//	String name;
	String kinds;
	int hp;
	
	public void setInfo(String info) {
//		this.name = info;
		this.kinds = info;
	}
	public void setHp(int hp) {
		if(hp>0) {
			this.hp = hp;
		}
	}
	public String getInfo() {
		
		return "몬스터의 이름은 "+ this.kinds+"이고, 체력은 " + this.hp +"입니다.";
	}
}
