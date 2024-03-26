package avengers.fleet;

import avengers.exception.ShipFullException;
import avengers.hero.Hero;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Fleet {
    private final List<Ship> ships = new LinkedList<>();

    public Fleet() {
        super();
        ships.add(new Ship());
    }

    public boolean addHeroToFleet(Hero hero) {
        try {
            Ship lastShip = ships.get(ships.size() - 1);
            lastShip.addHeroToShipV3(hero);
            return true;
        } catch (ShipFullException e) {
            Ship ship = new Ship();
            ship.addHeroToShipV3(hero);
            ships.add(ship);
            return false;
        }
    }

    public List<Ship> getShips() {
        return Collections.unmodifiableList(ships);
    }

    @Override
    public String toString() {
        return "Fleet{" +
                "ships=" + ships +
                '}';
    }
}

