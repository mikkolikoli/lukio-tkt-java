
/**
 * @author 
 * @version 
 */
public class PrioStack<ContentType extends ComparableContent<ContentType>> extends Stack<ContentType>
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public PrioStack()
    {
        super();

    }

    public void prioPush(ContentType pContent)
    {
        Stack<ContentType> hilfsStack = new Stack<ContentType>();
        if (this.isEmpty())
          {
              this.push(pContent);
            }
          else
            {
                while(!(this.isEmpty()) && (this.top().istGroesserAls(pContent)))
                  {
                      ContentType lContent = this.top();
                      hilfsStack.push(lContent);
                      this.pop();
                    }
                 this.push(pContent);
                while(!hilfsStack.isEmpty())
                  {
                      ContentType lContent =  hilfsStack.top();
                      this.push(lContent);
                      hilfsStack.pop();
                    } 
                 
            }
    }

}
