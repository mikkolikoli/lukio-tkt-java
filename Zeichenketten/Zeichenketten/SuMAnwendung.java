/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 17.12.2019
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettZeichenketten;
    private Textfeld hatTextfeldWort;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfAusfuehren;
    private Auswahl hatAuswahlMethoden;
    private Knopf hatKnopfBeenden;
    private Etikett hatEtikettEingabe;
    private Etikett hatEtikettMethode;
    
    private text hatText;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1699, 1100);

        hatEtikettZeichenketten = new Etikett(119, 50, 196, 66, "Zeichenketten");
        // Ausrichtung
        hatEtikettZeichenketten.setzeAusrichtung(Ausrichtung.MITTE);
        hatTextfeldWort = new Textfeld(161, 214, 100, 25, "");
        // Ausrichtung
        hatTextfeldWort.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldWort.setzeBearbeiterEingabeBestaetigt("hatTextfeldWortEingabeBestaetigt");
        hatZeilenbereich1 = new Zeilenbereich(395, 214, 600, 824, "");
        hatKnopfAusfuehren = new Knopf(280, 214, 100, 25, "Ausfuehren");
        hatKnopfAusfuehren.setzeBearbeiterGeklickt("hatKnopfAusfuehrenGeklickt");
        hatAuswahlMethoden = new Auswahl(163, 153, 100, 25);
        hatAuswahlMethoden.setzeBearbeiterGeaendert("hatAuswahlMethodenGeaendert");
        hatKnopfBeenden = new Knopf(119, 1015, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatEtikettEingabe = new Etikett(49, 213, 100, 25, "Eingabe");
        // Ausrichtung
        hatEtikettEingabe.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettMethode = new Etikett(49, 154, 100, 25, "Methode");
        // Ausrichtung
        hatEtikettMethode.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatText = new text();
        
        //Auswahlfenster initialisieren
        
        hatAuswahlMethoden.haengeAn("istPalindrom()");
        hatAuswahlMethoden.haengeAn("dreheUm()");
    }

/**
 * Vorher: Ereignis EingabeBestaetigtvonhatTextfeldWort fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatTextfeldWortEingabeBestaetigt()
    {
        this.hatKnopfAusfuehrenGeklickt();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAusfuehren fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAusfuehrenGeklickt()
    {
        String wort = hatTextfeldWort.inhaltAlsText();
        boolean istWort = true;
        
        if(!wort.equals(""))
        {
            for(int stelle = 0; stelle<wort.length(); stelle++)
            {
                if(wort.charAt(stelle) == ' ')
                {
                    istWort = false;
                }
            }
        
            if(istWort == true)
            {
                if(hatAuswahlMethoden.text().equals("istPalindrom()"))
                {
                    boolean palindrom = hatText.istPalindrom(wort);
                    if(palindrom == true)
                    {
                        hatZeilenbereich1.haengeAn("Das Wort: " + wort + " ist ein Palindrom");
                    }
                    else
                    {
                        hatZeilenbereich1.haengeAn("Das Wort: " + wort + " ist kein Palindrom");
                    }
                }
            
                else if(hatAuswahlMethoden.text().equals("dreheUm()"))
                {
                    hatZeilenbereich1.haengeAn(hatText.dreheUm(wort));
                }
            
                else
                {
                    hatZeilenbereich1.haengeAn("Bitte wählen Sie eine Methode aus");
                }
            }
        
            else
            {
                hatZeilenbereich1.haengeAn("Bitte geben Sie ein Wort ohne Leerzeichen ein");
            }
        }
        
        else
        {
            hatZeilenbereich1.haengeAn("Bitte geben Sie ein Wort ein");
        }
    }

/**
 * Vorher: Ereignis GeaendertvonhatAuswahlMethoden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatAuswahlMethodenGeaendert()
    {
        hatZeilenbereich1.haengeAn("Sie haben die Methode " + hatAuswahlMethoden.text() + " ausgewählt!");
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
