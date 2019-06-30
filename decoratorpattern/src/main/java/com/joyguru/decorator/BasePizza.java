package com.joyguru.decorator;

public class BasePizza implements Pizza
{
    public int getCost()
    {
        return 20;
    }

    public void display()
    {
        System.out.println("Base pizza");
    }
}
