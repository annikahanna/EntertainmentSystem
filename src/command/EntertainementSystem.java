package command;

import iterator.*;
import state.EntertainementSystemState;

public class EntertainementSystem {

    EntertainementSystemState entertainementSystemState;
    MusicDatabase musicDatabase;
    MovieDatabase movieDatabase;
    IIterator musiciterator;
    IIterator movieIterator;
    IIterator actualIterator;

    public EntertainementSystem(EntertainementSystemState entertainementSystemState, MovieDatabase movieDatabase, MusicDatabase musicDatabase) {
        this.entertainementSystemState = entertainementSystemState;
        this.movieDatabase = movieDatabase;
        this.musicDatabase = musicDatabase;
        musiciterator = musicDatabase.iterator();
        movieIterator = movieDatabase.iterator();
        actualIterator = musiciterator;
    }


    public void start() {
        if (entertainementSystemState.getState().toString().equals("Zero")) {
            entertainementSystemState.promote();
            if (actualIterator.toString().equals("Music")) {
                Music music = (Music) actualIterator.next();
                System.out.println(music.getSongname());
            } else {
                Movie movie = (Movie) actualIterator.next();
                System.out.println(movie.getMoviename());
            }
        }

    }

    public void forward() {
        if (entertainementSystemState.getState().toString().equals("Zero")) {
            if (actualIterator.toString().equals("Music")) {
                actualIterator = movieIterator;
            } else if (actualIterator.toString().equals("Movie")) {
                actualIterator = musiciterator;
            }

        } else {
            if (actualIterator.toString().equals("Music")) {
                Music music = (Music) actualIterator.next();
                System.out.println(music.getSongname());
            } else {
                Movie movie = (Movie) actualIterator.next();
                System.out.println(movie.getMoviename());
            }


        }

    }

    public void backward() {
        if (entertainementSystemState.getState().toString().equals("Zero")) {

            if (actualIterator.toString().equals("Movie")) {
                actualIterator = musiciterator;
            } else if (actualIterator.toString().equals("Music")) {
                actualIterator = movieIterator;
            }
        } else {
            if (actualIterator.toString().equals("Music")) {
                Music music = (Music) actualIterator.before();
                System.out.println(music.getSongname());
            } else {
                Movie movie = (Movie) actualIterator.before();
                System.out.println(movie.getMoviename());
            }


        }

    }

    public void stop() {
        if (entertainementSystemState.getState().toString().equals("One")) {
            entertainementSystemState.promote();
            musiciterator.reset();
            movieIterator.reset();
        }

    }


}
