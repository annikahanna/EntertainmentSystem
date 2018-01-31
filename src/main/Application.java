package main;

import iterator.*;
import command.*;
import state.*;

public class Application {

    public static void main (String... args){

        EntertainementSystemState entertainementSystemState = new EntertainementSystemState();
        entertainementSystemState.setState(new StatusZero());

        RemoteControl remote = new RemoteControl();
        MusicDatabase musicDatabase = new MusicDatabase(2);
        musicDatabase.addSong(new Music("Track01"));
        musicDatabase.addSong(new Music("Track02"));
        MovieDatabase movieDatabase = new MovieDatabase(2);
        movieDatabase.addMovie(new Movie("Deadpool"));
        movieDatabase.addMovie(new Movie("Django Unchained"));
        EntertainementSystem entertainementSystem = new EntertainementSystem(entertainementSystemState,movieDatabase,musicDatabase);
        ICommand start = new StartCommand(entertainementSystem);
        ICommand forward = new ForwardCommand(entertainementSystem);
        ICommand backward = new BackwardCommand(entertainementSystem);
        ICommand stop = new StopCommand(entertainementSystem);
        remote.setCommand(start);
        remote.pressButton();
        remote.setCommand(backward);
        for(int i= 0; i < 5;i++){
            remote.pressButton();
        }
        remote.setCommand(forward);
        for (int j = 0; j<6; j++){
            remote.pressButton();
        }
        remote.setCommand(stop);
        remote.pressButton();




    }
}
