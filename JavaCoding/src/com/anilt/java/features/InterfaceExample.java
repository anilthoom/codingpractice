package com.anilt.java.features;

/**
 * @author anilt
 *
 */
interface implementThis1
{
    String name = "Anil";
    String myFlatNo();
    public int addNumber(int i, int j);
    String myName();
    static String absMethod()
    {
        return "String";
    }
}
interface implementThis2
{
    void removeNumber();
    abstract void onemore();
}
public class InterfaceExample implements implementThis1, implementThis2
{
    public void removeNumber()
    {
        System.out.println("Removed");
    }
    @Override
    public String myFlatNo()
    {
        return "402";
    }

    @Override
    public int addNumber(int i, int j) {
        return i+j;
    }

    @Override
    public String myName() {
        return "ANIL";
    }
    public static void main(String[] args)
    {
        InterfaceExample ie = new InterfaceExample();
        System.out.println(ie.myFlatNo());
        System.out.println(ie.addNumber(2, 4));
        System.out.println(ie.myName());
        ie.removeNumber();
    }
    @Override
    public void onemore() {
        // TODO Auto-generated method stub

    }
}
