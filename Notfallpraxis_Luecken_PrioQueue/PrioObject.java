
/**
 * speziell abstract 
 * deshalb SCHLÜSSELWORT interface statt abstract
 * abstrakte Klasse, auf die in der PrioQueue zugeriffen werden kann
 * muss in Beziehung zu jeder Klasse stehen, die in einer PrioQueue 
 * verwaltet werden soll  SCHLÜSSELWORT: implements (statt extends)
 */
public interface PrioObject<ContentType>
{
    // abstrakte Dienste
    
    public boolean istGroesserAls(ContentType pPrioObject);
    
    public boolean istKleinerAls(ContentType pPrioObject);
    
    public boolean istGleichWie(ContentType pPrioObject);
    
   
}
