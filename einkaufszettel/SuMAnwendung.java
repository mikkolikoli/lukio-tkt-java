/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 29.1.2020
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettEinkaufszettel;
    private Textfeld hatTextfeldArtikel;
    private Textfeld hatTextfeldMaxPreis;
    private Textfeld hatTextfeldAnzahl;
    private Etikett hatEtikettArtikel;
    private Etikett hatEtikettMaximalerPreis;
    private Etikett hatEtikettAnzahl;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfBeenden;
    private Knopf hatKnopfAusfuehren;
    private Knopf hatKnopfDurchschnitt;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1059, 924);

        hatEtikettEinkaufszettel = new Etikett(196, 69, 100, 25, "Einkaufszettel");
        // Ausrichtung
        hatEtikettEinkaufszettel.setzeAusrichtung(Ausrichtung.MITTE);
        hatTextfeldArtikel = new Textfeld(68, 175, 218, 25, "");
        // Ausrichtung
        hatTextfeldArtikel.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldMaxPreis = new Textfeld(309, 175, 100, 25, "");
        // Ausrichtung
        hatTextfeldMaxPreis.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldAnzahl = new Textfeld(431, 175, 100, 25, "");
        // Ausrichtung
        hatTextfeldAnzahl.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettArtikel = new Etikett(68, 138, 100, 25, "Artikel");
        // Ausrichtung
        hatEtikettArtikel.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettMaximalerPreis = new Etikett(309, 139, 100, 25, "maximaler Preis");
        // Ausrichtung
        hatEtikettMaximalerPreis.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettAnzahl = new Etikett(431, 138, 100, 25, "Anzahl");
        // Ausrichtung
        hatEtikettAnzahl.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(69, 254, 461, 393, "");
        hatKnopfBeenden = new Knopf(68, 697, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatKnopfAusfuehren = new Knopf(570, 175, 100, 25, "Ausfuehren");
        hatKnopfAusfuehren.setzeBearbeiterGeklickt("hatKnopfAusfuehrenGeklickt");
        hatKnopfAusfuehren = new Knopf(700, 175, 100, 25, "Durchschnitt");
        hatKnopfAusfuehren.setzeBearbeiterGeklickt("hatKnopfDurchschnittGeklickt");
    }

    public void hatKnopfAusfuehrenGeklickt()
    {}
    
    public void hatKnopfDurchschnittGeklickt()
    {}
    
    /**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
        System.exit(0);
    }

}
