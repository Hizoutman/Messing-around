package Mechanics;
import CharacterClasses.Character;
import java.util.Scanner;

public class Battle {

	private boolean fight = true;
	private Scanner turn = new Scanner(System.in);
	

	public Battle(){};

	public Battle(Character a, Character b) {
		int round = 1;
		while(fight){
			System.out.println("Round " + round + " has begun!");
			System.out.println("What do you want to do?\n1)attack\n2)Defend\n3)Special");
			command(turn.nextInt(),a,b);

			if(b.died == false){// enemy turn
				b.attack(a);
				System.out.println("Your Health: " + a.getHealth());
				System.out.println("Enemy Health: " + b.getHealth());
			}
			if(a.died){
				System.out.println("Game Over");
				System.exit(0);
			}
			if(b.died){
				System.out.println("You defeated the Enemy!");
				System.out.println("Your Health: " + a.getHealth());
				fight = false;
			}
			round++;
			a.reset();
		}
	}

	private void command(int x, Character a, Character b){
		if(x==1){
			a.attack(b);
		}
		if(x==2){
			System.out.println(a.getName() + " defends!");
			a.setDefense(a.getDefense()*2);
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
