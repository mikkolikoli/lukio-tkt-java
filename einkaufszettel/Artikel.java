public class Artikel
{
    private String name;
    private double maxPreis;
    private int anzahl;
    
    public Artikel(String pName)
    {
        name = pName;
        maxPreis = 10000;
        anzahl = 1;
    }

    public Artikel(String pName, double pMaxPreis, int pAnzahl)
    {
        name = pName;
        maxPreis = pMaxPreis;
        anzahl = pAnzahl;
    }
    
    public String gibName()
    {
        return name;
    }
    
    public double gibMaxPreis()
    {
        return maxPreis;
    }
    
    public int gibAnzahl()
    {
        return anzahl;
    }
}
