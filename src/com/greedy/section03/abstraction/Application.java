package com.greedy.section03.abstraction;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/* 객체지향 프로그래밍 (Object Oriented Programming - OOP)
		 * 프로그램을 만들 때 현실 세계를 표방하여 새로운 세계를 창조하는 방법론이다.
		 * 낮은 결합도와 높은 응집도 추구
		 * 모든 객체는 책임을 가지고 자신의 역할을 수행한다.
		 * 또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한(1개의) 책임을 가지고 있어야 한다. (단일 책임의 원칙)
		 * 현실세계에서 불가능한 무생물이나 개념 같은 존재들도
		 * 하나의 주체로 자율 의사를 가지고 본인의 상태를 스스로 제어하고 행동한다는게 현실 세계와 다른 점이다.
		 * 이러한 기법을 의인화라고 하며 의인화는 곧 캡슐화이다.
		 * */
		
		/* 추상화란?
		 * 공통된 부분을 추출하고 공통되지 않은 부분을 제거한다는 의미를 가진다.
		 * 추상화의 목적은 유연성 확보와 복잡한 현실 세계의 단순화에 있다.
		 * 유연성 확보 -> 여러 군데 적용될 수 있다. (재사용성이 높아진다.)
		 * */
		
		/* 객체와 객체의 상호작용이란?
		 * 객체와 객체는 메세지를 통해 서로 상호작용을 한다. 메세지(메소드 호출)를 보내는 쪽을 송신자라고 하고
		 * 메세지를 수신하는 쪽을 수신자라고 한다.
		 * 수신자는 메세지를 전달 받아 그 메세지에 해당하는 내용을 처리하는 방법을 스스로 결정하고
		 * 그 결정한 방법대로 처리할 명령어들을 순차적으로 기술한 것을 메소드라고 한다.
		 * */
		
		/* 카레이서가 자동차를 운전하는 프로그램
		 * 
		 * 요구사항
		 * 1. 자동차는 처음 멈춘 상태로 대기하고 있다.
		 * 2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
		 * 3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h씩 증가하며 앞으로 나간다.
		 * 4. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 즉시 0 으로 떨어지며 멈춘다.
		 * 5. 브레이크르르 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
		 * 6. 카레이서가 시동을 끄면 더이상 자동차는 움직이지 못한다.
		 * 7. 자동차가 달리는 중이라면 시동을 끌 수 없다.
		 * 
		 * 객체 구분
		 * 1. 자동차
		 * 2. 카레이서
		 * 
		 * 자동차가 수신할 수 있는 메세지
		 * 1. 시동을 걸어라
		 * 2. 앞으로 가라
		 * 3. 멈춰라
		 * 4. 시동을 꺼라
		 * 
		 * 카레이서가 수신할 수 있는 메세지
		 * 1. 시동을 걸어라
		 * 2. 엑셀레이터를 밟아라
		 * 3. 브레이크를 밟아라
		 * 4. 시동을 꺼라
		 * */
		CarRacer racer = new CarRacer();
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			System.out.println("========카레이싱 프로그램==========");
			System.out.println("1. 시동걸기");
			System.out.println("2. 전진");
			System.out.println("3. 정지");
			System.out.println("4. 시동끄기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : racer.startUp(); break;
				case 2 : racer.stepAccelator(); break;
				case 3 : racer.stepBreak(); break;
				case 4 : racer.turnOff(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 선택하셨습니다.");break;
			}
			
		}
	}

}
