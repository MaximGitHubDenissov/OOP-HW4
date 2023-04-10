package RPG;

public class Noshield implements Shield {
    @Override
    public int defend() {
        return 0;
    }
    @Override
    public String toString() {
        return "Без щита";
    }
    
}
