package level1_ex1;

public class Wind extends Instrument{
public Wind(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing a wind instrument");
    }

}
