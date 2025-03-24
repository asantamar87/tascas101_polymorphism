package level1_ex1;

public class Percussion extends Instrument{

    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing a percussion instrument");
    }

}
