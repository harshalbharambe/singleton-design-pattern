package com.example;

public class ThreeDShape implements Shape {

  private ShapeType shapeType;

  public ThreeDShape(ShapeType shapeType) {
    this.shapeType = shapeType;
  }

  @Override
  public String toString() {
    return "3D Shape Factory " + shapeType;
  }

  @Override
  public ShapeType getShapeType() {
    return shapeType;
  }
}
