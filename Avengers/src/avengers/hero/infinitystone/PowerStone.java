package avengers.hero.infinitystone;

public class PowerStone extends InfinityStone{
    private String color= "Purple";
    private int power = 12;

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
