import CharacterClasses.Character;
//import Enemy;
import CharacterClasses.EnemyGen;

public class Events {
    private String description;
    private Character monster;
     int battleCounter = 0;

    public Events(){}

    public Events(String description) {
        this.description = description;
    }

    public Events(String description,Character player) {
    	this.description = description;
    	if(description.equals("Battle")){
    		EnemyGen gen = new EnemyGen();
        	this.monster = gen.createRandEnemy();
			battleCounter++;
			System.out.println(monster.getName() + " appears!. No. " + battleCounter);
	   		Battle encounter = new Battle(player,monster);// write better
    	}
    	if(description.equals("HP")){
    		System.out.println(player.getName() +" found an apple!\n" +player.getName() +" ate the apple.\nRecovered 50 hp.");
    		player.setHealth(player.getHealth() + 50);
    	}
    	if(description.equals("DefChange")){
    		
    	}
    	if(description.equals("AttChange")){
    		
    	}
    }

    public void getDescription() {
        System.out.println(this.description);
    }

    public Character getEnemy() {
        return this.monster;
    }

    /*
    public Event generateEvent() {
        //Event generator
        
    }
    */
}
