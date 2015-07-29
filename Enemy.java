public class Enemy {

    private int health;
    private String name;
    private int attack;
    private int defense;

    public Enemy(String name,int health,int attack,int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int h) {
        this.health = h;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int attack(Character c) {
        int damage = getAttack() - c.getDefense();
        if(damage <= 0) {
            return 0;
        }
        return damage;
    }
    public Enemy generateMonster() {
        //generates some type of Monster
    }
}

