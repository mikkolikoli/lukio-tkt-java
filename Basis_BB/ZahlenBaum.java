 // AA1 Skizziere den Baum, wie er nach der Erzeugung aussieht. Auf
//     welches Objekt zeigt aktuellerBaum?

// AA 2 Skizziere das Implementationsdiagramm der Klassen Zahl und Zahlenbaum

// AA 3 Skizziere das Implementationsdiagramm für die Beziehung zwischen 
//      den Klassen Zahl, Zahlenbaum und Binary Tree

// AA 4 Implementiere die Methoden 
//        public void rechtsSetzen(int pWert)
//         public void nachLinks()
//        public void nachRechts() 
//         public void zurWurzel() 
//        ... (ggf.!?
//        und teste die Anwendung!
/**
 * Beschreiben Sie hier die Klasse ZahlenBaum.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 * 
 * Alle Elemente vom Typ Integer
 */
public class ZahlenBaum
{
    BinaryTree<Zahl> hatBaum;
    BinaryTree<Zahl> aktuellerBaum;
    private int anzahl;

    /**
     * Konstruktor fÃ¼r Objekte der Klasse ZahlenBaum
     */
    public ZahlenBaum()
    {
       Zahl zahl1 = new Zahl(12);
       hatBaum = new BinaryTree<Zahl>(zahl1);
       Zahl zahl2 = new Zahl(7);
       BinaryTree<Zahl> neu1 = new BinaryTree<Zahl>(zahl2);
       Zahl zahl3 = new Zahl(6);
       BinaryTree<Zahl> neu2 = new BinaryTree<Zahl>(zahl3);
       Zahl zahl4 = new Zahl(152);
       BinaryTree<Zahl> neu3 = new BinaryTree<Zahl>(zahl4,neu2,neu1);
       hatBaum.setRightTree(neu3);
       Zahl zahl5 = new Zahl(416);
       BinaryTree<Zahl> neu4 = new BinaryTree<Zahl>(zahl5);
       hatBaum.setLeftTree(neu4);
       Zahl zahl6 = new Zahl(22);
       BinaryTree<Zahl> neu5 = new BinaryTree<Zahl>(zahl6);
       aktuellerBaum = hatBaum;
       aktuellerBaum = aktuellerBaum.getLeftTree();
       aktuellerBaum.setRightTree(neu5);
       
       aktuellerBaum = hatBaum;
    }

    
    public void setzeZahlLinks(int pWert)
    {
        Zahl lZahl = new Zahl(pWert);
        BinaryTree<Zahl> neu = new BinaryTree<Zahl>(lZahl);       
        aktuellerBaum.setLeftTree(neu);
    }
    
    public void setzeZahlRechts(int pWert)
    {
        Zahl lZahl = new Zahl(pWert);
        BinaryTree<Zahl> neu = new BinaryTree<Zahl>(lZahl);
        aktuellerBaum.setRightTree(neu);
    }
    
    public int gibWert()
    {
        if(!aktuellerBaum.isEmpty())
        { 
            Zahl lZahl =  aktuellerBaum.getContent();
            int lWert = lZahl.gibWert();
            return lWert;
        }
        else
        {
            return -1;
        }
        
    }
    
    public void zurWurzel()
    {
        aktuellerBaum = hatBaum;
    }
    
    public void geheInDenLinkenTB()
    {
        if(!aktuellerBaum.getLeftTree().isEmpty())
        {
            aktuellerBaum = aktuellerBaum.getLeftTree();
        }
    }
    
     public void geheInDenRechtenTB()
    {
        if(!aktuellerBaum.getRightTree().isEmpty())
        {
            aktuellerBaum = aktuellerBaum.getRightTree();
        }
    }
    
    public String gibAusgabePreorder()
    {
        return alleWertePreorder(hatBaum);
    }
    
    private String alleWertePreorder(BinaryTree<Zahl> pBB)
    {
        String ausgabe = pBB.getContent() + ", ";
        if(!pBB.getLeftTree().isEmpty())
        {
            ausgabe = ausgabe + alleWertePreorder(pBB.getLeftTree()) + ", ";
        }
        if(!pBB.getRightTree().isEmpty())
        {
            ausgabe = ausgabe + alleWertePreorder(pBB.getRightTree()) + ", ";
        }
        return ausgabe;
    }
    
    public String gibAusgabeIneorder()
    {
        return alleWerteInorder(hatBaum);
    }
    
    private String alleWerteInorder(BinaryTree<Zahl> pBB)
    {
        String ausgabe = "";
        if(!pBB.getLeftTree().isEmpty())
        {
            ausgabe = ausgabe + alleWerteInorder(pBB.getLeftTree()) + ", ";
        }
        ausgabe = ausgabe + pBB.getContent() + ", ";
        if(!pBB.getRightTree().isEmpty())
        {
            ausgabe = ausgabe + alleWerteInorder(pBB.getRightTree()) + ", ";
        }
        return ausgabe;
    }
    
    public String gibAusgabePosteorder()
    {
        return alleWertePostorder(hatBaum);
    }
    
    private String alleWertePostorder(BinaryTree<Zahl> pBB)
    {
        String ausgabe = "";
        if(!pBB.getLeftTree().isEmpty())
        {
            ausgabe = ausgabe + alleWertePostorder(pBB.getLeftTree()) + ", ";
        }
        if(!pBB.getRightTree().isEmpty())
        {
            ausgabe = ausgabe + alleWertePostorder(pBB.getRightTree()) + ", ";
        }
        ausgabe = ausgabe + pBB.getContent() + ", ";
        return ausgabe;
    }
    
    public int wieOft(int pZahl)
    {
        anzahl = 0;
        return wieOftKommtVor(hatBaum, pZahl);
    }
    
    private int wieOftKommtVor(BinaryTree<Zahl> pBB, int pZahl)
    {
        return anzahl;
    }
       
    public int summenwert()
    {
        return -1;
    }
    
    public String nochZuTun()
    {
        return "fehlt noch!";
    }
}
