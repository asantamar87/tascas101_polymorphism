package level3_ex1;

public class MotorcyclingNews extends News{
    private String team;

    public MotorcyclingNews(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }

    @Override
    public double calculateNewsPrice() {

        double price = 100;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }
        return price;
    }
    @Override
    public int calculateNewsScore() {
        int score = 3;
        if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) {
            score += 3;
        }
        return score;
    }

    @Override
    public String toString() {
        return "MotorcyclingNews{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}
