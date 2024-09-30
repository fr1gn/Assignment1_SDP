package management;

import management.abstracts.MovieFactory;
import management.interfaces.Movie;

public class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
