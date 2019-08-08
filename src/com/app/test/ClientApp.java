package com.app.test;

import java.util.Scanner;

import com.app.IShape;
import com.app.factory.ShapeFactory;

public class ClientApp{

	public static void main(String[] args) throws Exception {
	try(Scanner scan=new Scanner(System.in)){
		System.out.println("Enter  Any one Shape Number");	
		System.out.println("1.Circle");
		System.out.println("2.Triangle");
		System.out.println("3.Square");
		int choice=scan.nextInt();
		IShape iShape= ShapeFactory.getObjectForShape(choice);
		if(iShape!=null) {
		iShape.shapeMsg();
		iShape.showInfo();
		IShape.commonMsg();
		}
		else{
			System.out.println("This is not valid Choice Sorry");
		}
	}
		
		
	}
}
