
/**
 * Beschreiben Sie hier die Klasse Anwendung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Anwendung
{
    private int[] zahlen;
    private int[] primzahlen;
    private boolean istPrimzahl;
    
    public Anwendung()
    {
        zahlen = new int[50];
        primzahlen = new int[50];
        primzahlen[0] = 2;
        istPrimzahl = true;
    }
    
    public void alg()
    {
        for(int lauf = 0; lauf < zahlen.length; lauf++)
        {
            zahlen[lauf] = lauf+1;
        }
        
        for(int i = 1; i < zahlen.length; i++)
        {
            for(int h = 0; h <= i; h++)
            {
                if(primzahlen[h] != 0)
                {
                    if(zahlen[i]%primzahlen[h] == 0)
                    {
                        istPrimzahl = false;
                    }
                }
            }
            
            if(istPrimzahl == true)
            {
                primzahlen[i] = zahlen[i];
            }
        }
        ausgabe();
    }
    
    public void ausgabe()
    {
        for(int i=0; i<primzahlen.length; i++)
        {
            System.out.println(primzahlen[i]);
        }
    }
}
