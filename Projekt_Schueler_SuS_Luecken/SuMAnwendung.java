/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 23.9.2018
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettSchueler;
    private Etikett hatEtikettName;
    private Etikett hatEtikettGebjahr;
    private Etikett hatEtikettTelnr;
    private Etikett hatEtikettOrt;
    private Textfeld hatTextfeldName;
    private Textfeld hatTextfeldGebJahr;
    private Textfeld hatTextfeldTelNr;
    private Textfeld hatTextfeldOrt;
    private Textfeld hatTextfeld5;
    private Textfeld hatTextfeld6;
    private Textfeld hatTextfeld7;
    private Etikett hatEtikett5;
    private Etikett hatEtikett6;
    private Etikett hatEtikett7;
    private Knopf hatKnopfUebernehmen;
    private Knopf hatKnopfNameAnPos;
    private Knopf hatKnopfAllenamen;
    private Knopf hatKnopfAlledaten;
    private Knopf hatKnopf5;
    private Knopf hatKnopf6;
    private Knopf hatKnopf7;
    private Knopf hatKnopf8;
    private Textfeld hatTextfeldNameAnPos;
    private Zeilenbereich hatZeilenbereich1;
    private Textfeld hatTextfeldAlleDaten;

    private Schueler[] schuelerfeld = new Schueler[11];
    
    private int pos = 0;

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1145, 667);

        hatEtikettSchueler = new Etikett(279, 57, 100, 25, "Schueler");
        // Ausrichtung
        hatEtikettSchueler.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettName = new Etikett(74, 120, 100, 25, "Name");
        // Ausrichtung
        hatEtikettName.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettGebjahr = new Etikett(75, 160, 100, 25, "GebJahr");
        // Ausrichtung
        hatEtikettGebjahr.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettTelnr = new Etikett(75, 205, 100, 25, "TelNr");
        // Ausrichtung
        hatEtikettTelnr.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettOrt = new Etikett(75, 248, 100, 25, "Ort");
        // Ausrichtung
        hatEtikettOrt.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldName = new Textfeld(189, 121, 100, 25, "");
        // Ausrichtung
        hatTextfeldName.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldGebJahr = new Textfeld(191, 160, 100, 25, "");
        // Ausrichtung
        hatTextfeldGebJahr.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldTelNr = new Textfeld(190, 208, 100, 25, "");
        // Ausrichtung
        hatTextfeldTelNr.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldOrt = new Textfeld(190, 249, 100, 25, "");
        // Ausrichtung
        hatTextfeldOrt.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld5 = new Textfeld(185, 285, 100, 25, "");
        // Ausrichtung
        hatTextfeld5.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld6 = new Textfeld(186, 328, 100, 25, "");
        // Ausrichtung
        hatTextfeld6.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeld7 = new Textfeld(187, 372, 100, 25, "");
        // Ausrichtung
        hatTextfeld7.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett5 = new Etikett(75, 287, 100, 25, "Etikett 5");
        // Ausrichtung
        hatEtikett5.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett6 = new Etikett(77, 331, 100, 25, "Etikett 6");
        // Ausrichtung
        hatEtikett6.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikett7 = new Etikett(76, 372, 100, 25, "Etikett 7");
        // Ausrichtung
        hatEtikett7.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfUebernehmen = new Knopf(76, 422, 210, 25, "Uebernehmen");
        hatKnopfUebernehmen.setzeBearbeiterGeklickt("hatKnopfUebernehmenGeklickt");
        hatKnopfNameAnPos = new Knopf(393, 128, 100, 25, "Name an Pos");
        hatKnopfNameAnPos.setzeBearbeiterGeklickt("hatKnopfNameAnPosGeklickt");
        hatKnopfAllenamen = new Knopf(395, 170, 100, 25, "AlleNamen");
        hatKnopfAllenamen.setzeBearbeiterGeklickt("hatKnopfAllenamenGeklickt");
        hatKnopfAlledaten = new Knopf(394, 214, 100, 25, "AlleDaten");
        hatKnopfAlledaten.setzeBearbeiterGeklickt("hatKnopfAlledatenGeklickt");
        hatKnopf5 = new Knopf(395, 256, 100, 25, "Knopf 5");
        hatKnopf5.setzeBearbeiterGeklickt("hatKnopf5Geklickt");
        hatKnopf6 = new Knopf(396, 297, 100, 25, "Knopf 6");
        hatKnopf6.setzeBearbeiterGeklickt("hatKnopf6Geklickt");
        hatKnopf7 = new Knopf(398, 339, 100, 25, "Knopf 7");
        hatKnopf7.setzeBearbeiterGeklickt("hatKnopf7Geklickt");
        hatKnopf8 = new Knopf(398, 381, 100, 25, "Knopf 8");
        hatKnopf8.setzeBearbeiterGeklickt("hatKnopf8Geklickt");
        hatTextfeldNameAnPos = new Textfeld(523, 130, 100, 25, "");
        // Ausrichtung
        hatTextfeldNameAnPos.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(654, 132, 476, 523, "");
        hatTextfeldAlleDaten = new Textfeld(523, 216, 100, 25, "");
        // Ausrichtung
        hatTextfeldAlleDaten.setzeAusrichtung(Ausrichtung.LINKS);
        
        Schueler schueler1 = new Schueler("Petra",2003);
        schuelerfeld[pos]=schueler1;
        pos++;
        Schueler schueler2 = new Schueler("Peter",2007);
        schuelerfeld[pos]=schueler2;
        pos++;
        Schueler schueler3 = new Schueler("Pjotr",2003);
        schuelerfeld[pos]=schueler3;
        pos++;
        Schueler schueler4 = new Schueler("Peter",2002);
        schuelerfeld[pos]=schueler4;
        pos++;
        Schueler schueler5 = new Schueler("Petros",2003);
        schuelerfeld[pos]=schueler5;
        pos++;
        
        
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfUebernehmen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfUebernehmenGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }
    
    private String gibNameZuPos(int pPos)
    {
        return schuelerfeld[pPos].getName();
    }
    
    private String gibNameZuGebJahr(int pGebJahr)
    {
        int zGebJahr = pGebJahr;
        String ausgabe = "";
        for(int i=0; i<pos; i++)
        {
            if(schuelerfeld[i].getGebJahr() == zGebJahr)
            {
                ausgabe = gibNameZuPos(i);
            }
        }
        return ausgabe;
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfNameAnPos fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfNameAnPosGeklickt()
    {
        int zPos = hatTextfeldNameAnPos.inhaltAlsGanzeZahl();
        hatZeilenbereich1.haengeAn(gibNameZuPos(zPos));
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAllenamen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    



public void hatKnopfAllenamenGeklickt()
    {
        for(int i=0; i<pos; i++)
        {
            hatZeilenbereich1.haengeAn(gibNameZuPos(i));
        }
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAlledaten fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAlledatenGeklickt()
    {
        int zPos = hatTextfeldAlleDaten.inhaltAlsGanzeZahl();
        hatZeilenbereich1.haengeAn("Name: " + gibNameZuPos(zPos) + " GeburtsJahr: " + schuelerfeld[zPos].getGebJahr());
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf5 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf5Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf6 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf6Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf7 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf7Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopf8 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopf8Geklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
