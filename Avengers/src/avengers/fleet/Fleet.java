package avengers.fleet;

import avengers.hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class Fleet extends Ship{
    List<Ship> ships = new ArrayList<>();

    public Fleet() {

    }

    public boolean addShipToFleet(Ship ship){
        if (isShipFull()) {
            ships.add(ship);
        }
       return false;

    }


    @Override
    public String toString() {
        return "Fleet{" +
                "ships=" + ships +
                '}';
    }
}
