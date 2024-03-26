package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.ability.FireThrower;
import avengers.hero.ability.Swim;
import avengers.hero.infinitystone.InfinityStone;
import avengers.hero.infinitystone.SingletonStone;

public class AvengerFromSpace extends Hero implements Swim, FireThrower {
    public AvengerFromSpace(String name, int power, SingletonStone stone) {
        super(name, power, stone);
    }

    @Override
    public void swim() {
        System.out.println("Can swim.");
    }

    @Override
    public void throwFire() {
        System.out.println("Can throw Fire.");
    }


}
