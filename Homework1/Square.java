package Homework1;

public class Square extends Rectangle {
    
    
    
    // @Override
    public Square(double s1,double s2){
        s2 = s1;
        System.out.print("Square:= ");
        double S = Math.pow(s1,2);
        
        System.out.println(S);
       
    }
    public Square(double s){
        this(s,s);
    }
    public Square(){
        this(4);
    }
    
     @Override
    void CalculatePerimeter(double s1,double s2){
        s2 = s1;
        double P = 4*s1;
        System.out.print("Perimeter:= ");
        System.out.println(P);
    }
      

}
