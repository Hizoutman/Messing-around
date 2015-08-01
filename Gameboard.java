
import CharacterClasses.Character;

public class Gameboard{

    private Events[] eventBoard = new Events[100];
    private Character[] characterBoard = new Character[100];
    
    public Gameboard(){};

    public Gameboard(Events[] eventBoard,Character[] characterBoard) {
        this.eventBoard = eventBoard;
        this.characterBoard = characterBoard;
    }
    
}

