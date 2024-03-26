package avengers.fleet;

import java.util.stream.Collectors;

public class Report {
    private final Fleet fleet;

    public Report(Fleet fleet) {
        this.fleet = fleet;
    }
   // Mondjuk meg hogy egye adott kőből hány darab van

    public void printSumOfPowers (){
        int sumOfPower = fleet.getShips().stream()
                .map(ship -> ship.getHeroes())
                .flatMap(list->list.stream())
                .mapToInt(hero -> hero.getPower())
                .sum();
        System.out.println("Sum of power: "+sumOfPower);
    }

    public void printNumberOfStonesByType (){
        fleet.getShips().stream()
                .map(ship -> ship.getHeroes())
                .flatMap(list->list.stream())
                .map(hero -> hero.getStone())
                .collect(Collectors.toMap(
                        infinityStone -> infinityStone,
                        infinityStone -> 1,
                        (v1,v2)-> v1+v2
                ))
                .forEach((k,v)-> System.out.println(k+" "+v));
    }
}
