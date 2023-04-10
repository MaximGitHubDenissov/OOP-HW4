package RPG;

abstract class Throwing implements Weapon {
    int range;
 
    @Override
    public String toString() {
        return String.format("Метательное. Урон %d Расстояние %d ", damage(),range);
    }
    public int getRange() {
        return range;
    }
    public Throwing(int range){
        this.range = range;
    }
}
