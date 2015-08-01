package CharacterClasses;
public class Priest extends Character {
	private String special;
	  
    public Priest(String name, int health,int attack,int defense){
    super(name,health,attack,defense);
    this.special = "Heal";
    }
    public String getSpecial(){
      return this.special;
    }
    public void special(Character a){
      attack(a);
      System.out.println("Priest used special move!");
      //spends the turn to heal wounds
    }
}
