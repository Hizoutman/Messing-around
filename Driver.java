import java.util.Scanner;
public class Driver{
  
  private String name;
  private int choice;
  
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome, please enter in a name");
    name = input.next();
  System.out.println("Select a character class from the list:\n1)Warrior HP:100 Str:9 Def:1 " +
  "\n2)Mage HP:80 Str:4 Def:6"+
  "\n3)Thief HP:76 Str:7 Def:3"+
  "\n4)Priest HP:94 Str:2 Def:8");
    while(true){
      choice = input.nextInt();
      if(choice<1 || choice>6){
        System.out.println("invalid, please enter in the number of the corresponding class.");
      }
      else break;
    }
  Character player = new Character();
  if(choice==1)player.WarriorClass(name,100,9,1);
  if(choice==2)player.MageClass(name,80,4,6);;
  if(choice==3)player.ThiefClass(name,76,7,3);;
  if(choice==4)player.PriestClass(name,94,2,8);;
  //add in other classes according to choices
  System.out.println("Now its time to start your adventure!");
  
  input.close()
  }

}
