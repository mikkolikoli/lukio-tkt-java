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
    private int n=10000;
    private int[] zahlenfeld = new int[n];
    private Rechner einRechner;
    private Uhr eineUhr;
    private double dauer;

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
        
        einRechner = new Rechner();
        dauer = 5;
        eineUhr = new Uhr();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfSortieren fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSortierenGeklickt()
    {
        int temp = 0;
        
        hatZeilenbereich1.haengeAn("n: " + n);
        eineUhr.starte();
        for(int i = n-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(zahlenfeld[j]>zahlenfeld[j+1]){
                    temp = zahlenfeld[j];
                    zahlenfeld[j] = zahlenfeld[j+1];
                    zahlenfeld[j+1] = temp;
                }
            }
        }
        eineUhr.stoppe();
        dauer = eineUhr.gestoppteZeit();
        hatZeilenbereich1.haengeAn("Zeit: " + dauer + "ms");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfInitialisierung fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfInitialisierungGeklickt()
    {
        for(int lauf = 0; lauf<n; lauf++)
        {
            zahlenfeld[lauf] = einRechner.ganzeZufallszahl(0, 1000);
        }
    }

}
