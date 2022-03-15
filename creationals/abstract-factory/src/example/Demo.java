package example;

import example.factories.GUIFactory;
import example.factories.MacOSFactory;
import example.factories.WindowsFactory;

public class Demo
{
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication()
    {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if ( osName.contains( "mac" ) )
        {
            factory = new MacOSFactory();
        } else
        {
            factory = new WindowsFactory();
        }
        application = new Application(factory);

        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
