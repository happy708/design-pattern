package com.joyguru.singleton;

public class SingletonEager
{
    private static final SingletonEager SINGLETON_EAGER = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance()
    {
        return SINGLETON_EAGER;
    }
}
