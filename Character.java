public class Character {

    private String name; //Add input scanner later//
    private int health;
    private int attack;
    private int defense;

    public Character(String name, int health,int attack,int defense) {
        this.name = name; //This will need an input scanner later//
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
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

    public void attack(Chracter enemy) {
        dmg = this.getAttack - enemy.getDefense();
        if(dmg > 0) {
            enemy.setHealth(enemy.getHealth() - dmg));
            int res = enemy.getHealth();
            if(res <= 0) {
                enemy.die();
            }
        }
    }
    public void die() {
        System.out.println(this.getName() + "Died");
    }
}
