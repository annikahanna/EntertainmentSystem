package main;

import Iterator.Movie;
import Iterator.MovieDatabase;
import Iterator.Music;
import Iterator.MusicDatabase;
import command.*;
import state.EntertainementSystemState;
import state.StatusZero;

public class Application {

    public static void main (String... args){

        EntertainementSystemState entertainementSystemState = new EntertainementSystemState();
        entertainementSystemState.setState(new StatusZero());

        RemoteControl remote = new RemoteControl();
        MusicDatabase musicDatabase = new MusicDatabase(2);
        musicDatabase.addSong(new Music("Triumpf"));
        musicDatabase.addSong(new Music("Matrix"));
        MovieDatabase movieDatabase = new MovieDatabase(2);
        movieDatabase.addMovie(new Movie("Deadpool"));
        movieDatabase.addMovie(new Movie("Django Unchained"));
        EntertainementSystem entertainementSystem = new EntertainementSystem(entertainementSystemState,movieDatabase,musicDatabase);
        ICommand start = new StartCommand(entertainementSystem);
        ICommand forward = new ForwardCommand(entertainementSystem);
        ICommand backward = new BackwardCommand(entertainementSystem);
        ICommand stop = new StopCommand(entertainementSystem);
        remote.setCommand(forward);
        remote.pressButton();
        remote.setCommand(backward);
        remote.pressButton();
        remote.setCommand(start);
        remote.pressButton();
        remote.setCommand(stop);
        remote.pressButton();




    }
}
