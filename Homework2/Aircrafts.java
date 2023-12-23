package Homework2;

public class Aircrafts extends Aircraft {

    public  Aircrafts(int number,int maxAltitude,boolean isFlying){
        this.number = number;
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    public void getNumber(){
            System.out.printf("Самолёт ");
            System.out.print(number);
            System.out.println();
    }
    
    public void getAltitude(){
        System.out.printf("Максимальная высота:= ");
        System.out.println(maxAltitude);
    }

    @Override
    public  void startEngine(){
        System.out.println("Двигатель самолёта запущен");
    }
    @Override
    public  void stopEngine(){
        System.out.println("Двигатель самолёта остановлен");
    }
    @Override
    public void refuel(int liters){
        
        
        System.out.printf("Дозаправка:= ");
        System.out.print(liters);
        System.out.println(" литров ");
    }
    @Override
    public  void accelerate(int speed){
            System.out.printf("Текущая скорость:= ");
            System.out.print(speed);
            System.out.println("км/час");
    }
    
    @Override
    public void displayInfo(){
        DisplayInfo.infoMaxAltitude();
        DisplayInfo.infoIsFlying();
    }
   
    @Override
    public void brake(){
        System.out.println("Прекращение движения");
    }
    
    public void takeOff(){
        System.out.println("Взлёт!");
        System.out.println(message);
    }
    public void land(){
        System.out.println("Посадка!");
    }

}
