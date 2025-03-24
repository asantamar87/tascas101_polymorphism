package level1_ex2;

public class Main {
    public static void main(String[] args) {


        Car.setModel("Model S");

        Car car = new Car(100);

        System.out.println("Non-static method:");
        car.accelerate();

        System.out.println("\nStatic method:");
        Car.brake();

        System.out.println("\nModel: " + Car.getModel());



    }
}
