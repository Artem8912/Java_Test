package Homework2;

public  class Main   {
    
   
    public static void main(String[] args){
    
    Aircrafts aircraft1 = new Aircrafts(1,1200,true);
    aircraft1.getNumber();
    aircraft1.startEngine();
    aircraft1.refuel(5);
    aircraft1.displayInfo();
    aircraft1.takeOff();
    aircraft1.accelerate(800);
    aircraft1.land();
    aircraft1.stopEngine();

    Aircrafts aircraft2 = new Aircrafts(2,700,false);
    aircraft2.getNumber();
    aircraft2.startEngine();
    aircraft2.refuel(10);
    aircraft2.displayInfo();
    // aircraft2.takeOff();
    // aircraft2.accelerate(600);
    // aircraft2.land();
    aircraft2.stopEngine();

    Boat boat1 = new Boat(1, 20, true);
    boat1.getNumber();
    boat1.displayInfo();
    
    boat1.startEngine();
    boat1.startSwimming();
    boat1.accelerate(12);    
    boat1.stopSwimming();

    Boat boat2 = new Boat(2, 50, true);
    boat2.getNumber();
    boat2.displayInfo();
    
    boat2.startEngine();
    boat2.startSwimming();
    boat2.accelerate(32);    
    boat2.stopSwimming();
    
    Car car1 = new Car(1, 30, 5);
    car1.getNumber();
    car1.displayInfo();
    car1.startEngine();
    car1.accelerate(60);
    car1.refuel(2);
    car1.brake();
    car1.stopEngine();
    
    Car car2 = new Car(2, 50, 7);
    car2.getNumber();
    car2.displayInfo();
    car2.startEngine();
    car2.accelerate(90);
    car2.refuel(4);
    car2.brake();
    car2.stopEngine();    

}
}

