package level3_ex1;

public class TennisNews extends News {
    private String competition;
    private String player;

    public TennisNews(String title, String text, String competition, String player) {
        super(title, text);
        this.competition = competition;
        this.player = player;
    }

    @Override
    public double calculateNewsPrice() {

        double price = 150;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic")) {
            price += 100;
        }
        return price;
    }

    @Override
    public int calculateNewsScore() {

        int score = 4;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") || player.equalsIgnoreCase("Djokovic")) {
            score += 3;
        }
        return score;
    }
}
