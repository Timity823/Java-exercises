package avengers.hero.infinitystone;

public enum SingletonStone {
    MIND("Red", 15),
    POWER("Purple", 20),
    REALITY("Blue", 60),
    SOUL("Yellow", 35),
    SPACE("Green", 100),
    TIME("Black", 66);
    private final String color;
    private final int power;

    private SingletonStone(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }
}
