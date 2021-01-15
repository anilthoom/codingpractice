package com.anilt.java.features;

class SingletonClass
{

    private static  volatile SingletonClass uniqueInstance;

    private SingletonClass(){}

    public static SingletonClass getInstance()
    {
        if (uniqueInstance ==null )
        {
            synchronized(SingletonClass.class)
            {
                if (uniqueInstance ==null )
                {
                    uniqueInstance=new SingletonClass();
                    System.out.println("Initialized : " + uniqueInstance.hashCode());
                }
            }
        }
        return uniqueInstance ;
    }
    void printMe()
    {
        System.out.println("PRINTING>>>>>>");
    }
    // other useful methods here
}
class TestClass
{

}
public class SingletonTest
{
    public static void main(String[] args)
    {
        System.out.println(SingletonClass.getInstance().hashCode());
        System.out.println(SingletonClass.getInstance().hashCode());
        System.out.println(new TestClass().hashCode());
        System.out.println(new TestClass().hashCode());
        SingletonClass stc = SingletonClass.getInstance();
        stc.printMe();
    }
}