package com.example;

 public class Rectangle {
	
	private String name;
	private int size;

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", size=" + size + "]";
	}
	public Rectangle(String name, int size) {
		this.setName(name);
		this.setSize(size);
	}
	public Rectangle() {
	}
	
}
