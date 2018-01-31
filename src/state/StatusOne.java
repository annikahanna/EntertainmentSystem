package state;

public class StatusOne implements IEntertainementSystemState {
    @Override
    public void promote(EntertainementSystemState entertainementSystemState) {
        entertainementSystemState.setState(new StatusZero());

    }

    @Override
    public void print() {
        System.out.println("Status one");
    }

    public String toString (){
        return "One";
    }
}
