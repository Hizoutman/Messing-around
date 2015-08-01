package misc;
import Enemy;

public class Events {
    private String description;
    private Enemy monster;

    public Events(){}

    public Events(String description) {
        this.description = description;
    }

    public Events(String description ,Enemy monster) {
        this.description = description;
        this.monster = monster;
    }

    public void getDescription() {
        System.out.println(this.description);
    }

    public Enemy getEnemy() {
        return this.monster;
    }

    /*
    public Event generateEvent() {
        //Event generator
        
    }
    */
}
