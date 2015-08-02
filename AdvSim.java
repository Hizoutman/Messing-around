import CharacterClasses.Character;
import CharacterClasses.EnemyGen;

public class AdvSim {

	public AdvSim(Character player){
		
		Events event = new Events();

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
	
}
