package avengers.processor;

import avengers.fleet.Fleet;
import avengers.fleet.Report;
import avengers.hero.Hero;
import avengers.hero.type.HeroFactory;

public class CommandProcessor {
    private final Fleet fleet;
    private final HeroFactory heroFactory;
    private final Report report;

    public CommandProcessor(Fleet fleet, HeroFactory heroFactory, Report report) {
        this.fleet = fleet;
        this.heroFactory = heroFactory;
        this.report = report;
    }

    public void addHero(String input){
        Hero hero = heroFactory.create(input);
        fleet.addHeroToFleet(hero);
    }
    public void generateReport (){
        report.printNumberOfStonesByType();
        report.printSumOfPowers();
    }
}
