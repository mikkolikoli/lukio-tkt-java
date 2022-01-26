import java.io.Serializable;

public class Informatiker implements ComparableContent <Informatiker> 
{
    private int zGebJahr;
    private String zVorname;
    private String zNachname;
    private String zBesonderheit;

    
    public Informatiker(int pGebJahr, String pVor, String pNach, String pBeson)
    {
        zGebJahr = pGebJahr;
        zVorname = pVor;
        zNachname = pNach;
        zBesonderheit = pBeson;
    }

     public Informatiker( String pNach)
    {
        zGebJahr = 0;
        zVorname = "noch ohne";
        zNachname = pNach;
        zBesonderheit = "noch ohne";
    }
     public String getNachname()
     {
         return zNachname;
        }
   
    public String getVorname()
     {
         return zVorname;
        }
   
    public String getBesonderheit()
     {
         return zBesonderheit;
        }
   
    public int getGebJahr()
     {
         return zGebJahr;
        }
   
    
     public boolean isLess(Informatiker pContent)
     {
         String pName = pContent.getNachname();
         return zNachname.compareTo(pName)<0;
        }
        
     public boolean isGreater(Informatiker pContent)
     {
         String pName = pContent.getNachname();
         return zNachname.compareTo(pName)>0;
        }
        
     public boolean isEqual(Informatiker pContent)
     {
         String pName = pContent.getNachname();
         return zNachname.compareTo(pName)== 0;
       }
        
        
}
