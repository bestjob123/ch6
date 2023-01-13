package com.greedy.section04.constructor;

public class User {

	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;

	/* 생성자 작성 위치
	 * 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만 
	 * 통상적으로는 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
	 * */

	/* 생성자 작성 방법
	 * [표현식]
	 * 접근제한자 클래스명([매개변수])
	 * 		인스턴스 생성 시점에 수행할 명령을 기술 (주로 필드를 초기화)
	 * 		this.필드명 = 매개변수;			// 설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
	 * }
	 * 
	 * 주의사항
	 * 1. 생성자 메소드는 반드시 클래스 이름과 동일하게 작성해야 한다. (대/소문자까지 같아야 함)
	 * 2. 생성자 메소드는 반환형을 작성하지 않는다.(작성하게 되면 생성자가 아닌 메소드로 인식한다.)
	 * 
	 * 생성자의 사용 목적
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드값을 초기화하며 인스턴스를 생성할 목적으로 주로 사용한다.
	 * 3. 인스턴스 생성 시 초기값 전달을 강제화 하기 위해 사용한다.
	 * */

	/* 기본생성자(default constructor)
	 * :  컴파일러가 자동으로 추가해주는 구문
	 * 	매개변수 있는 생성자가 한개라도 존재하는 경우 기본 생성자는 자동으로 추가되지 않는다. */
	public User() {
		System.out.println("User 클래스의 기본생성자 호출함...");
	}	
//	public User() {}
	
	/*매개변수 있는 생성자 */
	public User(String id, String pwd, String name) {

		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
	}
	
	public User(String id, String pwd, String name, java.util.Date enrollDate) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		/* this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다.
		 * 괄호 안에 인자로 전달한 값과 생성자에 선언된 매개변수의 타입, 갯수, 순서가 일치하는 생성자를 호출하고
		 * 생성자 내부의 실행하는 코드를 다 실행 후 호출 구문으로 복귀한다.
		 * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
		 * this()는 가장 첫 줄에 선언해야 하며 그렇지 않은 경우 컴파일 에러가 발생한다.*/
		this(id, pwd, name);
		this.enrollDate = enrollDate;
		
		System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
	}
	/* 복사생성자
	 * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성 시 초기값으로 이용할 수 있다.
	 * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다.(깊은복사)
	 * */
	public User(User otherUser) {
		
//		this.id= otherUser.id;
//		this.pwd = otherUser.pwd;
//		this.name = otherUser.name;
//		this.enrollDate = otherUser.enrollDate;
		
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		
		System.out.println("User 클래스의 복사 생성자 호출함...");
		System.out.println(this.hashCode());
		System.out.println(otherUser.hashCode());
	}
	
	public String getInformation() {
		return "user [id=" + this.id + ", pwd = " + this.pwd +",name="+this.name +",enrollDate="+this.enrollDate;
	}
}
