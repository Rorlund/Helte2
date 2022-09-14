import javax.naming.ServiceUnavailableException;
import java.util.ArrayList;

public class DataBase {

    static ArrayList<SuperHero> SuperHero = new ArrayList<SuperHero>();

    public SuperHero createSuperHero(String name, String superPower, String creationYear, String isHuman, String strenght) {
        SuperHero superHero = new SuperHero(name, superPower, creationYear, isHuman, strenght );
        return superHero;
    }
    public static ArrayList<SuperHero> getAllSuperHeroes() {
        return SuperHero;
    }
    private SuperHero addSuperHero(SuperHero superHero) {
        return superHero;
    }
}
