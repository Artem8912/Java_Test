package Homework1;

public class Square extends Rectangle {
    
    
    
    @Override
    void CalculateArea(double s1,double s2){
        s2 = s1;
        System.out.print("Square:= ");
        double S = Math.pow(s1,2);
        
        System.out.println(S);
       
    }
     @Override
    void CalculatePerimeter(double s1,double s2){
        s2 = s1;
        double P = 4*s1;
        System.out.print("Perimeter:= ");
        System.out.println(P);
    }
      

}
