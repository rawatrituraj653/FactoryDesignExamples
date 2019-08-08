package com.app.impl;

import com.app.IShape;

public class Square implements IShape {

	@Override
	public void showInfo() {
			System.out.println("Square created");
	}
	
	@Override
	public void shapeMsg() {
		System.out.println("Square Comes  into pictures");
	}
	
	
	
}
