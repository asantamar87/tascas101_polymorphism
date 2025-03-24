package level3_ex1;

public class F1News extends News{

    private String team;

    public F1News(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }

    @Override
    public double calculateNewsPrice() {

        double price = 100;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        return price;
    }

    @Override
    public int calculateNewsScore() {
        int score = 4;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            score += 2;
        }
        return score;
    }
}
