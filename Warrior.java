public class WarriorClass extends Character{
  private String special;
  
    public WarriorClass(String name, int health,int attack,int defense){
    super(name,health,attack,defense);
    this.special = "Bash";
    }
    public String getSpecial(){
      return this.special;
    }
    public void Special(Character a){
      //crit attack/low hit rate
      System.out.println("Warrior used special move!");
      attack(a);
    }
}
