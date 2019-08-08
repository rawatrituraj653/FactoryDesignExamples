package com.app;

public interface IShape {
	
	public abstract void showInfo();
	
	public default void shapeMsg() {
		
		System.out.println("welcome To Shape msg");
	}
	public static void commonMsg() {
		System.out.println("This Is shape Static for basic Data");
	}
		
}
