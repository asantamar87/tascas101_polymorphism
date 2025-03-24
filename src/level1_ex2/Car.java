package level1_ex2;

public class Car {

    private static final String TRADEMARK = "Tesla";
    private static String model = "Cibertruck";
    private final int power;

    public Car(int power) {
        this.power = power;
        System.out.println("Initializing a car...");
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }


}
