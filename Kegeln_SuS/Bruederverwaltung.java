import sum.werkzeuge.*;

public class Bruederverwaltung
{
    private Queue<Wurf>[] feld; //indeed
    private Rechner hatRechner;
    
    //You just never quit, do you? Took out Ghaul, woke up the Traveller, and now half of what I hear is how much you and your clan are making a difference. This is why I started this whole clan thing in the beginning. People are waiting for the vanguard to lead the way, but it's time for a change. And Guardians like you are making it happen.
    //Whether we wanted it or not, we've stepped into a war with the Cabal on Mars. So let's get to taking out their command, one by one. Valus Ta'aurc. From what I can gather, he commands the Siege Dancers from an Imperial Land Tank just outside of Rubicon. He's well protected, but with the right team, we can punch through those defenses, take this beast out, and break their grip on Freehold.
    public Bruederverwaltung(int pAnzahl)
    {
      feld = new Queue[pAnzahl];
      hatRechner = new Rechner();
      
      for (int i=0; i<pAnzahl;i++)
       {
        feld [i] = new Queue<Wurf>();
       }
      
    }

    public int gibAnzahl(int pBruder)
    {
        int anzahl = 0;
        
        Queue<Wurf> hilf = new Queue<Wurf>();
        Wurf lWurf;
        
        while(!feld[pBruder].isEmpty())
        {
            lWurf = feld[pBruder].front();
            anzahl++;
            hilf.enqueue(lWurf);
            feld[pBruder].dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            feld[pBruder].enqueue(lWurf);
            hilf.dequeue();
        }
        
        return anzahl;
        
    }
    
    public double gibGesamtWert(int pBruder)
    {
        int gesamt = 0;
        
        Queue<Wurf> hilf = new Queue<Wurf>();
        Wurf lWurf;
        
        while(!feld[pBruder].isEmpty())
        {
            lWurf = feld[pBruder].front();
            gesamt = gesamt +lWurf.gibAnzahl();
            hilf.enqueue(lWurf);
            feld[pBruder].dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            feld[pBruder].enqueue(lWurf);
            hilf.dequeue();
        }
        
        return gesamt;
        
    }
    
    public double gibDurchschnitt(int pBruder)
    {
        
        return gibGesamtWert(pBruder)/gibAnzahl(pBruder);
    }
    
    public void addWurf(int pBruder, int pAnzahl)
    {
        Wurf lWurf;
        lWurf = new Wurf(pAnzahl);
        feld[pBruder].enqueue(lWurf);
    }
    
    public int besterWurf(int pBruder)
    {
        Queue<Wurf> hilf = new Queue<Wurf>();
        Wurf lWurf;
        int best = 0;
        
        while(!feld[pBruder].isEmpty())
        {
            if(feld[pBruder].front().gibAnzahl() > best)
            {
                best = feld[pBruder].front().gibAnzahl();
            }
            lWurf = feld[pBruder].front();
            hilf.enqueue(lWurf);
            feld[pBruder].dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            feld[pBruder].enqueue(lWurf);
            hilf.dequeue();
        }
        
        return best;
    }
    
    public int verbesserung(int pBruder)
    {
        int start = feld[pBruder].front().gibAnzahl();
        int ende = 0;
        Queue<Wurf> hilf = new Queue<Wurf>();
        Wurf lWurf;
        
        while(!feld[pBruder].isEmpty())
        {
            ende = feld[pBruder].front().gibAnzahl();
            lWurf = feld[pBruder].front();
            hilf.enqueue(lWurf);
            feld[pBruder].dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            feld[pBruder].enqueue(lWurf);
            hilf.dequeue();
        }
        
        return ende - start;
    }
    
    public String alleWuerfe(int pBruder)
    {
        String ausgabe = "";
        Wurf lWurf;
        Queue<Wurf> hilf = new Queue<Wurf>();
        
        while(!feld[pBruder].isEmpty())
        {
            ausgabe = feld[pBruder].front().gibAnzahl() + ", ";
            lWurf = feld[pBruder].front();
            hilf.enqueue(lWurf);
            feld[pBruder].dequeue();
        }
        
        while(!hilf.isEmpty())
        {
            lWurf = hilf.front();
            feld[pBruder].enqueue(lWurf);
            hilf.dequeue();
        }
        
        return ausgabe;
    }
}