package com.joyguru.factory;

public class ShapeFactoryTest
{
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape(Shape.Type.TRIANGLE, 10);
        Shape shape2 = ShapeFactory.getShape(Shape.Type.SQUARE, 10);
        Shape shape3 = ShapeFactory.getShape(Shape.Type.CIRCLE, 10);

        shape1.draw();
        System.out.println(shape1.getArea());

        shape2.draw();
        System.out.println(shape2.getArea());

        shape3.draw();
        System.out.println(shape3.getArea());
    }
}
