package level1_ex1;

public class Strings extends Instrument{

    public Strings(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing a string instrument");
    }
}
