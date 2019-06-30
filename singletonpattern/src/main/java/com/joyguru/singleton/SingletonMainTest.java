package com.joyguru.singleton;

public class SingletonMainTest
{
    public static void main(String[] args)throws Exception
    {
        Thread thread1 = new Thread(new ThreadWrapper("thread1"));
        Thread thread2 = new Thread(new ThreadWrapper("thread2"));
        Thread thread3 = new Thread(new ThreadWrapper("thread3"));


        thread1.start();
        thread2.start();
        thread3.start();

    }

    private static class ThreadWrapper implements Runnable
    {
        String threadName;

        public ThreadWrapper(String threadName)
        {
            this.threadName = threadName;
        }

        public void run()
        {
            //System.out.println(threadName + " gets " + SingletonLazy.getInstance());
            //System.out.println(threadName + " gets " + SingletonEager.getInstance());
            System.out.println(threadName + " gets " + SingletonInnerClassLazy.getInstance());
            //System.out.println(threadName + " gets " + SingletonEnum.getInstance());
        }
    }
}
