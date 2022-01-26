
/**
 * Beschreiben Sie hier die Klasse textwerkzeug.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class text
{
    /**
     * Konstruktor für Objekte der Klasse textwerkzeug
     */
    public text()
    {
    }
    
    public boolean istPalindrom(String pText)
    {
        if(pText.length() > 0)
        {
            if(pText.charAt(0) == pText.charAt(pText.length() - 1))
            {
                if(pText.length() >= 2)
                {
                    this.istPalindrom(pText.substring(1,pText.length() - 1));
                }
            }
            
            else
            {
                return false;
            }
        }
        
        return true;
    }
    
    public String dreheUm(String pText)
    {
        while(pText.length() > 0)
        {
            return pText.substring(pText.length() -1, pText.length()) + this.dreheUm(pText.substring(0, pText.length() -1));
        }
        
        return "";
    }
}
