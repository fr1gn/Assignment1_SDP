package management;

import management.interfaces.Movie;
import management.interfaces.MovieSchedule;

public class StandardSchedule implements MovieSchedule {
    private String time;
    private Movie movie;

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setTime(String time) { this.time = time; }
    public void setMovie(Movie movie) { this.movie = movie; }
}
