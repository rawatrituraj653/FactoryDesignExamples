package com.app.factory;

import com.app.IShape;

public class ShapeFactory {

	public static IShape getObjectForShape(int ch) throws Exception{
		String cls =choose(ch);
		IShape iShape=null;
		if(cls!=null) {
		Object object=Class.forName(cls).newInstance();
		 if (object instanceof IShape) {
			 iShape = (IShape) object;
			 return iShape;
		 }
		}
		return null;
	}

	private static String choose(int ch) {
		String cls=null;
		switch (ch) {
		case 1: cls="com.app.impl.Circle";break;
		case 2: cls="com.app.impl.Triangle";break;
		case 3: cls="com.app.impl.Square";break;
		default:
			break;
		}
		return cls;
	}
}
