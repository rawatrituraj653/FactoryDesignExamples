package com.app.impl;

import com.app.IShape;

public class Triangle implements IShape {

	@Override
	public void showInfo() {
		System.out.println("Triangle is created");			
	}
	@Override
	public void shapeMsg() {
		System.out.println("Triangle COmes into a picture");
	}

}
