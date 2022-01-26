/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 8.10.2019
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettZeitmessung;
    private Knopf hatKnopfSortieren;
    private Knopf hatKnopfInitialisierung;
    private Zeilenbereich hatZeilenbereich1;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1699, 1100);

        hatEtikettZeitmessung = new Etikett(239, 174, 167, 38, "Zeitmessung");
        // Ausrichtung
        hatEtikettZeitmessung.setzeAusrichtung(Ausrichtung.MITTE);
        hatKnopfSortieren = new Knopf(350, 239, 100, 25, "Sortieren");
        hatKnopfSortieren.setzeBearbeiterGeklickt("hatKnopfSortierenGeklickt");
        hatKnopfInitialisierung = new Knopf(239, 238, 100, 25, "Initialisierung");
        hatKnopfInitialisierung.setzeBearbeiterGeklickt("hatKnopfInitialisierungGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(236, 276, 145, 230, "");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfSortieren fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSortierenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfInitialisierung fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfInitialisierungGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
