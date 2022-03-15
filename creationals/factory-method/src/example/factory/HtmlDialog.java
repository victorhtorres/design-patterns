package example.factory;

import example.buttons.Button;
import example.buttons.HtmlButton;

public class HtmlDialog extends Dialog
{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
