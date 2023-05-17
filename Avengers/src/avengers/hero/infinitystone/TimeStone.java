package avengers.hero.infinitystone;

public class TimeStone extends InfinityStone{
    private String color= "Green";
    private int power = 25;

    @Override
    public String getColor() {
        return this.getColor();
    }

    @Override
    public int getPower() {
        return this.getPower();
    }

    @Override
    public String toString() {
        return "SpaceStone{" +
                "color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
