package level3_ex1;

public class FootballNews extends News{

    private String competition;
    private String club;
    private String player;

    public FootballNews(String title, String text, String competition, String club, String player) {
        super(title, text);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public double calculateNewsPrice() {

        double price = 300;
        if (competition.equalsIgnoreCase("Lliga de Campions")) {
            price += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            price += 50;
        }
        return price;

    }

    @Override
    public int calculateNewsScore() {

        int score = 5;
        if (competition.equalsIgnoreCase("Lliga de Campions")) {
            score += 3;
        }
        if (competition.equalsIgnoreCase("Lliga")) {
            score += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
            score += 1;
        }
        return score;
    }

    @Override
    public String toString() {
        return "FootballNews{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                "} " + super.toString();
    }
}
