package CharacterClasses;
public class Priest extends Character {
	private String special;
	  
    public Priest(String name, int health,int attack,int defense,int agility,int luck){
    super(name,health,attack,defense,agility,luck);
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
