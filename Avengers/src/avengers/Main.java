package avengers;

import avengers.hero.Hero;
import avengers.hero.infinitystone.InfinityStone;
import avengers.hero.infinitystone.SpaceStone;
import avengers.hero.infinitystone.TimeStone;
import avengers.hero.type.AvengerFromEarth;
import avengers.hero.type.AvengerFromSpace;

public class Main {
    public static void main(String[] args) {
        InfinityStone spaceStone = new SpaceStone();
        InfinityStone timeStone = new TimeStone();
       // System.out.println(spaceStone);
        Hero captainAmerica = new AvengerFromEarth("Captain America", 10, spaceStone);
        System.out.println(captainAmerica);
        Hero thor= new AvengerFromSpace("Thor",15,timeStone);
        System.out.println(thor);

    }
}