

public class Informatikerbaum
{
    BinarySearchTree<Informatiker> hSuchbaum;
    
    
    public Informatikerbaum()
    {
       hSuchbaum = new BinarySearchTree<Informatiker>();
    }
    
    public void rein(Informatiker pInformatiker)
    {
        hSuchbaum.insert(pInformatiker);
    }
    
    public void raus(Informatiker pInformatiker)
    {
        hSuchbaum.remove(pInformatiker);
    }
    
    public boolean suchen(Informatiker pInformatiker)
    {
       if( !(hSuchbaum.search(pInformatiker)==null))
       {
        return true;
       }
       else
       {return false;
        }
    }
    
    public Informatiker gibWurzel()
    {
        if (!hSuchbaum.isEmpty())
        { Informatiker lInformatiker = hSuchbaum.getContent();
          return lInformatiker;}
        else
         {return null;}
    }
    
    private String kleinGross(BinarySearchTree<Informatiker> pBaum)
    {
        String rueck = "";
        if (!pBaum.isEmpty())
        {   Informatiker lInformatiker = pBaum.getContent();
            String lWert = lInformatiker.getNachname();
            rueck = kleinGross(pBaum.getLeftTree()) + " " 
                    + lWert + " " 
                    + kleinGross(pBaum.getRightTree());
        }
        return rueck;
        
    }
     private String was(BinarySearchTree<Informatiker> pBaum)
    {
        String rueck = "";
        if (!pBaum.isEmpty())
        {   Informatiker lInformatiker = pBaum.getContent();
            String lWert = lInformatiker.getNachname();
            rueck = was(pBaum.getLeftTree()) + " " 
                    + lWert + " " 
                    + was(pBaum.getRightTree());
        }
        return rueck;
        
    }
    
    public String alleKleinGross()
    {
        String ausgabe = was(hSuchbaum);
        return ausgabe;
    }
    
    private String grossKlein(BinarySearchTree<Informatiker> pBaum)
    {
        String rueck = "";
        if (!pBaum.isEmpty())
        {
            Informatiker lInformatiker = pBaum.getContent();
            String lWert = lInformatiker.getNachname();
            rueck = grossKlein(pBaum.getRightTree()) + " " 
                    + lWert + " " 
                    + grossKlein(pBaum.getLeftTree());
        }
        return rueck;
        
    }
    
    public String alleGrossKlein()
    {
        String ausgabe = grossKlein(hSuchbaum);
        return ausgabe;
    }
    
    
    
    
     private int anInformatiker(BinarySearchTree<Informatiker> pBaum)
    {
        int sWert = 0;
        if (!pBaum.isEmpty())
        {
            sWert = anInformatiker(pBaum.getLeftTree())  
                    + 1 
                    + anInformatiker(pBaum.getRightTree());
        }
        return sWert;
    }
    
        
    public Informatiker kleinster()
    {
        BinarySearchTree<Informatiker> pBaum = hSuchbaum;
        Informatiker kleinsteInformatiker;
        if(pBaum.isEmpty())
        {kleinsteInformatiker = null;
        }
        else
          if (pBaum.getLeftTree().isEmpty())
          {
              kleinsteInformatiker=(Informatiker)pBaum.getContent();
            }
            else
             {
                while (!pBaum.getLeftTree().isEmpty())
                 {
                   pBaum = pBaum.getLeftTree();
                 }
                kleinsteInformatiker=(Informatiker)pBaum.getContent();
            }  
        return kleinsteInformatiker;
    }
    
    public Informatiker groesster()
    {
        BinarySearchTree<Informatiker> pBaum = hSuchbaum;
        Informatiker groessteInformatiker;
        if(pBaum.isEmpty())
        {groessteInformatiker = null;
        }
        else
          if (pBaum.getRightTree().isEmpty())
          {
              groessteInformatiker=(Informatiker)pBaum.getContent();
            }
            else
             {
                while (!pBaum.getRightTree().isEmpty())
                 {
                   pBaum = pBaum.getRightTree();
                 }
                groessteInformatiker=(Informatiker)pBaum.getContent();
            }  
        return groessteInformatiker;
    }
    
    public List vorGeborenRek(BinarySearchTree<Informatiker> pBST, int pGeb)
    {
        List informatikerList = new List<Informatiker>();
        if(!pBST.getLeftTree().isEmpty())
        {
            informatikerList.concat(vorGeborenRek(pBST.getLeftTree(), pGeb));
        }
        if(pBST.getContent().getGebJahr() <= pGeb)
        {
            informatikerList.append(pBST.getContent());
            if(!pBST.getRightTree().isEmpty())
            {
                informatikerList.concat(vorGeborenRek(pBST.getRightTree(), pGeb));
            }
        }
        return informatikerList;
    }

    public List vorGeboren(int pGeb)
    {
        return vorGeborenRek(hSuchbaum, pGeb);
    }
}
