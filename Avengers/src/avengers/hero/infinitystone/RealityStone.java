package avengers.hero.infinitystone;

public class RealityStone extends InfinityStone{
    private String color= "Red";
    private int power = 20;

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
