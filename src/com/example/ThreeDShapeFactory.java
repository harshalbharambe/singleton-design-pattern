package com.example;

public class ThreeDShapeFactory implements Factory {

  public Shape getShape(ShapeType shapeType) {
    return new ThreeDShape(shapeType);
  }
 
}
