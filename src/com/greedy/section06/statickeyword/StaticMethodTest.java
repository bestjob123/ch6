package com.greedy.section06.statickeyword;

public class StaticMethodTest {

	private int count;
	
	public void nonStaticMethod() {
		this.count++;
		
		System.out.println("nonStaticMethod 호출됨...");
	}
	
	public static void staticMethod() {
//		this.count++;		//static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드 여기 때문에 this에 주소가 들어갈 수 없다.
		
		System.out.println("staticMethod 호출됨...");
	}
}