package com.greedy.section04.dto;

public class Application {

	public static void main(String[] args) {

		/* 1. 생성자를 이용한 초기화
		 * 장점 : setter 메소드를 여러번 호출해서 사용하지 않고 한번의 호출로 인스턴스를 생성 및 초기화 할 수 있다.
		 * 단점 : 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만드어줘야 한다.
		 * 		호출 시 인자가 만아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈으로 보기 힘들다.
		 * 		예) 아이디, 비밀번호, 이름이 모두 greedy인 경우
		 * 		new User("greedy", "greedy", "greedy");
		 * 2. 설정자를 이용한 초기화
		 * 장점 : 필드를 초기화하는 값들이 각각 어떤 필드에 대입되는지 이해하기 편하다. 
		 * 		예)
		 * 		User.user = new User();
		 * 		user.setId("greedy");		 * 
		 * 		user.setPwd("greedy");
		 * 		user.setName("greedy");
		 * 단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
		 * */
		UserDTO user1 = new UserDTO("greedy","greedy","greedy", new java.util.Date());
		System.out.println(user1.getInformation());
		
		UserDTO user2 = new UserDTO();
		user2.setId("greedy");
		user2.setPwd("greedy");
		user2.setName("greedy");
		user2.setEnrollDate(new java.util.Date());
		System.out.println(user2.getInformation());
		
		/* 위 두 가지 장단점을 조합해 해결한 방식 : 빌더패턴
		 * User user3 = User.builder()
		 * 				.id(greedy)
		 * 				.pwd("greedy)
		 * 				.name("greedy")
		 * 				.enrollDate(new java.util.Date())
		 * 				.build();
		 * 
		 * */
	}

}
