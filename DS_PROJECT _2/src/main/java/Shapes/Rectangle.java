package Shapes;

public class Rectangle {
    void RectangleArea (int l,int b)
    {
        System.out.println("the area of rectangle is :"+l*b);

    }
    public static void main (String [] args){
        Rectangle r1=new Rectangle();
        r1.RectangleArea(5,8);
    }


}
