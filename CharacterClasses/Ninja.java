package CharacterClasses;
public class Ninja extends Character {

    private String special;

    public Ninja(String name,int health, int attack,int defense,int agility,int luck) {
        super(name,health,attack,defense,agility,luck);
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

