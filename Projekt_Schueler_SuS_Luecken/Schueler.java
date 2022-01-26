
public class Schueler
{
    // Attribute
    private String zName;
    private String zTelNr;
    private int zGebJahr;

    // mehrere Konstruktoren als Beispiel für ___________________________!!! 
    public Schueler(String pName, int pGebJahr)
    {
       zName = pName;
       zGebJahr = pGebJahr;
    }

    public Schueler(String pName, int pGebJahr,String pTelNr)
    {
       zName = pName;
       zGebJahr = pGebJahr;
       zTelNr = pTelNr;
    }

    // Dienste

    public String getName()
    {
        return zName;
    }
    
    public void setName(String pName)
    {
        zName = pName;
    }
    
    public String getTelNr()
    {
        return zTelNr;
    }
    
    public void setTelNr(String pTelNr)
    {
        zTelNr = pTelNr;
    }
    
    public int getGebJahr()
    {
        return zGebJahr;
    }
    
    public void setGebJahr(int pGebJahr)
    {
        zGebJahr = pGebJahr;
    }
    
}
