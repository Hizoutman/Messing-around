public class Thief extends Character{
  private String special;
  
    public Theif(String name, int health,int attack,int defense){
    super(name,health,attack,defense);
    this.special = "Bash";
    }
    public String getSpecial(){
      return this.special;
    }
    public void Special(Character a){
      //crit attack/low hit rate
      System.out.println("Thief used special move!");
      attack(a);
    }
}
