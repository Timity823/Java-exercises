package avengers;

import avengers.fleet.Fleet;
import avengers.fleet.Ship;
import avengers.hero.Hero;
import avengers.hero.infinitystone.InfinityStone;
import avengers.hero.infinitystone.MindStone;
import avengers.hero.infinitystone.SpaceStone;
import avengers.hero.infinitystone.TimeStone;
import avengers.hero.type.AvengerFromEarth;
import avengers.hero.type.AvengerFromSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String STOP_MARKER = "STOP";

        InfinityStone spaceStone = new SpaceStone();
        InfinityStone timeStone = new TimeStone();
        InfinityStone mindStone = new MindStone();

        List<Hero> listOfHero = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                Hero hero = new Hero(scanner.next());
                if (STOP_MARKER.equals(hero)) {
                    break;
                } else {

                }


            }
        }
    }
}
