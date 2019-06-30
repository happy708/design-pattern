package com.joyguru.decorator;

public class PizzaDecoratorTest
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new ChickenDecorator(new PannerDecorator(new BasePizza()));

        Pizza pizza2 = new ChickenDecorator(new PepperDecorator(new PannerDecorator(new PannerDecorator(new BasePizza()))));

        System.out.println(pizza1.getCost());
        pizza1.display();

        System.out.println();

        System.out.println(pizza2.getCost());
        pizza2.display();
    }
}
