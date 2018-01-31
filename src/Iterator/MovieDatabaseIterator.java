package Iterator;

public class MovieDatabaseIterator implements IIterator {
    private MovieDatabase movieDatabase;
    private int index;

    public MovieDatabaseIterator (MovieDatabase movieDatabase){
        this.movieDatabase = movieDatabase;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < movieDatabase.getSize();
    }

    @Override
    public Object next() {
        Movie movie = movieDatabase.getMovieAt(index);
        index++;
        return movie;
    }
}
