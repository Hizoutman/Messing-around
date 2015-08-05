package CharacterClasses;
public class Warrior extends Character{
  private String special;
  
    public Warrior(String name, int health,int attack,int defense,int agility,int luck){
    super(name,health,attack,defense,agility,luck);
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
