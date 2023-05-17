package avengers.hero.infinitystone;

public class MindStone extends InfinityStone{
    private String color= "Yellow";
    private int power = 15;

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
