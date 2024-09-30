package management.interfaces;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setTime(String time);
    void setMovie(Movie movie);
}
