public class WarriorClass extends Character{
  private String special;
  
    public WarriorClass(String name, int health,int attack,int defense){
    super();
    this.special = "Bash";
    }
    public String getSpecial(){
      return this.special;
    }
}
