package level1_ex1;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void play();


    {
        System.out.println("Initializing an instrument...");
    }

    static {
        System.out.println("instance static block initializing. \nThe Instrument class has been loaded into memory.");
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
