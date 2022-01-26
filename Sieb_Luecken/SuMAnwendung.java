/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 27.3.2019
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettSiebDesEratosthenes;
    private Etikett hatEtikettBereich;
    private Textfeld hatTextfeldbezeichner;
    private Textfeld hatTextfeld00;
    private Knopf hatKnopfLos;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfBeenden;
    
    int n = 10000;
    int [][] zahlen = new ____[n][2]; 

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1059, 924);

        hatEtikettSiebDesEratosthenes = new Etikett(184, 131, 211, 26, "Sieb des Eratosthenes");
        // Ausrichtung
        hatEtikettSiebDesEratosthenes.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettBereich = new Etikett(97, 197, 100, 25, "Bereich");
        // Ausrichtung
        hatEtikettBereich.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldbezeichner = new Textfeld(223, 195, 100, 25, "1");
        // Ausrichtung
        hatTextfeldbezeichner.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld00 = new Textfeld(366, 196, 100, 25, "100");
        // Ausrichtung
        hatTextfeld00.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfLos = new Knopf(99, 236, 100, 25, "Los");
        hatKnopfLos.setzeBearbeiterGeklickt("hatKnopfLosGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(101, 281, 432, 388, "");
        hatKnopfBeenden = new Knopf(372, 700, 100, 25, "beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        
        for (int i = 0; i<n; i++)
        {
            zahlen[i][0]=0;
            zahlen[i][1]=-1;
        }
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfLos fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfLosGeklickt()
    {
        int von = hatTextfeldbezeichner.inhaltAlsGanzeZahl();
        int bis = hatTextfeld00.inhaltAlsGanzeZahl();
        
        ____ (int j = 2; j<_____; j++)
        {
            int ____ = j+j;
            _____(test <= bis)
            {
                zahlen[test][0]= 1;
                zahlen[test][1]= test;
                test = test + ___;
            }
        }
        
        hatZeilenbereich1.loescheAlles();
        hatZeilenbereich1.haengeAn("Ausgabe");
        
        int reihe = 10;
        String ausgabe = "";
        for (int k = von+1; k<bis; k++)
        {   if (reihe<k)
              {
               //hatZeilenbereich1.haengeAn("\n");
               hatZeilenbereich1.haengeAn(ausgabe);
               ausgabe = "";
               reihe=reihe+10;
              }
            if(zahlen[k][0]== 0)
              {  ausgabe = ausgabe + " " + k;
                 // hatZeilenbereich1.haengeAn(k);
               }
            
        }
        
        hatZeilenbereich1.haengeAn("Ende");
        
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
       this.beenden();
    }

}
