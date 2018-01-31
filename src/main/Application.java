package main;

import Iterator.MusicDatabase;
import command.EntertainementSystem;
import command.ICommand;
import command.RemoteControl;
import command.StartCommand;
import state.EntertainementSystemState;
import state.StatusZero;

public class Application {

    public static void main (String... args){

        EntertainementSystemState entertainementSystemState = new EntertainementSystemState();
        entertainementSystemState.setState(new StatusZero());

        RemoteControl remote = new RemoteControl();
        MusicDatabase musicDatabase = new MusicDatabase(2);
        EntertainementSystem entertainementSystem = new EntertainementSystem(entertainementSystemState);
        ICommand start = new StartCommand(entertainementSystem);
        remote.setCommand(start);
        remote.pressButton();



    }
}
