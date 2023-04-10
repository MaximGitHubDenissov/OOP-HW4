package RPG;

public class Middleshield implements Shield {

    @Override
    public int defend() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Средний щит\nЗащита:%d",this.defend());
    }
    
}
