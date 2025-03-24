package level3_ex1;

public class BasketballNews extends News {

    private String competition;
    private String club;

    public BasketballNews(String title, String text, String competition, String club) {
        super(title, text);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public double calculateNewsPrice() {
        double price = 250;
        if (competition.equalsIgnoreCase("Eurolliga")) {
            price += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        return price;
    }

    @Override
    public int calculateNewsScore() {

        int score = 4;
        if (competition.equalsIgnoreCase("Eurolliga")) {
            score += 3;
        }
        if (competition.equalsIgnoreCase("ACB")) {
            score += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        return score;
    }

    @Override
    public String toString() {
        return "BasketballNews{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                "} " + super.toString();
    }
}
