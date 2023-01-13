package com.greedy.section06.singleton;

public class LazySingleton {

	private static LazySingleton Lazy;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		
	
		if(Lazy == null) {
			Lazy = new LazySingleton();
		}
		
		return Lazy;
	}
	
	
}
