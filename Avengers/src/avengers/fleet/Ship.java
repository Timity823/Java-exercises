package avengers.fleet;

import avengers.exception.ShipFullException;
import avengers.hero.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ship {
    //itt lista lesz amiben összesen 4 elem lesz

    private final int MAX_SEAT_ON_SHIP = 4;
    private final List<Hero> heroes = new ArrayList<>(MAX_SEAT_ON_SHIP);

    public boolean addHeroToShip(Hero hero) {
        if (isShipFull()) {
            return false;
        }
        heroes.add(hero);
        return true;
    }

    public void addHeroToShipV2(Hero hero) {
        if (isShipFull()) {
            return;
        }
        heroes.add(hero);
        return;
    }

    public List<Hero> getHeroes() {
        return Collections.unmodifiableList(heroes);
    }

    public void addHeroToShipV3(Hero hero) {
        if (isShipFull()) {
            throw new ShipFullException();
        }
        heroes.add(hero);

    }

    private boolean isShipFull() {

        return (heroes.size() >= MAX_SEAT_ON_SHIP);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "ship=" + heroes +
                '}';
    }
}
