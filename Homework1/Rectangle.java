package Homework1;

public  class  Rectangle {
        
    
        static double length = 8.57;
        static double width = 4.24;

       void CalculateArea(double s1,double s2){
        System.out.print("Square:= ");
        double S = s1*s2;
        
        System.out.println(S);
    }

   void CalculatePerimeter(double s1,double s2){
        double P = 2*(s1+s2);
        System.out.print("Perimeter:= ");
        System.out.println(P);
    }
   
}
