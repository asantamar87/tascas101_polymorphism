package level1_ex1;

public class Main {

    public static void main(String[] args) {

        Wind flute = new Wind("Flute", 100.0);
        Strings violin = new Strings("Violin", 200.0);
        Percussion drum = new Percussion("Drum", 50.0);


        flute.play();
        violin.play();
        drum.play();


    }
}
