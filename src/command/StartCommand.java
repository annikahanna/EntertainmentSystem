package command;

public class StartCommand implements ICommand {
    private EntertainementSystem entertainementSystem;

    public StartCommand (EntertainementSystem entertainementSystem){
        this.entertainementSystem = entertainementSystem;
    }
    @Override
    public void execute() {
        entertainementSystem.start();
    }
}
