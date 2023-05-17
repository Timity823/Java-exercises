package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.ability.CanFly;
import avengers.hero.infinitystone.InfinityStone;
import avengers.hero.tool.Passport;

public class AvengerFromEarth extends Hero implements CanFly {
    Passport passport =new Passport();
    public AvengerFromEarth(String name, int power, InfinityStone stone) {
        super(name, power, stone);
        fly();
        System.out.println("Passport No.: "+passport.getPassportNumber());
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }


}
