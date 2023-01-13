package com.greedy.section03.dto;

public class Application {

	public static void main(String[] args) {

		/* 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우
		 * 행위를 기반으로 추상화를 하지 않고 데이터를 기반으로 추상화를 한다.
		 * 실제로는 캡슐화 형실에 위배되긴 하지만 최소한의 원칙을 지켜서 작성한다.
		 * DTO 클래스 작성 규칙
		 * 1. 모든 필드는 private 접근제한자 설정(필수)
		 * 2. 기본생산자(필수), 모든 필드를 초기화하는 생산자(선택)
		 * 3. 모든 필드에 대한 setter/getter 작성(필수)
		 * 4. toString 메소드 오버라이팅(선택)
		 * 5. 직렬화 처리(선택)
		 * */
		MemberDTO member = new MemberDTO();
		member.setNumber(1);
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('남');
		member.setHeight(180.5);
		member.setWeight(80.5);
		member.setActivated(true);
		
		System.out.println("회원번호 : "+ member.getNumber());
		System.out.println("회원명 : " + member.getName());
		System.out.println("나이 : "+ member.getAge());
		System.out.println("성별 : " + member.getAge());
		System.out.println("키 : "+ member.getHeight());
		System.out.println("몸무게 : " + member.getWeight());
		System.out.println("회원활성화상태 :" + member.isActivated());
		
	}

}
