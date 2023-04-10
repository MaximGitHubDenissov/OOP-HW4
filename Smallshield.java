package RPG;

public class Smallshield implements Shield{
    
    
    @Override
    public int defend() {
        return 5;
    }
    @Override
    public String toString() {
       return String.format("Маленький щит\nЗащита:%d", this.defend());
    }
    
}
