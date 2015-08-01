
import java.util.Scanner;

public class Battle {

	private boolean fight = true;
	private Scanner turn = new Scanner(System.in);
	
	public Battle(Character a, Character b){
		while(fight){
			System.out.println("What do you want to do?\n1)attack\n2)Defend\n3)Special");
			command(turn.nextInt(),a,b);
			if(b.died == false){
				b.attack(a);
				System.out.println(b.getHealth());
			}
			System.out.println(a.getHealth());
			if(a.died){
				System.out.println("Game Over");
				System.exit(0);
			}
			if(b.died){
				System.out.println("You defeated the Enemy!");
				fight = false;
			}
		}
	}
	
	private void command(int x, Character a, Character b){
		if(x==1){
			a.attack(b);	
		}
		if(x==2){
			System.out.println(a.getName() + " defends!");
		}
		if(x==3){
			System.out.println(a.getName() + " uses " + a.getSpecial());
			a.special(b);
		}
	}
	
	/*
	private String showHp(Character a){
		System.out.println("");
	}
	*/
}