package Homework2;

public abstract class DisplayInfo  {
        
    static void infoMaxAltitude(){
            System.out.printf("Максимальная высота = " );
            System.out.print(Aircraft.maxAltitude);
            System.out.println(" метров");    
    }
    static void infoIsFlying(){
            System.out.printf("Летает?  " );
            System.out.println(Aircraft.isFlying);
    }
    static void infoMaxSpeed(){
        System.out.printf("Максимальная скорость = " );
            System.out.print(Boat.maxSpeed);
            System.out.println(" км/час");  
    }
    static void isSailing(){
        System.out.printf("Плавает? " );
            System.out.print(Boat.isSailing);
            System.out.println();
             
    }

    static void infoFuelCapacity(){
            System.out.printf("Ёмкость топливного бака = " );
            System.out.print(Car.fuelCapacity);
            System.out.println(" литров");  
    }
    static void infoFuel(){
            System.out.printf("Текущий уровень топлива = " );
            System.out.print(Car.currentFuelLevel);
            System.out.println(" литров");  
    }

}
