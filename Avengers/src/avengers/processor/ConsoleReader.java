package avengers.processor;

import java.util.Scanner;

public class ConsoleReader {
    private final CommandInterpreter commandInterpreter;


    public ConsoleReader(CommandInterpreter commandInterpreter) {
        this.commandInterpreter = commandInterpreter;
    }


    public void read() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                boolean stopReadingCommands = commandInterpreter.parse(input);
                if (stopReadingCommands) {
                    break;
                }
            }
        }
    }
}
