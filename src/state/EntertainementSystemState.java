package state;

public class EntertainementSystemState {

    private IEntertainementSystemState state;

    public IEntertainementSystemState getState() {
        return state;
    }

    public void setState(IEntertainementSystemState state) {
        this.state = state;
    }

    public void promote(){
        state.promote(this);
    }


}
