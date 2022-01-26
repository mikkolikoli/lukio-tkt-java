/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 21.1.2020
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettPalindrompruefen;
    private Textfeld hatTextfeld1;
    private Knopf hatKnopfAusfuehren;
    private Zeilenbereich hatZeilenbereich1;
    
    private istPalindrom hatPalindromPruefen;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1699, 1100);

        hatEtikettPalindrompruefen = new Etikett(181, 53, 100, 25, "PalindromPruefen");
        // Ausrichtung
        hatEtikettPalindrompruefen.setzeAusrichtung(Ausrichtung.MITTE);
        hatTextfeld1 = new Textfeld(66, 134, 100, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAusfuehren = new Knopf(191, 134, 100, 25, "Ausfuehren");
        hatKnopfAusfuehren.setzeBearbeiterGeklickt("hatKnopfAusfuehrenGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(373, 134, 600, 713, "");
        
        hatPalindromPruefen = new istPalindrom();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAusfuehren fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAusfuehrenGeklickt()
    {
        String lEingabe = hatTextfeld1.inhaltAlsText();
        if(hatPalindromPruefen.palindromPruefen(lEingabe) == true)
        {
            hatZeilenbereich1.haengeAn("Die Eingabe " + lEingabe + " ist ein Palindrom");
        }
        else
        {
            hatZeilenbereich1.haengeAn("Die Eingabe " + lEingabe + " ist kein Palindrom");
        }
    }

}
