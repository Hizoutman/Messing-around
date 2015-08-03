package Simulator;


import CharacterClasses.Character;
import Mechanics.Battle;

public class chpt1 {
	
	public chpt1(Character p1, Events e){
		
		Battle encounter = new Battle();
		Character e1 = new Character("grunt",15,5,3);
		Character b = new Character("big boss",100,9,9);
		
		System.out.println("You will confront 3 enemies and then a boss");
		
		for(int x = 0;x<3;x++){
		encounter = new Battle(p1,e1);
		}
		System.out.println("Final boss");
		encounter = new Battle(p1,b);
		System.out.println("Scenario End");
		System.exit(0);
		
	}
	
}
