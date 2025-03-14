abstract class Vechile{
    double speed;
    double fuel;
    Vechile(double speed,double fuel){
        this.speed = speed;
        this.fuel = fuel;
    }

    abstract public void start();
    public void displayInfo(){
        System.out.println("Speed: "+speed+"\nFuel: "+fuel);
    }
}

class Car extends Vechile{
    Car(double fuel,double speed){  
        super(speed, fuel);
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    @Override
    public void start() {
        System.out.println("Car is getting started");
    }
}

class Bike extends Vechile{
    Bike(double fuel,double speed){  
        super(speed, fuel);
    }
    @Override
    public void start() {
        System.out.println("Bike is getting started");
    }
}

public class Main{
    public static void main(String[] args) {
        Bike b = new Bike(100, 500);
        b.displayInfo();
        b.start();

        Car c = new Car(500, 200);
        c.displayInfo();
        c.start();
    }
}