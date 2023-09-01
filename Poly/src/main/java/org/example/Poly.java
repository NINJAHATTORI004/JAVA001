package org.example;

public class Poly
{
    void method1()
    {
        System.out.println("method 1 without args");
    }
    void method1(int a)
    {
        System.out.println("method 1 with argu 1"+a);


    }
    void method1(int a,int b)
    {
        System.out.println("method 1 with argu 1"+a+"arg 2:"+b);


    }


    public static void main(String[] args ){
        Poly obj =new Poly();
        obj.method1();
        obj.method1(1);
        obj.method1(1,2);

    }


}