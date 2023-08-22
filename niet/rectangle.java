package com.niet;

public class rectangle {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        long c=3;
        if (a>b+c || b>c+a || c>a+b) {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
