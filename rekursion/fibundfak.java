
public class fibundfak
{
    public fibundfak()
    {
    }

    public int fib(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public int fak(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        
        else
        {
            return fak(n - 1) * n;
        }
    }
}
