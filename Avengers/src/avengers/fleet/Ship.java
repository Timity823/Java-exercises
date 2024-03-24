package avengers.fleet;

import avengers.hero.Hero;

import java.util.List;

public class Ship {
    //itt lista lesz amiben összesen 4 elem lesz

    private final int MAX_SEAT_ON_SHIP=4;
    public List<Hero> heroes;

    public Ship() {
    }
    public boolean addHeroToShip(Hero hero){
        heroes.add(hero);
        if (isShipFull()){
            return true;
        }
        return false;
    }

    public boolean isShipFull(){
        return (heroes.size()>MAX_SEAT_ON_SHIP);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "ship=" + heroes +
                '}';
    }
}
