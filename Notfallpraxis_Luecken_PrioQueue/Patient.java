
/**
 * um in einer PrioQueue verwaltet werden zu können, müssen
 * die 3 abstrakten Dienste des Interfaces PrioObject überschrieben werden
 * deshalb implements PrioObject
 */

public class Patient implements PrioObject <Patient>  
{
    // Bezugsobjekte
    private Patient kenntNachfolger;

    // Attribute
    private String zName;
    private int zStatus;

    // Konstruktor
    public Patient(String pName,int pStatus)
    {
        zName = pName;
        zStatus = pStatus;
     }

    // Dienste
    public String name()
    {
        return zName;
    }
    
    public int gibStatus()
    {
        return zStatus;
    }  
    
     public boolean istGroesserAls(Patient pPrioObject)
     {
         Patient lPatient;
         
         lPatient = (Patient)pPrioObject;
         
         return this.gibStatus()>lPatient.gibStatus();
        }
    
    public boolean istKleinerAls(Patient pPrioObject)
    {
         Patient lPatient;
         
         lPatient = (Patient)pPrioObject;
         
         return this.gibStatus() < lPatient.gibStatus();
      }
    
    public boolean istGleichWie(Patient pPrioObject)
    {
         Patient lPatient;
         
         lPatient = (Patient)pPrioObject;
         
         return this.gibStatus()==lPatient.gibStatus();
      }
    
    
  }
