//package misc;
public class Dice { //Dice class, rolls a dice etc.//

    public Dice() {}

    public int roll() {
        int result = (int)(Math.random()*6) + 1;
        return result;
    }
    
    public int roll2() {
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int result = die1 + die2;
        return result;
    }
}
