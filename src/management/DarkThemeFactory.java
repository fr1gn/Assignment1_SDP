package management;

import management.interfaces.Button;
import management.interfaces.UIFactory;

public class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}
