import CharacterClasses.*;
import CharacterClasses.Character;
import java.util.Scanner;

//import characterClass.*;
public class Driver{

  public static void main(String[] args){
  	Scanner input = new Scanner(System.in);
  	System.out.println("Welcome, please enter in a name");
  	String name = input.next();
  	System.out.println("Select a character class from the list:\n1) Warrior HP:100 Atk:9 Def:1 " +
  	"\n2) Mage HP:80 Atk:4 Def:6"+
  	"\n3) Thief HP:76 Atk:7 Def:3"+
	"\n4) Priest HP:94 Atk:2 Def:8"+
	"\n5) Magical Girl HP: 20 Atk: 6 Def: 4"+
  	"\n6) Ninja HP: 88 Atk: 5 Def: 5"+
  	"\n7) Dragon Tamer HP:80 Atk: 3 Def: 7");
  	int choice = input.nextInt();
  	while(true) {
      	if(choice < 1 || choice > 8) {
        	System.out.println("invalid, please enter in the number of the corresponding class.");
        	choice = input.nextInt();
      	}
      	else {
          	break;
      	}
  	}
  	if(choice==1) {
     		Character player = new Warrior(name,100,9,1);
  	}
  	if(choice==2) {
     		Character player = new Mage(name,80,4,6);
  	}
  	if(choice==3) {
     		Character player = new Thief(name,76,7,3);
  	}
  	if(choice==4) {
     		Character player = new Priest(name,94,2,8);
  	}
  	if(choice==5) {
     		Character player = new MagicalGirl(name,20,6,4);
  	}
  	if(choice==6) {
     		Character player = new Ninja(name,88,5,5);
  	}
  	if(choice==7) {
     		Character player = new DragonTamer(name,80,3,7);
  	}
  //add in other classes according to choices
  System.out.println("Now its time to start your Battle!");

  //BATTLE PHASE BEGINS//
  //add in other classes according to choices
  
  //need 'events' for stat/hp changes as well as detailed encounters
  AdvSim sim = new AdvSim(player);
  input.close();//ensure that close for scanner is at the end ALWAYS. Might go to a java.util.NoSuchElement
  }
}
