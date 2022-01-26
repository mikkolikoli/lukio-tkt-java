/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 1.2.2018
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettEinfacheStringschlange;
    private Knopf hatKnopfInsert;
    private Knopf hatKnopfRemove;
    private Knopf hatKnopfNext;
    private Knopf hatKnopfAppend;
    private Knopf hatKnopfIsempty;
    private Knopf hatKnopfTofirst;
    private Knopf hatKnopfBeenden;
    private Textfeld hatTextfeld1;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfTolast;
    private Etikett hatEtikettBitteNurBuchstabenEingeben;
    
   // private List;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1145, 667);

        hatEtikettEinfacheStringschlange = new Etikett(186, 23, 126, 59, "einfache StringSchlange");
        // Ausrichtung
        hatEtikettEinfacheStringschlange.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfInsert = new Knopf(230, 154, 100, 25, "Insert");
        hatKnopfInsert.setzeBearbeiterGeklickt("hatKnopfInsertGeklickt");
        hatKnopfRemove = new Knopf(231, 192, 100, 25, "Remove");
        hatKnopfRemove.setzeBearbeiterGeklickt("hatKnopfRemoveGeklickt");
        hatKnopfNext = new Knopf(232, 231, 100, 25, "Next");
        hatKnopfNext.setzeBearbeiterGeklickt("hatKnopfNextGeklickt");
        hatKnopfAppend = new Knopf(231, 269, 100, 25, "Append");
        hatKnopfAppend.setzeBearbeiterGeklickt("hatKnopfAppendGeklickt");
        hatKnopfIsempty = new Knopf(232, 305, 100, 25, "IsEmpty");
        hatKnopfIsempty.setzeBearbeiterGeklickt("hatKnopfIsemptyGeklickt");
        hatKnopfTofirst = new Knopf(232, 342, 100, 25, "ToFirst");
        hatKnopfTofirst.setzeBearbeiterGeklickt("hatKnopfTofirstGeklickt");
        hatKnopfBeenden = new Knopf(233, 451, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatTextfeld1 = new Textfeld(59, 159, 100, 25, "");
        // Ausrichtung
        hatTextfeld1.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(411, 159, 548, 705, "");
        hatKnopfTolast = new Knopf(235, 383, 100, 25, "ToLast");
        hatKnopfTolast.setzeBearbeiterGeklickt("hatKnopfTolastGeklickt");
        hatEtikettBitteNurBuchstabenEingeben = new Etikett(23, 127, 162, 25, "Bitte nur Buchstaben eingeben");
        // Ausrichtung
        hatEtikettBitteNurBuchstabenEingeben.setzeAusrichtung(Ausrichtung.LINKS);
    }   
    
    private void anzeige()
    {
       // hatZeilenbereich1.haengeAn(stringList.getContent());
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfInsert fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfInsertGeklickt()
    {
        hatZeilenbereich1.haengeAn("insert");
       
        anzeige();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfRemove fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfRemoveGeklickt()
    {
       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfNext fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfNextGeklickt()
    {
        
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAppend fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAppendGeklickt()
    {
       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfIsempty fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfIsemptyGeklickt()
    {
        
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfTofirst fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfTofirstGeklickt()
    {
       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
       this.beenden();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfTolast fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfTolastGeklickt()
    {
       
    }

}
