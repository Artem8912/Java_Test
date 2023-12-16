package Homework1;

public class Program {
    public static void main(String[] args){
        System.out.println("Circle:");
        Circle.CalculateArea(3.5);
        Circle.CalculatePerimeter(3.5);
        System.out.println();
        System.out.println("Rectangle:");
        Rectangle rectangle = new Rectangle();
        rectangle.CalculateArea(4.01, 6.01);
        rectangle.CalculatePerimeter(4.01, 6.01);
       
        Rectangle square = new Square();
        System.out.println("Square:");
        square.CalculateArea(2.5, 2.5);
        square.CalculatePerimeter(2.5, 2.5);
    }
}
