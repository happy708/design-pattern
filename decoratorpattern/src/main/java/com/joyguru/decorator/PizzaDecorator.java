package com.joyguru.decorator;

public abstract class PizzaDecorator implements Pizza
{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza)
    {
        this.pizza = pizza;
    }
}
