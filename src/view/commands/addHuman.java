package view.commands;

import view.ConsoleUI;

public class addHuman extends Command {
    public addHuman(ConsoleUI consoleUI) {
        super("Добавить человека", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addHuman();
    }
}
