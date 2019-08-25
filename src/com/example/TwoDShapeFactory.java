package com.example;

public class TwoDShapeFactory implements Factory {

  public Shape getShape(ShapeType shapeType) {
    return new TwoDShape(shapeType);
  }
}
