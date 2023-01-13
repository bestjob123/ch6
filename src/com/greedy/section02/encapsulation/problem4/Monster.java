package com.greedy.section02.encapsulation.problem4;

public class Monster {

	/* 필드 (== 전역변수 == 멤버변수 == 인스턴스변수) */
	
	/* 접근 제한자
	 * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다ㅣ.
	 * 1. public : 모든 패키지에서 접근이 가능
	 * 2. protected : 동일 패키지에서만 접근이 가능 단, 상속관계에 있는 경우 다른 패키지에서 접근가능
	 * 3. default : 동일 패키지에서만 접근이 가능
	 * 4. private : 클래스 내에서만 접근 가능
	 * */
	private String kinds;
	private int hp;
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		}
	}
	
	public String getInfo() {
		return "몬스터의 종류는 "+ this.kinds + "이고, 체력은 " + this.hp +"입니다.";
	}
}
