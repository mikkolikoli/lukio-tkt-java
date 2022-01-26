import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class SuMApplet extends Applet
{
    public SuMApplet()
    {
        Notfall_Ambulanz hatPraxisanwendung = new Notfall_Ambulanz();
        hatPraxisanwendung.fuehreAus();
    }
}
