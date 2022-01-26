
public class zaehlList<ContentType> extends List<ContentType>
{
    private int length;
    
    public zaehlList()
    {
        super();
        length = 0;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void append(ContentType pContent)
    {
        super.append(pContent);
        length++;
    }
    
    public void insert(ContentType pContent)
    {
        super.insert(pContent);
        length++;
    }
    
    public void concat(zaehlList pList)
    {
        super.concat(pList);
        length = length + pList.getLength();
    }
    
    public String[] toStringArray()
    {
        String[] array = new String[length];
        int i = 0;
        
        if(!this.isEmpty())
        {
            this.toFirst();
            while(this.hasAccess())
            {
                array[i] = (String)this.getContent();
                next();
                i++;
            }
        }
        return array;
    }
}
