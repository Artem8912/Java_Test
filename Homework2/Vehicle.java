package Homework2;
public abstract class Vehicle {
    
        int id;
        String brand;
        String model;
        int year;
        
            public abstract void startEngine();
            public abstract  void stopEngine();
            public abstract void accelerate(int speed);
            public abstract  void brake();
            public abstract void displayInfo();
            public abstract void refuel(int liters);
        }
    

