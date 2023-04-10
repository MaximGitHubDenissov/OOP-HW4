package RPG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T> {

    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {

        return persons.iterator();
    }

    public Team<T> addPers(T person) {
        this.persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T person : this) {
            sb.append(person);
            sb.append("\n");

        }
        sb.append(String.format("Максимальное поражение: %d", maxRange()));
        sb.append("\n");
        sb.append(String.format("Минимальная защита: %d", minDefence()));
        return sb.toString();

    }
    public int maxRange(){
        int max = 0;
        for (T pers : this) {
            if(pers instanceof Archer){
                Archer archer = (Archer)pers;
                if(archer.range()>max){
                    max = archer.range();
                }
            }
            
        }
        return max;
    }
    public int minDefence(){
        int min = 100;
        for (T pers : this) {
            if(pers instanceof Warrior){
                Warrior res = (Warrior)pers;
                if(res.defence()<min){
                    min = res.defence();
                }
            }
            
        }
        return min;
    }

}