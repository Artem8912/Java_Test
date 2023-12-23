package Homework2;


public class Car extends Vehicle {
    static int number;
    static int fuelCapacity;
    static int currentFuelLevel;

    public Car(int number,int fuelCapacity,int currentFuelLevel){
        this.number = number;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }
    public void getNumber(){
        System.out.printf("Машина ");
        System.out.print(number);
        System.out.println();
    }
    @Override
    public  void startEngine(){
     System.out.println("Двигатель машины запущен");
    }
    @Override
    public void stopEngine(){
     System.out.println("Машина остановлена");
    }
    @Override
    public void refuel(int liters){
        
     System.out.printf("Дозаправка машины = ");
     System.out.print(liters);
     System.out.println(" литр.");
    }
    @Override
    public void accelerate(int speed){
      
     System.out.printf("Текущая скорость = ");
     System.out.print(speed);
     System.out.println(" км/час");
    }
    @Override
    public void displayInfo(){
     DisplayInfo.infoFuelCapacity();
     DisplayInfo.infoFuel();
    }
    @Override
    public void brake(){
     System.out.println("Остановка машины ");

    
}
}