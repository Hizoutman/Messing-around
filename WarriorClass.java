public class WarriorClass extends Character{
  private String special;
  
    public WarriorClass(String name, int health,int attack,int defense){
    super();
    this.special = "Bash";
    //crit attack/low hit rate
    }
    public String getSpecial(){
      return this.special;
    }
}
