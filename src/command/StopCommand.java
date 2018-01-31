package command;

public class StopCommand implements ICommand {
    private EntertainementSystem entertainementSystem;

    public StopCommand(EntertainementSystem entertainementSystem) {
        this.entertainementSystem = entertainementSystem;
    }

    @Override
    public void execute() {

        entertainementSystem.stop();
    }
}
