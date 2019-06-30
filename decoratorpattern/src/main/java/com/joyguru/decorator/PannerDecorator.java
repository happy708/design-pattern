package com.joyguru.decorator;

public class PannerDecorator extends PizzaDecorator
{
    public PannerDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getCost() {
        return pizza.getCost() + 13;
    }

    public void display() {
        pizza.display();
        System.out.println("Panner Decoration");
    }
}
