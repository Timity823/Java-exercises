package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.ability.CanFly;
import avengers.hero.infinitystone.InfinityStone;
import avengers.hero.infinitystone.SingletonStone;
import avengers.hero.tool.Passport;

import java.util.Objects;

public class AvengerFromEarth extends Hero implements CanFly {
    private final Passport passport = new Passport();

    public AvengerFromEarth(String name, int power, SingletonStone stone) {
        super(name, power, stone);
        passport.getPassportNumber();
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AvengerFromEarth that = (AvengerFromEarth) o;
        return Objects.equals(passport, that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passport);
    }
}
