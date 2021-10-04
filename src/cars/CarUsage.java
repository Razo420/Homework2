package cars;


public class CarUsage {
    public static void main(String[] args) {
        CarCharacteristic bmw = new CarCharacteristic();
        System.out.println();
        System.out.println();

        bmw.manufacturer = "Germany";
        bmw.model = "BMW M5 competition";
        bmw.engine = "4.4 litre V8 TwinPower turbo";
        bmw.horsepower = 625;
        bmw.accelaration = 3.3;

        System.out.println("\nCar manufacturer: " + bmw.manufacturer + "\nCar model" + bmw.model + "\nCar engine" + bmw.engine + "\nCar horsepower" + bmw.horsepower + "\nCar acceleration" + bmw.accelaration);
        bmw.accelaration();
        bmw.printHorsepower();
        bmw.engine();
        bmw.model();
        bmw.drive();
        bmw.manufacturer();
    }
}
