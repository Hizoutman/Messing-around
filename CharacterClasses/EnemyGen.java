package CharacterClasses;

public class EnemyGen extends Character {
	
	private String[] ClassNames = {"Enemy A", "Skeleton", "Your Mom", "Jelly", "Thief", "Mage", "Warrior", "Priest", "Donald Trump", "Ninja", "Tsundere twintail imouto", "Morde"};
	
	public EnemyGen(){}
	
	public Character createRandEnemy(){
		Character a;
		int chosenInd = randomGen();
		
		if(chosenInd == (ClassNames.length - 1)) {
			a = new Character(ClassNames[chosenInd], 255, 255, 0);
		}
		else{
			a = new Character(ClassNames[chosenInd], 0,0,0);//make a stat changer
		}
		return a;
	}
	public int randomGen() {
		return (int) (Math.random() * ClassNames.length);
	}
	
	
}
