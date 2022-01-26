
/**
 * @author 
 * @version 
 */
public class Antragsverwaltung
{
    private PrioStack<Antrag> hatAktuellenStack;
    private Stack<Antrag> tagesStack;
    
    public Antragsverwaltung()
    {
       hatAktuellenStack = new PrioStack<Antrag> ();
       tagesStack = new  Stack <Antrag>();
       
      Antrag lAntrag1 = new Antrag("Adam", 4);
       tagesStack.push(lAntrag1);
       Antrag lAntrag2 = new Antrag("Berta", 1);
       tagesStack.push(lAntrag2);
       Antrag lAntrag3 = new Antrag("Caesar", 1);
       tagesStack.push(lAntrag3);
       Antrag lAntrag4 = new Antrag("Doris", 3);
       tagesStack.push(lAntrag4);
       Antrag lAntrag5 = new Antrag("Emil", 4);
       tagesStack.push(lAntrag5);
       
       this.arbeiteAlleNeuenEin();
    }
    
    public void init()
    {
       //hatAktuellenStack = new PrioStack<Antrag> ();
       //tagesStack = new  Stack <Antrag>();
       
       Antrag lAntrag1 = new Antrag("Adam", 4);
       tagesStack.push(lAntrag1);
       Antrag lAntrag2 = new Antrag("Berta", 1);
       tagesStack.push(lAntrag2);
       Antrag lAntrag3 = new Antrag("Caesar", 1);
       tagesStack.push(lAntrag3);
       Antrag lAntrag4 = new Antrag("Doris", 3);
       tagesStack.push(lAntrag4);
       Antrag lAntrag5 = new Antrag("Emil", 4);
       tagesStack.push(lAntrag5);
       
       this.arbeiteAlleNeuenEin();
    }

    public void neuerAntrag(Antrag pAntrag)
    {
        tagesStack.push(pAntrag);
    }
    
    public Antrag gibOberstenAntrag()
    {
       return hatAktuellenStack.top(); 
    }
    
    public void entferneOberstenAntrag()
    {
       hatAktuellenStack.pop(); 
    }
    
    public void arbeiteAlleNeuenEin()
    {
        while(!tagesStack.isEmpty())
        {
            Antrag lAntrag = tagesStack.top();
            hatAktuellenStack.prioPush(lAntrag);
            tagesStack.pop();
        }
    }
}
