/*패키지 선언부 */
package com.greedy.section07.kindsofvariable;

/* import */

/* 클래스 선언부*/
public class KindsOfVariable {	//클래스 영역 시작

	/* 필드 <- 작성 위치에 따른 이름
	 * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	 * */
	
	/* non-static field를 인스턴스 변수라고 한다. (인스턴스 생성 시점에 사용 가능한 변수라는 의미)*/
	private int globalNum;
	
	/* static field를 정적 필드(클래스변수)라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미이다.)*/
	private static int staticNum;
	
	/* 생성자 */
	
	/* 메소드 
	 * public void testMehod <- 메소드 헤드
	 * {} <- 메소드 바디(블럭)
	 * testMetho() <- 메소드 시그니처*/
	
	public void testMethod(/*매개변수 선언부 */ int num) { //메소드 영역의 시작
		/*매개변수를 포함하여 메소드 영역 내에 작성하는 변수를 지역변수라고 한다.
		 * 지역변수는 stack을 이용한다.
		 * */
		int localNum;
		
		System.out.println(num);
		/* 지역변수는 반드시 초기화 해야 한다. */
//		System.out.println(localNum);
		
		System.out.println(globalNum);
		System.out.println(staticNum);
		
	} //메소드 영역의 끝
	
	public void testMethod2() {
//		localNum =0;
		System.out.println(globalNum);
		System.out.println(staticNum);
	}
}	//클래스 영역 끝


