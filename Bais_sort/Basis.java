/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 31.8.2012
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;
import java.util.Random;

public class Basis extends EBAnwendung
{
    // Objekte
    private int n=10;
    
    private Etikett hatEtikettTestprogsortieren;
    private Knopf hatKnopfInitialisierung;
    private Knopf hatKnopfAusgabeaufzeilenbereich;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfSortierenInsertion;
    private Knopf hatKnopfSortierenSelection;
    private Knopf hatKnopfSortierenBubble;
    private Rechner hatRechner;
    private Random r = new Random();
    private int[] zahlenfeld= new int[n];
    // Attribute

/**
 * Konstruktor
 */
    public Basis()
    {
        //Initialisierung der Oberklasse
        super(811, 679);

        hatEtikettTestprogsortieren = new Etikett(258, 67, 100, 25, "TestProgSortieren");
        // Ausrichtung
        hatEtikettTestprogsortieren.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfInitialisierung = new Knopf(80, 157, 100, 25, "Initialisierung");
        hatKnopfInitialisierung.setzeBearbeiterGeklickt("hatKnopfInitialisierungGeklickt");
        hatKnopfAusgabeaufzeilenbereich = new Knopf(82, 229, 100, 25, "AusgabeAufZeilenbereich");
        hatKnopfAusgabeaufzeilenbereich.setzeBearbeiterGeklickt("hatKnopfAusgabeaufzeilenbereichGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(164, 302, 103, 240, "");
        hatKnopfSortierenInsertion = new Knopf(227, 230, 100, 25, "SortierenInsertion");
        hatKnopfSortierenInsertion.setzeBearbeiterGeklickt("hatKnopfSortierenInsertionGeklickt");
        hatKnopfSortierenSelection = new Knopf(357, 230, 100, 25, "SortierenSelection");
        hatKnopfSortierenSelection.setzeBearbeiterGeklickt("hatKnopfSortierenSelectionGeklickt");
        hatKnopfSortierenBubble = new Knopf(487, 230, 100, 25, "SortierenBubble");
        hatKnopfSortierenBubble.setzeBearbeiterGeklickt("hatKnopfSortierenBubbleGeklickt");
        hatRechner = new Rechner();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfInitialisierung fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfInitialisierungGeklickt()
    {  int lauf;
        
        for(lauf = 0;lauf<n;lauf++)
        {
            zahlenfeld[lauf] = r.nextInt(100);
        }
        
       ausgabe();
        
        
        
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAusgabeaufzeilenbereich fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAusgabeaufzeilenbereichGeklickt()
    {  int lauf;
        
       hatZeilenbereich1.loescheAlles(); 
       for(lauf=0;lauf<10;lauf++) // n=10!!!!
       { 
        hatZeilenbereich1.haengeAn(lauf + " " + zahlenfeld[lauf]);
       }
    }
    
    public void ausgabe()
    {  int lauf;
        
       hatZeilenbereich1.loescheAlles(); 
       for(lauf=0;lauf<10;lauf++) // n=10!!!!
       { 
        hatZeilenbereich1.haengeAn(lauf + " " + zahlenfeld[lauf]);
       }
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfSortierenbubble fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSortierenInsertionGeklickt()
    {  
        int help1;
        int help2;
        
        for(int i=1; i<zahlenfeld.length; i++)                                               //Äussere Schleife
        {
            help1 = i;
            
            while((help1>0) && (zahlenfeld[help1] < zahlenfeld[help1-1]))                    //Innere Schleife
            {
                help2 = zahlenfeld[help1];
                zahlenfeld[help1] = zahlenfeld[help1-1];
                zahlenfeld[help1-1] = help2;
                help1--;
            }
        }
        ausgabe();
    }
    
    public void hatKnopfSortierenBubbleGeklickt()
    {  
        int cache;
        for(int i=0; i<zahlenfeld.length; i++)                                               //Äussere Schleife
        {
            for(int j=1; j<zahlenfeld.length-i; j++)
            {
                if(zahlenfeld[j-1]>zahlenfeld[j])
                {
                    cache = zahlenfeld[j];
                    zahlenfeld[j] = zahlenfeld[j-1];
                    zahlenfeld[j-1] = cache;
                }   
            }
        }
        ausgabe();
    }
    
    public void hatKnopfSortierenSelectionGeklickt()
    {  
        int help1;
        int help2;
        
        for(int i=1; i<zahlenfeld.length; i++)                                               //Äussere Schleife
        {
            
        }
        ausgabe();
    }

}
