package RPG;

public class Bigshield implements Shield{

    @Override
    public int defend() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("Большой щит\nЗащита:%d",this.defend());
    }
}
