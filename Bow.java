package RPG;

public class Bow extends Throwing {
    private String name;
    
    public Bow(int range, String name){
        super(range);
        this.name = name;
    }
    
    
    @Override
    public int damage() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("%s, Название: %s", super.toString(),name);
    }
}
