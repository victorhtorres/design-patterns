package example.factories;

import example.buttons.Button;
import example.buttons.MacOsButton;
import example.checkbox.Checkbox;
import example.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory
{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
