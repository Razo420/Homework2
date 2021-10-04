package cars;

public class CarCharacteristic {
    public String manufacturer;
    public String model;
    public String engine;
    public int horsepower;
    public double accelaration;
    public void drive(){
        System.out.println("The car is driving");
    }
    public void printHorsepower() {
        System.out.println("Car has 625 hp");
    }
    public void engine(){
        System.out.println("Car engine is 4.4l TwinPower Turbo");
    }
    public void accelaration(){
        System.out.println("Car acceleration from 0 to 100km is 3.3 seconds");
    }
    public void manufacturer(){
        System.out.println("Germany:Bayern");
    }
    public void model(){
        System.out.println("BMW M5 competition");
    }
}
