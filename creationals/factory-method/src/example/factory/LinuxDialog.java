package example.factory;

import example.buttons.Button;
import example.buttons.LinuxButton;

public class LinuxDialog extends Dialog
{
    @Override
    protected Button createButton() {
        return new LinuxButton();
    }
}
