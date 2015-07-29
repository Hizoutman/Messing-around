public class Dice { //Dice class, rolls a dice etc.//

    public Dice() {}

    public int roll() {
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int result = die1 + die2;
        return result;
    }
}
