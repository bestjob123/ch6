package com.greedy.section03.abstraction;

public class Car {
	
	private boolean isOn;
	private int speed;
	public void startUp() {
		if(isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		}else {
			this.isOn = true;
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
		}
	}
	
	public void go() {
		int speed =0;
		if(isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			speed +=10;
			System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
		} else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	public void stop() {
		if(isOn) {
			if(speed >0) {
				speed = 0;
				System.out.println("브레이크를 밟았습니디ㅏ. 차를 멈춥니다.");
			} else {
				System.out.println("차는 이미 멈춰있는 상태입니다.");
			}
		} else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
		}
	}
	
	public void turnOff() {
		if(isOn) {
			if(speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 찰르 우선 멈춰주세요");
			} else {
				isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
			}
		}else {
			System.out.println("이미 시동이 꺼져있는 상태입니다. 시동상태를 확인해주세요");
		}
	}
}
