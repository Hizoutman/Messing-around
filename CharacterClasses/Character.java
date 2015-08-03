package CharacterClasses;
import java.util.Scanner;
//NOTE, YOU HAVE TO COMPILE ALL FILES FOR THIS TO COMPILE//
public class Character {

    private String name; //Add input scanner later//
    private int health;
    private int attack;
    private int defense;
    private int basehealth;
    private int baseattack;
    private int basedefense;
    private Item[] itemList;
    public boolean died = false;
    private int numItems;

    public Character(){};

    public Character(String name, int health,int attack,int defense) {
        this.name = name; //This will need an input scanner later//
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.basehealth = health;
        this.baseattack = attack;
        this.basedefense = defense;
        this.itemList = new Item[5];
        this.numItems = 0;
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

    public int getbHealth() {
        return this.basehealth;
    }

    public int getbAttack() {
        return this.baseattack;
    }

    public int getbDefense() {
        return this.basedefense;
    }

    public void setbHealth(int h) {
        this.basehealth = h;
    }

    public void setbDefense(int d) {
        this.basedefense = d;
        this.defense = d;
    }

    public void setbAttack(int a) {
        this.baseattack = a;
        this.attack = a;
    }

    public void setHealth(int h) {
        this.health = h;
    }

    public int getHealth() {
        return this.health;
    }

    public void setAttack(int a) {
        this.attack = a;
    }

    public void setDefense(int d) {
        this.defense = d;
    }

    public String getSpecial(){
    	return "";
    }

    public void special(Character a){}

    public void attack(Character enemy) {
        int dmg = (int) (this.getAttack() - Math.ceil(enemy.getDefense()/2));
        System.out.println(this.name + " damages " + enemy.getName() + " for " + dmg);
        if(dmg > 0) {
            enemy.setHealth(enemy.getHealth() - dmg);
            int res = enemy.getHealth();
            if(res <= 0) {
                enemy.die();
            }
        }
    }

    public void reset(){
    	this.attack = baseattack;
    	this.defense = basedefense;
    }

    public void die() {
    	died = true;
        System.out.println(this.getName() + " has Died");
    }

    public void useItem(Item item) {
        if(item.getType() == "Heal") {
            this.health += item.getAmt();
        }
        else if(item.getType() == "Hurt") {
            this.health -= item.getAmt();
            if(this.health <= 0) {
                this.die();
            }
        }
        else if(item.getType() == "Atk") {
            this.attack += item.getAmt();
        }
        else { //Def//
            this.defense += item.getAmt();
        }
    }

    public void getItem(Item item) {
        for(int x = 0; x < this.itemList.length; x++) {
            if(this.numItems == 5) {
                System.out.println("Bag cannot hold more items! Would you like to replace it with any of the items in your current bag? y/n");
                Scanner one = new Scanner(System.in);
                if(one.nextLine() == "y") {
                    System.out.println("1. " + this.itemList[0].getName() +
                        "\n 2. " + this.itemList[1].getName() + "\n 3. " +
                         this.itemList[2].getName() + "\n 4. " +
                         this.itemList[3].getName() + "\n 5. " +
                         this.itemList[4].getName());
                    Scanner two = new Scanner(System.in);
                    while(two.nextInt() < 1 || two.nextInt() > 5) {
                        System.out.println("Not a valid Number! Please select a number from 1 to 5");
                        two.nextInt();
                    }
                }
                break;
            }
            if(this.itemList[x] == null) {
                this.itemList[x] = item;
                this.numItems++;
                System.out.println(this.getName() + " picked up a/an " +
                    item.getName());
                break;
            }
        }
    }
}

