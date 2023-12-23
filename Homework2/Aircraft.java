package Homework2;

public abstract class Aircraft extends Vehicle implements Flyable {
     
    static  int maxAltitude;
    static boolean isFlying;
    static int number;

    public abstract void startEngine();
    public abstract void stopEngine();
    public  abstract void refuel(int liters);
    public abstract void accelerate(int speed);
    public abstract  void displayInfo();
    public abstract void brake();
    

 public void land(){
     System.out.println("Посадка!");
}
public void takeOff(){
     System.out.println("Взлёт!");
}
}  


