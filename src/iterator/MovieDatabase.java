package iterator;

public class MovieDatabase implements IAggregate {
    private Movie[] movies;
    private int maximumindex = 0;

    public MovieDatabase (int maximumSize){
        movies = new Movie[maximumSize];
    }

    public Movie getMovieAt(int index){
        return movies[index];
    }

    public void addMovie(Movie movie){
        movies[maximumindex] = movie;
        maximumindex++;
    }

    public int getSize(){
        return movies.length;
    }


    @Override
    public IIterator iterator() {
        return new MovieDatabaseIterator(this);
    }
}
