package example;

import example.buttons.LinuxButton;
import example.factory.Dialog;
import example.factory.HtmlDialog;
import example.factory.LinuxDialog;
import example.factory.WindowsDialog;

public class Demo
{
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    private static void configure()
    {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new LinuxDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    private static void runBusinessLogic()
    {
        dialog.renderWindow();
    }
}
