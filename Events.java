import CharacterClasses.Character;
<<<<<<< HEAD
import  CharacterClasses.Item;
//import Enemy;
=======
import CharacterClasses.Item;
>>>>>>> 1e21d3f96ce1ba5625c57875134513a75f44d308
import CharacterClasses.EnemyGen;

public class Events {
    private String description;
    private Character monster;
    static int battleCounter = 0;

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
    		System.out.println(player.getName() +" found an apple!");
            Item apple = new Item("Apple" , "Heal" , 50);
    		player.getItem(apple);
    	}
    	if(description.equals("DefChange")){
    		System.out.println(player.getName() +" found some Def. steriods!");
    		Item steroids = new Item("D Steroids" , "Def" , 5);
            player.getItem(steroids);
    	}
    	if(description.equals("AttChange")){
    		System.out.println(player.getName() +" found some Att. steriods!");
    		Item atkSteroids = new Item("A Steroids" , "Atk" , 5);
            player.getItem(atkSteroids);
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
