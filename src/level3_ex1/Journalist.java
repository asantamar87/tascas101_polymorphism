package level3_ex1;

import java.util.ArrayList;

public class Journalist {

    private static final double SALARY = 1500;
    private String name;
    private final String DNI;
    private ArrayList<News> newsList;

    public Journalist(String name, String DNI) {
        this.name = name;
        this.DNI = DNI;
        this.newsList = newsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String toString() {
        return "Journalist{" +
                "name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                ", newsList=" + newsList +
                '}';
    }
}
