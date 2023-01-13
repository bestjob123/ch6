package com.greedy.section04.constructor;

public class Application {

	public static void main(String[] args) {

		/* 객체 생성 구문
		 * 클래스명 레퍼런스변수 = new 클래스명();
		 * -> 클래스자료형 레퍼런스변수 = new 생성자함수();
		 * */
		
		/*생성자란?
		 * 인스턴스를 생성할 때 초기 수행할 명령을 작성하는 메소드의 변형체
		 * 단, 한번만 호출할 수 있다.
		 * 주로 사용 목적은 필드를 초기화 할 목적으로 사용한다.
		 * */
		User user1 = new User();
		System.out.println(user1.getInformation());
		System.out.println(user1);
		
		User user2 = new User("user01","pass01","홍길동");
		System.out.println(user2.getInformation());
		System.out.println(user2);
		
		User user3 = new User("user02","pass02","유관순", new java.util.Date());
		System.out.println(user3.getInformation());
		
		User user4 = new User(user3);
		System.out.println(user4.getInformation());
	}

}
