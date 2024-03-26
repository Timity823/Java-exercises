package avengers;

import avengers.fleet.Fleet;
import avengers.fleet.Report;
import avengers.hero.type.HeroFactory;
import avengers.processor.CommandInterpreter;
import avengers.processor.ConsoleReader;
import avengers.processor.CommandProcessor;

public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        Fleet fleet = new Fleet();
        Report report = new Report(fleet);
        CommandProcessor engine = new CommandProcessor(fleet,heroFactory, report);
        CommandInterpreter commandInterpreter =new CommandInterpreter(engine);
        ConsoleReader consoleReader = new ConsoleReader(commandInterpreter);
        consoleReader.read();

    }
}
