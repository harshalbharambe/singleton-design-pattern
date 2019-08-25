package com.example;

public class TwoDShape implements Shape {

  private ShapeType shapeType;

  public TwoDShape(ShapeType shapeType) {
    this.shapeType = shapeType;
  }

  @Override
  public String toString() {
    return "2D Shape Factory  " + shapeType;
  }

  @Override
  public ShapeType getShapeType() {
    return shapeType;
  }
}
