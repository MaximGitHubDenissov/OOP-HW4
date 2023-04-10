package RPG;

abstract class Person {
    private String name;
    private int hp;
    public boolean isAlive(){
        return hp>0;
    }
    

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    
}

