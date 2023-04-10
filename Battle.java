package RPG;

public class Battle {
    private Warrior attacker;
    private Warrior defender;
    public Battle (Warrior attacker, Warrior defender){
        this.attacker = attacker;
        this.defender = defender;

    }
    public Person run (){
        Person winner = null; 
        while (attacker.isAlive() && defender.isAlive()){
            int atack = attacker.harm();
            defender.reduce(atack);
            System.out.printf("Воин:%s наносит урон %d\nУ воина %s осталось %d HP\n", attacker.getName(),atack, defender.getName(),defender.getHp());
            if(!defender.isAlive()){
                System.out.printf("Воин %s погиб\n", defender.getName());
                return attacker;
            }
            int response = defender.harm();
            attacker.reduce(response);
            
            System.out.printf("Воин %s наносит урон %d\nУ воина %s осталось %d HP\n", defender.getName(),response, attacker.getName(),attacker.getHp());
            if(!attacker.isAlive()){
                System.out.printf("Воин %s погиб\n", attacker.getName());
                return defender;
            }
        }
        return winner;
    }
}
