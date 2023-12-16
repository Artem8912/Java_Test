package Homework1;



public class Circle {
    
    static double radius=10.01;
   
      static void CalculateArea(double r){
        double S = Math.PI*Math.pow(r, 2);
        System.out.print("Square:= ");
        System.out.print(S);
    }

     static void CalculatePerimeter(double r){
        double P = 2*Math.PI*r;
        System.out.println();
        System.out.print("Perimeter:= ");
        System.out.print(P);
    }
    


public static void main(String[] args){
        
        
        CalculateArea(radius);
        CalculatePerimeter(radius);
    }
}