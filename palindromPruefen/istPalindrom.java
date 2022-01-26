public class istPalindrom
{
    public istPalindrom()
    {
    }

    public boolean palindromPruefen(String pEingabe)
    {
        String lEingabe = this.removeSpaces(pEingabe);
        Stack<Character> hatPalindromStack = new Stack<Character>();
        char[] eingabe = lEingabe.toCharArray();
        
        for(int i = 0; i<lEingabe.length(); i++)
        {
            hatPalindromStack.push(eingabe[i]);
        }
        
        for(int i = 0; i<lEingabe.length(); i++)
        {
            if(hatPalindromStack.top() != eingabe[i])
            {
                return false;
            }
            hatPalindromStack.pop();
        }
        
        return true;
    }
    
    public String removeSpaces(String pText)
    {
        String ausgabe = "";
        for(int i = 0; i<pText.length(); i++)
        {
            if(pText.charAt(i) != ' ')
            {
                ausgabe = ausgabe + pText.charAt(i);
            }
        }
        return ausgabe;
    }
}
