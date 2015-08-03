package Simulator;
import CharacterClasses.Character;
import Mechanics.Dice;
import Mechanics.EnemyGen;

import java.util.Scanner;

public class AdvSim {

	public AdvSim(Character player){
		
		Events event = new Events();
		Scanner in = new Scanner(System.in);
		int input;
		
		System.out.println("1)Random events\n2)Scenario 1\n3)Item test");
		input = in.nextInt();
		
		while(input<1 || input>3){
			System.out.println("Invalid number, please enter the correct number.");
			System.out.println("1)Random events\n2)Scenario 1\n3)Item test");
			input = in.nextInt();
		}
		
		if(input==1){
			while(true){
				Dice num = new Dice();
				if(num.roll()%2==0){
					event = new Events("Battle",player);
				}
				if(num.roll()==1){
					event = new Events("HP",player);
				}
				if(num.roll()==3){
					event = new Events("AttChange",player);
				}
				if(num.roll()==5){
					event = new Events("DefChange",player);	
				}
				
			}
		}
		if(input==2){
			chpt1 scene = new chpt1(player,event);
		}
		if(input==3){
			ItemScenario item = new ItemScenario(player,event);
			
		}
	}
	
}
