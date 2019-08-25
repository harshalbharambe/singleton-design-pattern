
package com.example;

public enum ShapeType {

	TRIANGLE("TRIANGLE"), CIRCLE("CIRCLE"), RECTANGLE(), RECTANGLE_NEW(new Rectangle("KKKK", 8888));

	private String title;
	private Rectangle rectangle = new Rectangle();

	ShapeType(String title) {
		this.title = title;
	}

	ShapeType rectangleInfo(String name, int size) {
		this.rectangle.setName(name);
		this.rectangle.setSize(size);
		return this;
	}

	ShapeType() {
		Rectangle rectangle = new Rectangle("Predefined Rectangle", 1000);
		this.setRectangle(rectangle);
	}

	ShapeType(NewShape rectangle) {

	}

	ShapeType(Rectangle rectangle) {
		this.setRectangle(rectangle);
	}

	@Override
	public String toString() {
		return title;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
}
