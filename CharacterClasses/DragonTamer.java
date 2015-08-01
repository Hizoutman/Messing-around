
public class DragonTamer extends Character {
    private String special;

    public DragonTamer(String name,int health, int attack,int defense) {
        super(name,health,attack,defense);
        this.special = "Dragon Solar Strike";
    }

    public String getSpecial() {
        return this.special;
    }

    public void special(Character enemy) {
        System.out.println("Dragon Tamer used special move!");
        //"Critical Strike ratio at 100%"//
        //"Enemy's defense temporarily set to 0"//
        this.attack(enemy);
    }
}
