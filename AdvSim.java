import CharacterClasses.Character;
import CharacterClasses.EnemyGen;

public class AdvSim {

	public AdvSim(Character player){

		while(true){
			Dice num = new Dice();
			if(num.roll()%2==0){
				Events fight = new Events("Battle",player);
			}
			if(num.roll()%2==1){
				Events fight = new Events("HP",player);
			}
			
		}
	}
	
}
