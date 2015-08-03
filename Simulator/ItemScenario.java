package Simulator;

import CharacterClasses.Character;
import Mechanics.Dice;

public class ItemScenario {

	public ItemScenario(Character p, Events e){
		String des = "";
		Dice die = new Dice();
		while(true){
			int x = die.roll();
			if(x==1 || x==5){
				des = "HP";
			}
			if(x%2==0){
				des = "DefChange";
			}
			if(x==3){
				des = "AttChange";
			}
			e = new Events(des,p);
		}
	}
	
}
