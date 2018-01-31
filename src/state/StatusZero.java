package state;

public class StatusZero implements IEntertainementSystemState {


    @Override
    public void promote(EntertainementSystemState entertainementSystemState) {
        entertainementSystemState.setState(new StatusOne());

    }

    @Override
    public void print() {
            System.out.println("Status zero");
    }

    public String toString (){
        return "Zero";
    }
}
