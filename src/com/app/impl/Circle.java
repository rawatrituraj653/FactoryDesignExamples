package com.app.impl;

import com.app.IShape;

public class Circle implements IShape{
	
	@Override
	public void showInfo() {
		System.out.println("Circle is crated");
	}
	@Override
	public void shapeMsg() {
		System.out.println("Circle Comes into A picture");
	}
	
	
}
