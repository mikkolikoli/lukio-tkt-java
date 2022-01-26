/**
 * Die Klasse SuMAnwendun wurde automatisch erstellt: 
 * 
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * wie Notfall , aber mit einer PriorityQueue - als Vererbung,
 * bei der nur insert anders ist!!!
 * Beachte: PrioObject ist zwischengeschaltet!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * @author 
 * @version 11.4.2006
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class Notfall_Ambulanz extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettName;
    private Etikett hatEtikettStatus;
    private Textfeld hatTextfeldName;
    private Textfeld hatTextfeldStatus;
    private Knopf hatKnopfAnmelden;
    private Knopf hatKnopfAbmelden;
    private Knopf hatKnopfBeenden;
    private Etikett hatEtikettNaechster;
    private PrioQueue<Patient> hatNotfallschlange;
    
    Patient tPatient;        //!!!!!!!!!!!!!!!!!!!!!!!

    // Attribute

/**
 * Konstruktor
 */
    public Notfall_Ambulanz()
    {
        //Initialisierung der Oberklasse
        super(594, 291);

        hatEtikettName = new Etikett(22, 45, 100, 25, "Name");
        // Ausrichtung
        hatEtikettName.setzeAusrichtung(Ausrichtung.RECHTS);
        hatEtikettStatus = new Etikett(23, 86, 100, 25, "Status");
        // Ausrichtung
        hatEtikettStatus.setzeAusrichtung(Ausrichtung.RECHTS);
        hatTextfeldName = new Textfeld(131, 45, 100, 25, "");
        // Ausrichtung
        hatTextfeldName.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldStatus = new Textfeld(131, 86, 100, 25, "");
        // Ausrichtung
        hatTextfeldStatus.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAnmelden = new Knopf(292, 45, 160, 30, "Patient anmelden");
        hatKnopfAnmelden.setzeBearbeiterGeklickt("hatKnopfAnmeldenGeklickt");
        hatKnopfAbmelden = new Knopf(292, 137, 160, 30, "Patient abmelden");
        hatKnopfAbmelden.setzeBearbeiterGeklickt("hatKnopfAbmeldenGeklickt");
        hatKnopfBeenden = new Knopf(23, 184, 100, 30, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatEtikettNaechster = new Etikett(21, 138, 210, 25, "");
        // Ausrichtung
        hatEtikettNaechster.setzeAusrichtung(Ausrichtung.LINKS);
        
        
        
        hatNotfallschlange = new PrioQueue<Patient>();
        
        tPatient = new Patient("1",1);    
        hatNotfallschlange.prioEnqueue(tPatient);
        
        hatEtikettNaechster.setzeInhalt("1");
        
        tPatient = new Patient("2",2);   
        hatNotfallschlange.prioEnqueue(tPatient);
        tPatient = new Patient("3",2);   
        hatNotfallschlange.prioEnqueue(tPatient);
         tPatient = new Patient("4",2);   
        hatNotfallschlange.prioEnqueue(tPatient);
        tPatient = new Patient("5",3);   
        hatNotfallschlange.prioEnqueue(tPatient);
        tPatient = new Patient("6",3);   
        hatNotfallschlange.prioEnqueue(tPatient);
        tPatient = new Patient("7",1);   
        hatNotfallschlange.prioEnqueue(tPatient);
        tPatient = new Patient("8",2);   
        hatNotfallschlange.prioEnqueue(tPatient);
       
        hatEtikettNaechster.setzeInhalt("8");
        
        this.zeigeWarteraum();
        
      
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAnmelden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAnmeldenGeklickt()
    {
        String lName;
        int lStatus;
        Patient lPatient;
        
        lName = hatTextfeldName.inhaltAlsText();
        lStatus = hatTextfeldStatus.inhaltAlsGanzeZahl();
        lPatient = new Patient(lName, lStatus);
        hatNotfallschlange.prioEnqueue(lPatient);
        this.zeigeWarteraum();
    }

/**Auch
 * Vorher: Ereignis GeklicktvonhatKnopfAbmelden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAbmeldenGeklickt()
    {
               
        hatNotfallschlange.dequeue();
        this.zeigeWarteraum();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBeendenGeklickt()
    {
        this.beenden();
    }
    
    public void zeigeWarteraum()
    {
        Patient lPatient;
        
        lPatient=(Patient)hatNotfallschlange.front();
        
        if (lPatient == null)
            hatEtikettNaechster.setzeInhalt("Warteraum ist leer");
        else
            hatEtikettNaechster.setzeInhalt("Warteraum: " + lPatient.name() + " " + lPatient.gibStatus());
    }

}
