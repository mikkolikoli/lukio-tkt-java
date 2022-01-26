/**
 * 
 * Suchen eiens Objektes
 * 
 * remove eines Objektes - wie, wenn nur der Name bekannt ist!?
 * 
 * 
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;
import java.io.Serializable;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettSortierterInformatikerbaum;
    private Knopf hatKnopfEinfuegen;
    private Knopf hatKnopfEntfernen;
    private Knopf hatKnopfSuchen;
    private Knopf hatKnopfKleinster;
    private Knopf hatKnopfGroesster;
    private Knopf hatKnopfKleinnachgross;
    private Knopf hatKnopfGroessnachklein;
    private Knopf hatKnopfGibwurzel;
    private Knopf hatKnopfEnde;
    private Textfeld hatTextfeldEinfuegen;
    private Textfeld hatTextfeldEntfernen;
    private Textfeld hatTextfeldSuchen;
    private Etikett hatEtikettAusgabe;
    private Zeilenbereich hatZeilenbereich1;

    // Attribute
    private Informatikerbaum hInformatikerbaum;
/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1059, 924);

        hatEtikettSortierterInformatikerbaum = new Etikett(355, 123, 131, 34, "sortierter Informatikerbaum");
        // Ausrichtung
        hatEtikettSortierterInformatikerbaum.setzeAusrichtung(Ausrichtung.MITTE);
        hatKnopfEinfuegen = new Knopf(192, 206, 100, 25, "einfuegen");
        hatKnopfEinfuegen.setzeBearbeiterGeklickt("hatKnopfEinfuegenGeklickt");
        hatKnopfEntfernen = new Knopf(192, 245, 100, 25, "entfernen");
        hatKnopfEntfernen.setzeBearbeiterGeklickt("hatKnopfEntfernenGeklickt");
        hatKnopfSuchen = new Knopf(192, 286, 100, 25, "suchen");
        hatKnopfSuchen.setzeBearbeiterGeklickt("hatKnopfSuchenGeklickt");
        hatKnopfKleinster = new Knopf(576, 211, 100, 25, "kleinster");
        hatKnopfKleinster.setzeBearbeiterGeklickt("hatKnopfKleinsterGeklickt");
        hatKnopfGroesster = new Knopf(579, 255, 100, 25, "groesster");
        hatKnopfGroesster.setzeBearbeiterGeklickt("hatKnopfGroessterGeklickt");
        hatKnopfKleinnachgross = new Knopf(576, 311, 116, 26, "kleinNachGross");
        hatKnopfKleinnachgross.setzeBearbeiterGeklickt("hatKnopfKleinnachgrossGeklickt");
        hatKnopfGroessnachklein = new Knopf(577, 355, 117, 25, "groessNachKlein");
        hatKnopfGroessnachklein.setzeBearbeiterGeklickt("hatKnopfGroessnachkleinGeklickt");
        hatKnopfGibwurzel = new Knopf(574, 411, 100, 25, "gibWurzel");
        hatKnopfGibwurzel.setzeBearbeiterGeklickt("hatKnopfGibwurzelGeklickt");
        hatKnopfEnde = new Knopf(94, 482, 100, 25, "Ende");
        hatKnopfEnde.setzeBearbeiterGeklickt("hatKnopfEndeGeklickt");
        hatTextfeldEinfuegen = new Textfeld(59, 213, 100, 25, "");
        // Ausrichtung
        hatTextfeldEinfuegen.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldEntfernen = new Textfeld(58, 252, 100, 25, "");
        // Ausrichtung
        hatTextfeldEntfernen.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldSuchen = new Textfeld(60, 289, 100, 25, "");
        // Ausrichtung
        hatTextfeldSuchen.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettAusgabe = new Etikett(319, 285, 100, 25, "Ausgabe");
        // Ausrichtung
        hatEtikettAusgabe.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(730, 213, 204, 310, "");
        
        hInformatikerbaum = new Informatikerbaum();
         Informatiker lInformatiker1 = new Informatiker(1923,"Joseph","Weizenbaum","KI");
         Informatiker lInformatiker2 = new Informatiker(1920,"Konrad","Zuse","erster Rechner");
         Informatiker lInformatiker3 = new Informatiker(1912,"Alan","Turing","knackte Enigma");
         Informatiker lInformatiker4 = new Informatiker(1815,"Ada","Lovelace","schrieb erstes Computerprogramm");
         Informatiker lInformatiker5 = new Informatiker(1791,"Charles","Babbage","Analytical Engine");
         Informatiker lInformatiker6 = new Informatiker(1906,"Grace","Hopper","Compiler");
         Informatiker lInformatiker7 = new Informatiker(1940,"L","Carl","B");  
        
         hInformatikerbaum.rein(lInformatiker1);
         hInformatikerbaum.rein(lInformatiker2);
         hInformatikerbaum.rein(lInformatiker3);
         hInformatikerbaum.rein(lInformatiker4);
         hInformatikerbaum.rein(lInformatiker5);
         hInformatikerbaum.rein(lInformatiker6);
          hInformatikerbaum.rein(lInformatiker7);
       
        
        }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEinfuegen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEinfuegenGeklickt()
    {
        String lName = hatTextfeldEinfuegen.inhaltAlsText();
        Informatiker lInfo = new Informatiker(lName);
        hInformatikerbaum.rein(lInfo);  
        hatZeilenbereich1.haengeAn(lInfo.getGebJahr() + " " +lInfo.getNachname() + " eingefuegt");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEntfernen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEntfernenGeklickt()
    {
        String lWert = hatTextfeldEntfernen.inhaltAlsText();
        Informatiker lInformatiker = new Informatiker(lWert);
        hInformatikerbaum.raus(lInformatiker);  
        
    }   
/**
 * Vorher: Ereignis GeklicktvonhatKnopfSuchen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSuchenGeklickt()
    {
        String lWert = hatTextfeldSuchen.inhaltAlsText();
        Informatiker lInformatiker = new Informatiker(lWert);
        
        if(hInformatikerbaum.suchen(lInformatiker)==true)
        {
            hatEtikettAusgabe.setzeInhalt("gefunden");
        }
        else
        {hatEtikettAusgabe.setzeInhalt("nicht gefunden");
        }
        
        
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfKleinster fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfKleinsterGeklickt()
    {
        String ausgabe = "";
        Informatiker lInformatiker = hInformatikerbaum.kleinster();
        ausgabe = ausgabe + lInformatiker.getNachname();
        hatZeilenbereich1.haengeAn(ausgabe);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGroesster fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGroessterGeklickt()
    {
        String ausgabe = "";
        Informatiker lInformatiker = hInformatikerbaum.groesster();
        ausgabe = ausgabe + lInformatiker.getNachname();
        hatZeilenbereich1.haengeAn(ausgabe);
    }




/**
 * Vorher: Ereignis GeklicktvonhatKnopfKleinnachgross fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfKleinnachgrossGeklickt()
    {
        String ausgabe = hInformatikerbaum.alleKleinGross();
        hatZeilenbereich1.haengeAn(ausgabe);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGroessnachklein fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGroessnachkleinGeklickt()
    {
        String ausgabe = hInformatikerbaum.alleGrossKlein();
        hatZeilenbereich1.haengeAn(ausgabe);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfGibwurzel fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfGibwurzelGeklickt()
    {
        String ausgabe = "";
        Informatiker lInformatiker = hInformatikerbaum.gibWurzel();
        String lwert = lInformatiker.getNachname();
        ausgabe = ausgabe + lwert;
        hatZeilenbereich1.haengeAn(ausgabe); 
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEnde fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEndeGeklickt()
    {
        this.beenden();
    }

}
