package management.abstracts;

import management.interfaces.Movie;

public abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}
