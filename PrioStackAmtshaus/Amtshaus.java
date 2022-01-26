/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 2.3.2020
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class Amtshaus extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettAmtshaus;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfBeenden;
    private Knopf hatKnopfUebernahmeInit;
    private Knopf hatKnopfAntraguebernehmen;
    private Textfeld hatTextfeld1;
    private Textfeld hatTextfeld2;
    private Textfeld hatTextfeld3;
    private Etikett hatEtikettName;
    private Etikett hatEtikettPrioritaet;
    private Etikett hatEtikett4;
    private Knopf hatKnopfOberstenantraganzeigen;
    private Knopf hatKnopfOberstenantragentnehmen;
    private Knopf hatKnopfAlleantraegeanzeigen;
    private Knopf hatKnopf7;
    private Knopf hatKnopf8;
    private Knopf hatKnopf9;
    
    private Antragsverwaltung antragsverwaltung;

    // Attribute

/**
 * Konstruktor
 */
    public Amtshaus()
    {
        //Initialisierung der Oberklasse
        super(1219, 800);

        hatEtikettAmtshaus = new Etikett(290, 98, 100, 25, "Amtshaus");
        // Ausrichtung
        hatEtikettAmtshaus.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(517, 226, 188, 374, "");
        hatKnopfBeenden = new Knopf(519, 626, 183, 54, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatKnopfUebernahmeInit = new Knopf(89, 184, 137, 29, "Uebernahme Init");
        hatKnopfUebernahmeInit.setzeBearbeiterGeklickt("hatKnopfUebernahmeInitGeklickt");
        hatKnopfAntraguebernehmen = new Knopf(88, 279, 139, 26, "AntragUebernehmen");
        hatKnopfAntraguebernehmen.setzeBearbeiterGeklickt("hatKnopfAntraguebernehmenGeklickt");
        hatTextfeld1 = new Textfeld(365, 280, 100, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld2 = new Textfeld(366, 318, 100, 25, "");
        // Ausrichtung
        hatTextfeld2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld3 = new Textfeld(366, 357, 100, 25, "");
        // Ausrichtung
        hatTextfeld3.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettName = new Etikett(236, 281, 100, 25, "Name");
        // Ausrichtung
        hatEtikettName.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettPrioritaet = new Etikett(236, 322, 100, 25, "Prioritaet");
        // Ausrichtung
        hatEtikettPrioritaet.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett4 = new Etikett(235, 358, 100, 25, "Etikett 4");
        // Ausrichtung
        hatEtikett4.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfOberstenantraganzeigen = new Knopf(86, 495, 188, 25, "oberstenAntragAnzeigen");
        hatKnopfOberstenantraganzeigen.setzeBearbeiterGeklickt("hatKnopfOberstenantraganzeigenGeklickt");
        hatKnopfOberstenantragentnehmen = new Knopf(90, 407, 179, 25, "OberstenAntragEntnehmen");
        hatKnopfOberstenantragentnehmen.setzeBearbeiterGeklickt("hatKnopfOberstenantragentnehmenGeklickt");
        hatKnopfAlleantraegeanzeigen = new Knopf(85, 534, 192, 25, "alleAntraegeAnzeigen");
        hatKnopfAlleantraegeanzeigen.setzeBearbeiterGeklickt("hatKnopfAlleantraegeanzeigenGeklickt");
        hatKnopf7 = new Knopf(84, 610, 250, 25, "tagesstapel‹bernehmen");
        hatKnopf7.setzeBearbeiterGeklickt("hatKnopf7Geklickt");
        hatKnopf8 = new Knopf(82, 650, 100, 25, "Knopf 8");
        hatKnopf8.setzeBearbeiterGeklickt("hatKnopf8Geklickt");
        hatKnopf9 = new Knopf(80, 689, 100, 25, "Knopf 9");
        hatKnopf9.setzeBearbeiterGeklickt("hatKnopf9Geklickt");
        
       antragsverwaltung = new Antragsverwaltung();;
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
        this.beenden();//    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfUebernahmeInit fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfUebernahmeInitGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAntraguebernehmen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAntraguebernehmenGeklickt()
    {
        Antrag lAntrag;
        String lName = hatTextfeld1.inhaltAlsText();
        
        int lPrio = hatTextfeld2.inhaltAlsGanzeZahl();
        lAntrag = new Antrag(lName,lPrio);
        antragsverwaltung.neuerAntrag(lAntrag);//    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfOberstenantraganzeigen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfOberstenantraganzeigenGeklickt()
    {
        hatZeilenbereich1.haengeAn("");
        Antrag lAntrag = antragsverwaltung.gibOberstenAntrag();
        
        if(!(lAntrag==null))
        {hatZeilenbereich1.haengeAn(lAntrag.gibName()+ " " +lAntrag.gibPrio() );
        }
        else
        {hatZeilenbereich1.haengeAn("keine Antraege vorhanden");
        }
        
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfOberstenantragentnehmen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfOberstenantragentnehmenGeklickt()
    {
        antragsverwaltung.entferneOberstenAntrag();//    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAlleantraegeanzeigen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAlleantraegeanzeigenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf7 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf7Geklickt()
    {
        antragsverwaltung.arbeiteAlleNeuenEin();//    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf8 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf8Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf9 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf9Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
