package command;

public class BackwardCommand implements ICommand {
    private EntertainementSystem entertainementSystem;

    public BackwardCommand(EntertainementSystem entertainementSystem){
        this.entertainementSystem = entertainementSystem;
    }

    @Override
    public void execute() {

        entertainementSystem.backward();
    }
}
