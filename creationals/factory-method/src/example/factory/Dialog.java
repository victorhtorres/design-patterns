package example.factory;

import example.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog
{
    public void renderWindow()
    {
        // some code...
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
