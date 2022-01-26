
/**
 * @author 
 * @version 
 */
public class Antrag implements ComparableContent<Antrag>
{
    String zName;
    int zPrio;
    
    public Antrag(String pName, int pPrio)
    {
       zName = pName;
       zPrio = pPrio;
    }

    public String gibName()
    {
      return zName;   
    }
    public int gibPrio()
    {
      return zPrio;   
    }
    
     public boolean istGroesserAls(Antrag pPrioObjekt)
     {
         return (zPrio > pPrioObjekt.gibPrio());
        }
    
    public boolean istKleinerAls(Antrag pPrioObjekt)
    {
         return (zPrio <pPrioObjekt.gibPrio());
        }
    
    public boolean istGleichWie(Antrag pPrioObjekt)
    {
         return (zPrio == pPrioObjekt.gibPrio());
        }
    

}
