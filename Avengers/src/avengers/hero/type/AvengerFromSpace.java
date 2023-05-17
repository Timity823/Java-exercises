package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.ability.CanFly;
import avengers.hero.ability.FireThrower;
import avengers.hero.ability.Swimming;
import avengers.hero.infinitystone.InfinityStone;

public  class AvengerFromSpace extends Hero implements Swimming, FireThrower {
    public AvengerFromSpace(String name, int power, InfinityStone stone) {
        super(name, power, stone);
        swim();
        fireThrower();
    }

    @Override
    public void swim() {
        System.out.println("Can swim.");
    }

    @Override
    public void fireThrower() {
        System.out.println("Can throw Fire.");
    }


}
