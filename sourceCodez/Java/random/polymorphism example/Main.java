//example of polymorphism implementation

/*
    Create a base class called Car.
    It should have a few fields that would be appropriate for a generic
    car class like engine, cylinders, wheels, etc.
    Constructor should initialize cylinders(number of) and name, and 
    set wheels to 4 and engine to true. Cylinders and names would be 
    passed as parameters.

    Create appropriate getters.

    Create some methods like startEngine, accelerate and brake.

    Show a message for each in the base class.
    Now create 3 sub classes for your favorite vehicles.
    Override the appropriate methods to demonstrate polymorphism in use.
    put all classes in one java file.


*/
class Car{

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine=true;
        wheels=4;
        speed=0;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        if(engine)
                System.out.println("engine started");
        else
            System.out.println("no engine");
    }

    public void accelerate(int acc){
        System.out.println("accelerated by "+acc+" units");
        speed+=acc;
        System.out.println("current speed "+speed);
    }

    public void brake(){
        System.out.println("brakes applied\ncar has come to a stop");
    }
}

class FordMustang extends Car{

    public FordMustang() {
        super("Ford Mustang", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("engine of Ford Mustang started");
    }
}

class FordAspire extends Car{

    public FordAspire() {
        super("Ford Aspire", 3);
    }

    @Override
    public void startEngine() {
        System.out.println("engine of Ford Aspire started");
    }
}

class FordEcoSport extends Car{

    public FordEcoSport() {
        super("Ford EcoSport", 3);
    }

    @Override
    public void startEngine() {
        System.out.println("engine of Ford EcoSport started");
    }
}
public class Main {

    public static void main(String[] args) {

         for(int i=1;i<5;i++){
             Car car=randomCar();

             System.out.println("Name of car : "+car.getName());
             car.startEngine();

             int acc=(int)(Math.random()*20)+10;

             car.accelerate(acc);

             acc=(int)(Math.random()*5)+5;

             car.accelerate(acc);
         }
    }

    public static Car randomCar(){
        int rand=(int)(Math.random()*3)+1;

        System.out.println("\nrandom number generated : "+rand);

        switch(rand){

            case 1:
                return new FordMustang();

            case 2:
                return new FordAspire();

            case 3:
                return new FordEcoSport();
        }

        return null;
    }
}