package avengers.hero.infinitystone;

import java.util.Objects;

public abstract class InfinityStone {
    private final String color;
    private final int power;

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public InfinityStone(String color, int power) {
        this.color = color;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfinityStone that = (InfinityStone) o;
        return power == that.power && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, power);
    }

    @Override
    public String toString() {
        return "InfinityStone{" +
                "color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
