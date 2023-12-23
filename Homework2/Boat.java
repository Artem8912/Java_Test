package Homework2;

public class Boat extends Vehicle implements Swimmable {
    static int maxSpeed;
    static boolean isSailing;
    static int number;

    public Boat(int number,int maxSpeed,boolean isSailing){
      this.number = number;
      this.maxSpeed = maxSpeed;
      this.isSailing = isSailing;
  }
    public void getNumber(){
      System.out.printf("Корабль "); System.out.print(number);System.out.println();
    }

    @Override
    public  void startEngine(){
     System.out.println("Двигатель корабля запущен");
    }
    @Override
    public void stopEngine(){
     System.out.println("Корабль остановлен");
    }
    @Override
    public void refuel(int liters){
     System.out.printf("Дозаправка корабля");
      System.out.print(liters);
      System.out.println();
    }
    @Override
    public void accelerate(int speed){
      
     System.out.printf("Текущая скорость = ");
     System.out.print(speed);
     System.out.println(" км/час");

    }
    @Override
    public void displayInfo(){
     DisplayInfo.infoMaxSpeed();
     DisplayInfo.isSailing();

    }
    @Override
    public void brake(){
     System.out.println("Остановка корабля");
     
    }
    @Override
    public void stopSwimming(){
      System.out.println("Остановить корабль!");
    }
    @Override
    public void startSwimming(){
            System.out.println("Начало отплытия!");
            System.out.println(message);
    }

 
}
