package com.joyguru.factory;

public class ShapeFactory
{
    public static Shape getShape(Shape.Type type, int length)
    {
        switch(type)
        {
            case TRIANGLE: return new Triangle(length);
            case CIRCLE: return new Circle(length);
            case SQUARE: return new Square(length);

            default: throw new IllegalArgumentException();
        }
    }
}
