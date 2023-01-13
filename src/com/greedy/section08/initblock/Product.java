package com.greedy.section08.initblock;

public class Product {

	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼송";
	
	{
		name = "사이언";
//		price = (int)(Math.random() * 10000000);
		int sum = 0;
		for(int i = 0; i<1000000;i++) {
			sum+= (int)(Math.random()*10);
		}
		price = sum;
		brand = "헬지";
		System.out.println("인스턴스 초기화 블럭 동작함...");
	}
	
	static {
//		name = "아이뽕";
//		price = 1500000;
		brand = "사과";
		System.out.println("정적 초기화 블럭 동작함...");
	}
	
	public Product() {
		System.out.println("기본 생성자 호출됨...");
		
	}
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price= price;
		Product.brand = brand;
		
		System.out.println("매개변수 있는 생성자 호출됨...");
	}
	public String getInformation() {
		return "Product [name=" +this.name + ", price="+ this.price +", brand ="+Product.brand+"}";
	}
}
