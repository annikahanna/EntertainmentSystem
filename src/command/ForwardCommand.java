package command;

public class ForwardCommand  implements ICommand {
    private EntertainementSystem entertainementSystem;

    public ForwardCommand(EntertainementSystem entertainementSystem){
        this.entertainementSystem = entertainementSystem;
    }

    @Override
    public void execute() {

        entertainementSystem.forward();
    }
}
