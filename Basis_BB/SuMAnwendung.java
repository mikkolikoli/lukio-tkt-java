/**
 * A0 Bearbeite die Aufgaben im BinaryTree!!, danach...
 * 
 * A1 Erstelle die Implementationsdiagramme der Klassen Zahlenbaum und Zahl
 * 
 * A2 Skizziere das Beziehungsdiagramm der beteiligten Klassen
 * 
 * A3 Skizziere den Baum aus dem Konstruktur der Klasse Zahlenbaum
 * 
 * A4 Teste das Programm - vergleiche mit deinem Baum aus A3 und notiere, 
 *     welche Methoden/Buttons noch implementiert werden müssen.
 *     
 * A5 Implementiere die fehlenden Methoden (zunächst ohne summenwer)    
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettBaum;
    private Etikett hatEtikettErstellenUndAusgeben;
    private Etikett hatEtikettObjecteAlsString;
    private Textfeld hatTextfeldEingabe;
    private Knopf hatKnopfNeuerBaum;
    private Knopf hatKnopfObjektSetzenLinks;
    private Knopf hatKnopfObjektSetzenRechts;
    private Knopf hatKnopfGeheInDenLinkenTb;
    private Knopf hatKnopfGeheInDenRechtenTb;
    private Knopf hatKnopfGeheZurWurzel;
    private Knopf hatKnopfZeigeaktuellesobjekt;
    private Knopf hatKnopfAufgabe1;
    private Knopf hatKnopfAufgabe2;
    private Knopf hatKnopfAufgabe3;
    private Knopf hatKnopfAufgabe4;
    private Knopf hatKnopfAufgabe5;
    private Knopf hatKnopfAufgabe6;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfBeenden;
    
    private ZahlenBaum hatZahlenBaum;


    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1059, 924);

        hatEtikettBaum = new Etikett(397, 60, 100, 25, "Baum");
        // Ausrichtung
        hatEtikettBaum.setzeAusrichtung(Ausrichtung.MITTE);
        hatEtikettBaum.setzeSchriftGroesse(20);
        hatEtikettErstellenUndAusgeben = new Etikett(322, 103, 255, 27, "erstellen und ausgeben");
        // Ausrichtung
        hatEtikettErstellenUndAusgeben.setzeAusrichtung(Ausrichtung.MITTE);
        hatEtikettObjecteAlsString = new Etikett(324, 138, 253, 26, "Objecte als String");
        // Ausrichtung
        hatEtikettObjecteAlsString.setzeAusrichtung(Ausrichtung.MITTE);
        hatTextfeldEingabe = new Textfeld(85, 279, 120, 27, "");
        // Ausrichtung
        hatTextfeldEingabe.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfNeuerBaum = new Knopf(225, 218, 207, 25, "neuerBaum");
        hatKnopfNeuerBaum.setzeBearbeiterGeklickt("hatKnopfNeuerBaumGeklickt");
        hatKnopfObjektSetzenLinks = new Knopf(8, 320, 90, 27, "Links setzen");
        hatKnopfObjektSetzenLinks.setzeBearbeiterGeklickt("hatKnopfObjektSetzenLinksGeklickt");
        hatKnopfObjektSetzenRechts = new Knopf(108, 320, 90, 27, "Rechts setzen");
        hatKnopfObjektSetzenRechts.setzeBearbeiterGeklickt("hatKnopfObjektSetzenRechtsGeklickt");
        hatKnopfGeheInDenLinkenTb = new Knopf(237, 324, 135, 25, "gehe in den linken TB");
        hatKnopfGeheInDenLinkenTb.setzeBearbeiterGeklickt("hatKnopfGeheInDenLinkenTbGeklickt");
        hatKnopfGeheInDenRechtenTb = new Knopf(394, 325, 173, 25, "gehe in den rechten TB");
        hatKnopfGeheInDenRechtenTb.setzeBearbeiterGeklickt("hatKnopfGeheInDenRechtenTbGeklickt");
        hatKnopfGeheZurWurzel = new Knopf(588, 325, 164, 25, "gehe zur Wurzel");
        hatKnopfGeheZurWurzel.setzeBearbeiterGeklickt("hatKnopfGeheZurWurzelGeklickt");
        hatKnopfZeigeaktuellesobjekt = new Knopf(91, 427, 154, 30, "zeigeAktuellesObjekt");
        hatKnopfZeigeaktuellesobjekt.setzeBearbeiterGeklickt("hatKnopfZeigeaktuellesobjektGeklickt");
        hatKnopfAufgabe1 = new Knopf(95, 559, 132, 25, "Aufgabe1");
        hatKnopfAufgabe1.setzeBearbeiterGeklickt("hatKnopfAufgabe1Geklickt");
        hatKnopfAufgabe2 = new Knopf(97, 604, 130, 25, "Aufgabe2");
        hatKnopfAufgabe2.setzeBearbeiterGeklickt("hatKnopfAufgabe2Geklickt");
        hatKnopfAufgabe3 = new Knopf(99, 648, 128, 25, "Aufgabe3");
        hatKnopfAufgabe3.setzeBearbeiterGeklickt("hatKnopfAufgabe3Geklickt");
        hatKnopfAufgabe4 = new Knopf(99, 688, 128, 25, "Aufgabe4");
        hatKnopfAufgabe4.setzeBearbeiterGeklickt("hatKnopfAufgabe4Geklickt");
        hatKnopfAufgabe5 = new Knopf(99, 728, 128, 25, "Aufgabe5");
        hatKnopfAufgabe5.setzeBearbeiterGeklickt("hatKnopfAufgabe5Geklickt");
        hatKnopfAufgabe6 = new Knopf(99, 768, 128, 25, "Aufgabe6");
        hatKnopfAufgabe6.setzeBearbeiterGeklickt("hatKnopfAufgabe6Geklickt");
        hatZeilenbereich1 = new Zeilenbereich(291, 433, 461, 247, "");
        hatKnopfBeenden = new Knopf(868, 796, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        
       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfNeuerleererbaum fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfNeuerBaumGeklickt()
    {
        hatZahlenBaum = new ZahlenBaum();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfObjektSetzen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfObjektSetzenLinksGeklickt()
    {
        
    }
    
    public void hatKnopfObjektSetzenRechtsGeklickt()
    {
        int wert = hatTextfeldEingabe.inhaltAlsGanzeZahl();
        hatZahlenBaum.setzeZahlRechts(wert);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGeheInDenLinkenTb fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGeheInDenLinkenTbGeklickt()
    {
       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGeheInDenRechtenTb fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGeheInDenRechtenTbGeklickt()
    {
        hatZahlenBaum.geheInDenRechtenTB();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGeheZurWurzel fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGeheZurWurzelGeklickt()
    {
       hatZahlenBaum.zurWurzel();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfZeigeaktuellesobjekt fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfZeigeaktuellesobjektGeklickt()
    {
        hatZeilenbereich1.haengeAn(hatZahlenBaum.gibWert());
    }


    public void hatKnopfAufgabe1Geklickt()
    {
        hatZahlenBaum.zurWurzel();
        
    }


    public void hatKnopfAufgabe2Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }


    public void hatKnopfAufgabe3Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }


    public void hatKnopfAufgabe4Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }


    public void hatKnopfAufgabe5Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }


    public void hatKnopfAufgabe6Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
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
