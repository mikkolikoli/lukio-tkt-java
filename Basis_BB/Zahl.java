
/**
 * Beschreiben Sie hier die Klasse Zahl.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zahl
{
     private int zWert;

    /**
     * Konstruktor für Objekte der Klasse Zahl
     */
    public Zahl(int pWert)
    {
        zWert = pWert;
    }

      public int gibWert()
    {
        return zWert;
    }
    
    public void aendereWert(int pWert)
    {
        zWert = pWert;
    }
}
