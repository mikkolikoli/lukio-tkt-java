
/**
 * @author 
 * @version 
 */
public class PrioQueue<ContentType extends PrioObject<ContentType>> extends Queue<ContentType>
{
  
    // Konstruktor
    public PrioQueue()
    {
       super();
    }

    // Dienste
    public void prioEnqueue (ContentType pPrio)//(PrioObject pPrio)
    {
        Queue<ContentType> hilfsQueue = new Queue<ContentType>();
        boolean eingefuegt = false;
        while(!this.isEmpty())
        {
            ContentType lPrio = this.front();  // PrioObject!?
            if(!eingefuegt)
            {                
                if(pPrio.istKleinerAls(lPrio))
                {
                    hilfsQueue.enqueue(pPrio);
                    eingefuegt = true;
                }                
            }
            this.dequeue();
            hilfsQueue.enqueue(lPrio);
        }       
        if(!eingefuegt)
            {                
                hilfsQueue.enqueue(pPrio);               
            }       
        while(!hilfsQueue.isEmpty())
        {
            ContentType lPrio = (ContentType)hilfsQueue.front();
            this.enqueue(lPrio);
            hilfsQueue.dequeue();
        }       
    }
}
