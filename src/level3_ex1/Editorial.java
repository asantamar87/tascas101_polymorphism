package level3_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Editorial {
    private static final Scanner scanner = new Scanner(System.in);
    private final List<Journalist> journalists = new ArrayList<>();

    public static void main(String[] args) {

        Editorial editorial = new Editorial();
        editorial.run();

    }

    public void run(){
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addJournalist();
                    break;
                case 2:
                    removeJournalist();
                    break;
                case 3:
                    addNewsToEditor();
                    break;
                case 4:
                    removeNews();
                    break;
                case 5:
                    showEditorNews();
                    break;
                case 6:
                    calculateNewsScore();
                    break;
                case 7:
                    calculateNewsPrice();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                case 9:
                    showJournalists();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 8);
    }

    private void calculateNewsPrice() {


    }

    private void calculateNewsScore() {
        
    }

    private void showEditorNews() {


    }

    private void removeNews() {
    }

    private void addNewsToEditor() {

    }

    private void removeJournalist() {
        System.out.print("Enter the ID of the journalist to remove: ");
        String id = scanner.nextLine();

    }

    private void showJournalists() {
        System.out.println("Journalists:");
        for (Journalist journalist : journalists) {
            System.out.println(journalist);
        }
    }

    private void addJournalist() {
        System.out.print("Enter the name of the journalist: ");
        String name = scanner.nextLine();
        System.out.print("Enter the journalist's ID: ");
        String id = scanner.nextLine();
        Journalist journalist = new Journalist(name, id);
        journalists.add(journalist);

    }


    public void showMenu(){
        System.out.println("\nMenu:");
        System.out.println("1. Add Editor");
        System.out.println("2. Remove Editor");
        System.out.println("3. Add News to Editor");
        System.out.println("4. Remove News");
        System.out.println("5. Show Editor's News");
        System.out.println("6. Calculate News Score");
        System.out.println("7. Calculate News Price");
        System.out.println("8. Exit");
        System.out.println("9. Show editors");
        System.out.print("Choose an option: ");
    }



}
