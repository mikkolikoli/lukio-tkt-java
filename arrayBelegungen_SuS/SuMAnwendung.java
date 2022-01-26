/**
 * Fuer SuS als Basis
 * 
 * mit Syntax- (wenn man "den Kommentar" wegnimmt") und Semantikfehlern!!
 * 
 * @author 
 * @version 10.9.2014
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettUebungenZurSchleifenbelegung;
    private Knopf hatKnopfAufgabe1;
    private Knopf hatKnopfAufgabe2;
    private Knopf hatKnopfAufgabe3;
    private Knopf hatKnopfAufgabe4;
    private Knopf hatKnopfAufgabe5;
    private Knopf hatKnopfAufgabe6;
    private Knopf hatKnopfAufgabe7;
    private Knopf hatKnopfAufgabe8;
    private Knopf hatKnopfEnde;
    private Zeilenbereich hatZeilenbereich1;

    // Attribute
    /**
     * Konstruktor
     */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(811, 679);

        hatEtikettUebungenZurSchleifenbelegung = new Etikett(249, 87, 170, 25, "Uebungen zur Schleifenbelegung");
        // Ausrichtung
        hatEtikettUebungenZurSchleifenbelegung.setzeAusrichtung(Ausrichtung.MITTE);
        hatKnopfAufgabe1 = new Knopf(88, 160, 100, 25, "Aufgabe 1");
        hatKnopfAufgabe1.setzeBearbeiterGeklickt("hatKnopfAufgabe1Geklickt");
        hatKnopfAufgabe2 = new Knopf(88, 207, 100, 25, "Aufgabe 2");
        hatKnopfAufgabe2.setzeBearbeiterGeklickt("hatKnopfAufgabe2Geklickt");
        hatKnopfAufgabe3 = new Knopf(88, 252, 100, 25, "Aufgabe 3");
        hatKnopfAufgabe3.setzeBearbeiterGeklickt("hatKnopfAufgabe3Geklickt");
        hatKnopfAufgabe4 = new Knopf(88, 299, 100, 25, "Aufgabe 4");
        hatKnopfAufgabe4.setzeBearbeiterGeklickt("hatKnopfAufgabe4Geklickt");
        hatKnopfAufgabe5 = new Knopf(90, 347, 100, 25, "Aufgabe 5");
        hatKnopfAufgabe5.setzeBearbeiterGeklickt("hatKnopfAufgabe5Geklickt");
        hatKnopfAufgabe6 = new Knopf(91, 397, 100, 25, "Aufgabe 6");
        hatKnopfAufgabe6.setzeBearbeiterGeklickt("hatKnopfAufgabe6Geklickt");
        hatKnopfAufgabe7 = new Knopf(88, 449, 100, 25, "Aufgabe 7");
        hatKnopfAufgabe7.setzeBearbeiterGeklickt("hatKnopfAufgabe7Geklickt");
        hatKnopfAufgabe8 = new Knopf(87, 496, 100, 25, "Aufgabe 8");
        hatKnopfAufgabe8.setzeBearbeiterGeklickt("hatKnopfAufgabe8Geklickt");
        hatKnopfEnde = new Knopf(609, 571, 100, 25, "Ende");
        hatKnopfEnde.setzeBearbeiterGeklickt("hatKnopfEndeGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(313, 161, 250, 360, "");
    }

    private void ausgabe(String pInhalt,int pN, int[] pFeld)
    {

        hatZeilenbereich1.loescheAlles();

        hatZeilenbereich1.haengeAn(pInhalt);

        int pTest = pFeld.length;
        for( int a = 0; a < pTest; a++)
        {
            hatZeilenbereich1.haengeAn("Stelle: " + a + " Inhalt: " + pFeld[a]);
        }
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe1 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe1Geklickt()
    {
        int feld[] = new int[10];

        for(int lauf=0; lauf<10; lauf++)
        {
            feld[lauf] = lauf;
        }

        ausgabe("Identität",10,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe2 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe2Geklickt()
    {
        int feld[] = new int[20];
        int h=0;
        for(int i=0; i<feld.length; i++)            
        {
            h=i+1;
            feld[i] =h;
        }
        ausgabe("Identität",feld.length,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe3 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe3Geklickt()
    {
        int feld[] = new int[5];
        int h=0;
        for(int i=0; i<feld.length; i++)
        {
            h = i+1;
            h = h*h;
            feld[i] = h;
        }
        ausgabe("Identität",feld.length,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe4 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe4Geklickt()
    {
        int feld[] = new int[8];
        int h=0;
        for(int i=0; i<feld.length; i++)
        {
            h = i*i*i;
            feld[i] = h;
        }
        ausgabe("Identität",feld.length,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe5 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe5Geklickt()
    {
        int feld[] = new int[5];
        int h=0;
        for(int i=0; i<feld.length; i--)
        {
            h = i*(-1) -1;
            feld[i] = h;
        }
        ausgabe("Identität",feld.length,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe6 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe6Geklickt()
    {
        int feld[] = new int[8];
        feld[0] = 1;
        feld[1] = 1;
        for(int i=2; i<feld.length; i++)
        {
            int first = feld[i-2];
            int second = feld[i-1];
            feld[i] = first + second;
        }
        ausgabe("Identität",feld.length,feld);
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe7 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe7Geklickt()
    {
        char feld[] = new char[] {'A', 'S', 'M', 'B', 'D', 'N', 'M', 'L', 'S', 'J', 'F'};
    }

    /**
     * Vorher: Ereignis GeklicktvonhatKnopfAufgabe8 fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void hatKnopfAufgabe8Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
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
