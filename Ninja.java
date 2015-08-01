
public class Ninja extends Character {

    private String special;

    public Ninja(String name,int health, int attack,int defense) {
        super(name,health,attack,defense);
        this.special = "Super Sneak Attack";
    }

    public String getSpecial() {
        return this.special;
    }

    public void special(Character enemy) {
        System.out.println("Ninja used special move!");
        //"Reduce chances of getting hit!"//
        this.attack(enemy);
    }
}

