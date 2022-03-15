package example.buttons;

public class LinuxButton implements Button
{

    @Override
    public void render() {
        System.out.println("Render button for Linux");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
