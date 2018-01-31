package iterator;

public class MovieDatabaseIterator implements IIterator {
    private MovieDatabase movieDatabase;
    private int index;

    public MovieDatabaseIterator (MovieDatabase movieDatabase){
        this.movieDatabase = movieDatabase;
        this.index = 0;
    }

    @Override
    public void reset(){
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < movieDatabase.getSize();
    }

    @Override
    public Object next() {
        if (!hasNext()) reset();
        Movie movie = movieDatabase.getMovieAt(index);
        index++;
        return movie;
    }

    @Override
    public Object before() {
        if (index > 0) index--;
        else index = movieDatabase.getSize()-1;
        Movie movie = movieDatabase.getMovieAt(index);
        return movie;
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
