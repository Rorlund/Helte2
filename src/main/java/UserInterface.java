import java.util.Scanner;

public class UserInterface {

    private final Controller controller;

    public UserInterface(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        System.out.println("velkommen til lav din superhelt program!");
        System.out.println("---------------------------");

        mainMenu();
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                                        
                    Indtast en af nedestående numre:
                    1) lav din helt
                                    
                    0) Luk programmet""");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 0:
                    System.out.println("Programmet lukker");
                    isRunning = false;
                    break;
                case 1:
                    createSuperHero(scanner);
                    break;


            }

        }
    }

    private void createSuperHero(Scanner scanner) {
        System.out.println("""
                Lav din superhelt
                --------------
                """);
        System.out.print("Navnet på din helt: ");
        String name = scanner.nextLine();
        System.out.print("Superkraft: ");
        String superPower = scanner.nextLine();
        System.out.print("Hvilket år blev din helt lavet: ");
        String creationYear = scanner.nextLine();
        System.out.print("Er din helt et menneske ja/nej: ");
        String isHuman = scanner.nextLine();
        System.out.print("Hvad er din helts styrkepoint: ");
        String strenght = scanner.nextLine();

        SuperHero superhero = controller.createSuperHero(name, superPower, creationYear, isHuman, strenght);
        for(SuperHero SuperHero : DataBase.getAllSuperHeroes()) {
            System.out.println("Superhelte navn: " + superhero.getName());
            System.out.println("Superkraft: " + superhero.getSuperPower());
            System.out.println("Oprindelsesår: " + superhero.getCreationYear());
            System.out.println("er menneke: " + superhero.getIsHuman());
            System.out.println("Styrke: " + superhero.getStrenght());
        }
    }
}