
public class Warrior extends Character{
  private String special;
  
    public Warrior(String name, int health,int attack,int defense){
    super(name,health,attack,defense);
    this.special = "Bash";
    }
    public String getSpecial(){
      return this.special;
    }
    public void special(Character a){
      //crit attack/low hit rate
      System.out.println("Warrior used special move!");
      attack(a);
    }
}
