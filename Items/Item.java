package Items;
public class Item {
    private String type; //heal,hurt,atk,def
    private int amt;
    private String name;

    public Item(String name, String type,int amt) {
        this.name = name;
        this.type = type;
        this.amt = amt;
    }

    public String getType() {
        return this.type;
    }

    public int getAmt() {
        return this.amt;
    }

    public String getName() {
        return this.name;
    }
}
