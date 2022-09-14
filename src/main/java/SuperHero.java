public class SuperHero {

    private String name;
    private String SuperPower;
    private String creationYear;
    private String isHuman;
    private String strenght;

    public SuperHero(String Name, String SuperPower, String creationYear, String isHuman,String strenght) {
        this.name = Name;
        this.SuperPower = SuperPower;
        this.creationYear = creationYear;
        this.isHuman = isHuman;
        this.strenght = strenght;
    }

    private SuperHero() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return SuperPower;
    }

    public void setSuperPower(String superPower) {
        this.SuperPower = superPower;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }
    public String getStrenght() {
        return strenght;
    }

    public void setStrenght(String strenght) {
        this.strenght = strenght;
    }
    @Override
    public String toString() {
        if(creationYear != null) {
            return name + " " + creationYear + " " + SuperPower + " " + isHuman + " " + strenght;
        } else {
            return name + " " + SuperPower;
        }
    }

    public String[] toStrings() {
        return new String[]{name, SuperPower, creationYear, isHuman, strenght};
    }

    public static SuperHero fromStrings(String[] strings) {
        SuperHero newSuperHero = new SuperHero();

        newSuperHero.name = strings[0];
        newSuperHero.SuperPower = strings[1];
        newSuperHero.creationYear = strings[2];
        newSuperHero.isHuman = strings[3];
        newSuperHero.strenght = strings[4];

        return newSuperHero;
    }

    public boolean matches(String search) {
        return name.toLowerCase().contains(search) ||
                SuperPower.toLowerCase().contains(search) ||
                (creationYear != null && creationYear.toLowerCase().contains(search));
    }
}
