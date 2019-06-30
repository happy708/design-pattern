package com.joyguru.singleton;

public class SingletonInnerClassLazy
{
    private SingletonInnerClassLazy(){};

    public static SingletonInnerClassLazy getInstance()
    {
        return InnerClass.SINGLETON_INNER_CLASS_LAZY;
    }

    private static class InnerClass
    {
        private static final SingletonInnerClassLazy SINGLETON_INNER_CLASS_LAZY = new SingletonInnerClassLazy();
    }
}
