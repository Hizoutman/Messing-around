public class MageClass extends Character{
  private String special;
  
    public WarriorClass(String name, int health,int attack,int defense){
    super(name,health,attack,defense);
    this.special = "Incantation";
    }
    public String getSpecial(){
      return this.special;
    }
    public void Special(Character a){
      attack(a);
      System.out.println("Mage used special move!");
      //skips turn and next attack has an empowered attack
    }
}