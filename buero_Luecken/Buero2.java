

public class Buero2
{
    private Queue<Person> warteSchlange;
    
    public Buero2()
    {
        warteSchlange = new Queue<Person>();
    }

    public void hintenAnstellen(Person pPerson)
    {
        warteSchlange.enqueue(pPerson);
    }
    
    public void einlassen()
    {
        warteSchlange.dequeue();
    }
    
    public void sprechstundeBeenden()
    {
        while(!warteSchlange.isEmpty())
        {
            warteSchlange.dequeue();
        }
    }
    
    //erweitert!!
    
    public String nameErster()
    {
       if(!warteSchlange.isEmpty())
       {
           Person erster = warteSchlange.front();
           return erster.gibName();
       }
       
       else
       {
           return "!leer!";
       }
    }
       
    public boolean leer()
    {
        if(warteSchlange.isEmpty())
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public boolean nachgucken(Person pPerson)
    {
        boolean anwesend = false;
        Queue<Person> hWarteSchlange;
        hWarteSchlange = new Queue<Person>();
        
        while(!warteSchlange.isEmpty())
        {
            if(warteSchlange.front().gibName().equals(pPerson.gibName()))
            {
                anwesend = true;
            }
            
            hWarteSchlange.enqueue(warteSchlange.front());
            warteSchlange.dequeue();
        }
        
        while(!hWarteSchlange.isEmpty())
        {
            warteSchlange.enqueue(hWarteSchlange.front());
            hWarteSchlange.dequeue();
        }
        
        return anwesend;
    }
}
