package Shapes;

    public class Circle {
        double k=3.14;
        void CircleArea(int r)
        {
            System.out.println("the area of circle is:"+k*r*r);
        }
        public static void main(String [] args){
            Shapes.Circle cl=new Shapes.Circle();
            cl.CircleArea(5);

        }
    }

