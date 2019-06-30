package com.joyguru.singleton;

public enum SingletonEnum
{
    INSTANCE;

    static SingletonEnum getInstance()
    {
        return INSTANCE;
    }
}
