import java.util.Scanner;
public class Driver{
  
  private String name;
  private String job;
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
      if(choice<1 || choice>4){
        System.out.println("invalid, please enter in the number of the corresponding class.");
      }
      else break;
    }
  Character player = new Character();
  if(choice==1)player.Character(name,100,9,1);
  if(choice==2)player.Character(name,80,4,6);;
  if(choice==3)player.Character(name,76,7,3);;
  if(choice==4)player.Character(name,94,2,8);;
  System.out.println("Now its time to start your adventure!");
  Gameboard game = new Gameboard();
  
  input.close()
  }

}
