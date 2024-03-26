package avengers.hero.type;

import avengers.hero.Hero;
import avengers.hero.infinitystone.SingletonStone;

public class HeroFactory {
    public Hero create(String input) {
        //split
        //String[]
        //item -> Constructor
        String[] data = input.split(";");
        String name = data[0];
        int strength = Integer.parseInt(data[1]);
        SingletonStone stone = SingletonStone.valueOf(data[2].trim().toUpperCase());
        boolean bornOnEarth = Boolean.parseBoolean(data[3]);
        if (bornOnEarth){
            return new AvengerFromEarth(name,strength,stone);
        }else {
            return new AvengerFromSpace(name,strength,stone);
        }
   }
}
