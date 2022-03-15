package example;

import example.buttons.Button;
import example.checkbox.Checkbox;
import example.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application
{
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory)
    {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint()
    {
        button.paint();
        checkbox.paint();
    }
}
