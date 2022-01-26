/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 2.11.2019
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettPlanner;
    private Textfeld hasAddNewToDoPoint;
    private Knopf hasButtonAdd;
    private Zeilenbereich hasToDoList;
    private Knopf hasButtonMarkTaskComplete;

    // Attribute
    private int tasks;

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1735, 1025);

        hatEtikettPlanner = new Etikett(118, 61, 478, 104, "Planner");
        // Ausrichtung
        hatEtikettPlanner.setzeAusrichtung(Ausrichtung.MITTE);
        hasAddNewToDoPoint = new Textfeld(147, 244, 100, 25, "");
        // Ausrichtung
        hasAddNewToDoPoint.setzeAusrichtung(Ausrichtung.LINKS);
        hasAddNewToDoPoint.setzeBearbeiterEingabeBestaetigt("hasAddNewToDoPointEingabeBestaetigt");
        hasButtonAdd = new Knopf(280, 245, 100, 25, "Add");
        hasButtonAdd.setzeBearbeiterGeklickt("hasButtonAddGeklickt");
        hasToDoList = new Zeilenbereich(454, 233, 204, 663, "");
        hasButtonMarkTaskComplete = new Knopf(720, 243, 144, 27, "Task complete");
        hasButtonMarkTaskComplete.setzeBearbeiterGeklickt("hasButtonMarkTaskCompleteGeklickt");
        
        tasks = 0;
    }

/**
 * Vorher: Ereignis EingabeBestaetigtvonhasAddNewToDoPoint fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hasAddNewToDoPointEingabeBestaetigt()
    {
        hasButtonAddGeklickt();
    }

/**
 * Vorher: Ereignis GeklicktvonhasButtonAdd fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hasButtonAddGeklickt()
    {
        
        tasks++;
    }

/**
 * Vorher: Ereignis GeklicktvonhasButtonMarkTaskComplete fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hasButtonMarkTaskCompleteGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
