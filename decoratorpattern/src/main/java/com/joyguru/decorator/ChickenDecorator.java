package com.joyguru.decorator;

public class ChickenDecorator extends PizzaDecorator
{
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getCost() {
        return pizza.getCost() + 26;
    }

    public void display() {
        pizza.display();
        System.out.println("Chicken Decoration");
    }
}
