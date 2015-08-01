import CharacterClasses.*;
import CharacterClasses.Character;
import java.util.Scanner;

//import characterClass.*;
public class Driver{

  public static void main(String[] args){
	
	String name;
	int choice;
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome, please enter in a name");
    name = input.next();
    System.out.println("Select a character class from the list:\n1)Warrior HP:100 Str:9 Def:1 " +
    		"\n2)Mage HP:80 Str:4 Def:6"+
    		"\n3)Thief HP:76 Str:7 Def:3"+
    		"\n4)Priest HP:94 Str:2 Def:8");
//need to add the other classes
    while(true){
      choice = input.nextInt();
      if(choice<1 || choice>6){
        System.out.println("invalid, please enter in the number of the corresponding classes.");
      }
      else break;
    }
    Character player = new Character();
    if(choice==1){
    	player = new Warrior(name,100,9,1);
    }
    if(choice==2){
    	player = new Mage(name,80,4,6);
    }
    if(choice==3){
    	player = new Thief(name,76,7,3);
    }
    if(choice==4){
    	player = new Priest(name,94,2,8);
    }
//change stats of other classes
    if(choice==5){
    	player = new MagicalGirl(name,94,2,8);
    }
    if(choice==6){
    	player = new DragonTamer(name,94,2,8);
    }
    if(choice==7){
    	player = new Ninja(name,94,2,8);
    }
    
    //add in other classes according to choices
    System.out.println("Now its time to start your adventure!");
    //need 'events' for stat/hp changes as well as detailed encounters
    
    AdvSim sim = new AdvSim(player);
    
   	input.close();//ensure that close for scanner is at the end ALWAYS. Might go to a java.util.NoSuchElement
  }

}
