public class Controller {

    private final DataBase db;

    public Controller() {
        db = new DataBase();
    }

    public SuperHero createSuperHero(String name, String superPower, String creationYear, String isHuman, String strenght) {
        return db.createSuperHero(name, superPower, creationYear, isHuman, strenght);
    }






}