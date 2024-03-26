package avengers.processor;

public class CommandInterpreter {
    private final CommandProcessor commandProcessor;
    private static final String STOP_MARKER = "STOP";

    public CommandInterpreter(CommandProcessor commandProcessor) {
        this.commandProcessor = commandProcessor;
    }

    public boolean parse(String command){
        if (STOP_MARKER.equals(command)) {
            commandProcessor.generateReport();
            return false;
        } else {
            commandProcessor.addHero(command);
        }
        return true;
    }
}
