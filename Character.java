public class Character {

    private String name; //Add input scanner later//
    private String type;
    private int health;
    private int attack;
    private int defense;
    private int pos;

    public Character(String name,String type, int health,int attack,int defense,int pos) {
        this.name = name; //This will need an input scanner later//
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.pos = pos;
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

    public void setHealth(int h) {
        this.health = h;
    }

    public void setAttack(int a) {
        this.attack = a;
    }

    public void setDefense(int d) {
        this.defense = d;
    }

    public void setPos(int p) {
        this.pos = p;
    }

    public int attack(Enemy e) {
        int damage = this.getAttack() - e.getDefense();
        if(damage <= 0) {
            return 0;
        }
        return damage;
    }
}
