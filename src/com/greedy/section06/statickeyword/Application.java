package com.greedy.section06.statickeyword;

public class Application {

	public static void main(String[] args) {

		StaticFieldTest sft1 = new StaticFieldTest();
		
		System.out.println("non-static field :" + sft1.getNonStaticCount());
		System.out.println("static field :" + sft1.getStaticCount());
	
		sft1.increaseNonStaticCount();
		sft1.increaseStaticCOunt();
		
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		StaticFieldTest sft2 = new StaticFieldTest();
		
		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount());
	
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		StaticMethodTest.staticMethod();
//		smt.staticMethod();		//권장하지 않음
		
		
	}

}
