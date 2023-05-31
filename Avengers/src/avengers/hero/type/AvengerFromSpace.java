package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.ability.FireThrower;
import avengers.hero.ability.Swim;
import avengers.hero.infinitystone.InfinityStone;

public  class AvengerFromSpace extends Hero implements Swim, FireThrower {
    public AvengerFromSpace(String name, int power, InfinityStone stone) {
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
