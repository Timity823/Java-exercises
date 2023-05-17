package avengers.hero.infinitystone;

public class SoulStone extends InfinityStone{
    private String color= "Brown";
    private int power = 50;

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
