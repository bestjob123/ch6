package com.greedy.section06.statickeyword;

public class StaticFieldTest {

	/* 필드 작성 위치 
	 * 1. non - static field
	 * 2. static field
	 * */
	private int nonStaticCount;
	private static int staticCount;
	
	public StaticFieldTest() {}
	
	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	public int getStaticCount() {
		return StaticFieldTest.staticCount;
	}
	
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	public void increaseStaticCOunt() {
		StaticFieldTest.staticCount++;
	}
	
}
