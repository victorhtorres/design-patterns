package example.factories;

import example.buttons.Button;
import example.checkbox.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory
{
    Button createButton();
    Checkbox createCheckbox();
}
