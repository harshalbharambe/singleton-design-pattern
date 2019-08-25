package com.example;

public class App {

	public static void main(String[] args) {

		Factory twoDShapeFactory = new TwoDShapeFactory();
		Factory threeDShapeFactory = new ThreeDShapeFactory();

		Shape shape;

		shape = twoDShapeFactory.getShape(ShapeType.TRIANGLE);
		System.out.println(shape.toString());

		shape = threeDShapeFactory.getShape(ShapeType.CIRCLE);
		System.out.println(shape.toString());

		shape = threeDShapeFactory.getShape(ShapeType.RECTANGLE_NEW.rectangleInfo("Custom Rectangle", 999));

		Rectangle r1 = shape.getShapeType().getRectangle();
		System.out.println("Name: " + r1.getName() + " 	Size: " + r1.getSize());

		shape = threeDShapeFactory.getShape(ShapeType.RECTANGLE);

		Rectangle r2 = shape.getShapeType().getRectangle();
		System.out.println("Name: " + r2.getName() + " 	Size: " + r2.getSize());

	}
}