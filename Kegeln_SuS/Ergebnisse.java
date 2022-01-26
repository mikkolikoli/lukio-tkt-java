

public class Ergebnisse
{
    private Queue<Wurf> ergebnisse;
    private int anzahl = 0;
    
    public Ergebnisse()
    {
       ergebnisse = new Queue<Wurf>();
      
    }

    public void neuerWurf(Wurf pWurf)
    {
        ergebnisse.enqueue(pWurf);
        anzahl++;
    }
    
    public Wurf gibErstesErgebnis()
    {
        return ergebnisse.front();
    }
    
    public int gibAnzahl()
    {
        return anzahl;
    }
    
    public int gibGesamt()
    {
        int gesamt = 0;
        
        Queue<Wurf> hilf = new Queue<Wurf>();
        Wurf lWurf;
        
        while(!ergebnisse.isEmpty())
        {
            lWurf = ergebnisse.front();
            gesamt = gesamt +lWurf.gibAnzahl();
            hilf.enqueue(lWurf);
            ergebnisse.dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            ergebnisse.enqueue(lWurf);
            hilf.dequeue();
        }
        
        return gesamt;
    }
    
    public double gibDurchschnitt()
    {
        return gibGesamt()/gibAnzahl();
    }
    
    
    
}
