package RPG;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefs = new Team<>();
        archers.addPers(new Archer("Elf", 75, new Bow(10, "Эльфийский лук"), new Smallshield()))
                .addPers(new Archer("Ork", 100, new Bow(15, "Орочий лук"), new Bigshield()));
        thiefs.addPers(new Thief("Hobbit", 60, new Knife(), new Middleshield()))
                .addPers(new Thief("Gnol", 65, new Knife(), new Bigshield()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefs);
        // Archer first = new Archer("John", 70, new Bow(10, "Обычный лук"),new Middleshield());
        // Archer second = new Archer("Smith", 100, new Bow(10, "Обычный лук"), new Noshield());
        // Battle bt = new Battle(first, second);
        // bt.run();
    }
}
