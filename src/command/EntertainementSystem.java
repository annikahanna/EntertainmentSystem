package command;

import state.EntertainementSystemState;
import state.StatusOne;

public class EntertainementSystem {

    EntertainementSystemState entertainementSystemState;

    public EntertainementSystem(EntertainementSystemState entertainementSystemState) {
        this.entertainementSystemState = entertainementSystemState;
    }


    public void start() {
        if (entertainementSystemState.toString().equals("Zero")) {
            entertainementSystemState.promote();
        }

    }

    public void forward() {
        if (entertainementSystemState.toString().equals("Zero")) {

        }
        else {

        }

    }

    public void backward() {
        if (entertainementSystemState.toString().equals("Zero")) {

        }
        else {

        }

    }

    public void stop() {
        if (entertainementSystemState.toString().equals("One")) {
            entertainementSystemState.promote();

        }

    }


}
