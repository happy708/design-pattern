package com.joyguru.decorator;

public class PepperDecorator extends PizzaDecorator
{
    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getCost() {
        return pizza.getCost() + 24;
    }

    public void display() {
        pizza.display();
        System.out.println("Pepper Decoration");
    }
}
