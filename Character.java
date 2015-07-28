public class Character {

    private String name; //Add input scanner later//
    private String type;
    private int health;
    private int attack;
    private int defense;

    public Character(String name,String type,int attack,int defense) {
        this.name = name; //This will need an input scanner later//
        this.type = type;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int attack(Enemy e) {
        int damage = this.getAttack() - e.getDefense();
        if(damage <= 0) {
            return 0;
        }
        return damage;
    }
}
