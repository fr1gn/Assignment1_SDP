package management;

public class CinemaConfig {
    private String name;
    private static CinemaConfig instance;
    private CinemaConfig() {}

    public static CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }
    public String getCinemaName() {
        return name;
    }
    public void setCinemaName(String name) {
        this.name = name;
    }

}
