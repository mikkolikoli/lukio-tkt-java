/**
 * Die Klasse Anwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 29.11.2017
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class Anwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettWartendeHelden;
    private Etikett hatEtikettNeuerHeld;
    private Textfeld hatTextfeldName;
    private Etikett hatEtikettName;
    private Knopf hatKnopfEinfuegen;
    private Knopf hatKnopfErsterheld;
    private Zeilenbereich hatZeilenbereich1;
    private Etikett hatEtikettJaNein;
    private Knopf hatKnopfSchlangeLeer;
    private Knopf hatKnopfBeenden;
    private Knopf hatKnopfErstenRaus;
    private Knopf hatKnopfAlleRaus;
    private Knopf hatKnopfSuchen;

    private Buero2 hatBuero;
  
/**
 * Konstruktor
 */
    public Anwendung()
    {
        //Initialisierung der Oberklasse
        super(1145, 667);

        hatEtikettWartendeHelden = new Etikett(339, 59, 100, 25, "Buero");
        // Ausrichtung
        hatEtikettWartendeHelden.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettNeuerHeld = new Etikett(53, 120, 100, 25, "neue Person");
        // Ausrichtung
        hatEtikettNeuerHeld.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldName = new Textfeld(162, 172, 100, 25, "");
        // Ausrichtung
        hatTextfeldName.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettName = new Etikett(53, 173, 100, 25, "Name:");
        // Ausrichtung
        hatEtikettName.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfEinfuegen = new Knopf(53, 212, 100, 25, "einfuegen");
        hatKnopfEinfuegen.setzeBearbeiterGeklickt("hatKnopfEinfuegenGeklickt");
        hatKnopfSuchen = new Knopf(53, 312, 100, 25, "suchen");
        hatKnopfSuchen.setzeBearbeiterGeklickt("hatKnopfEinfuegenGeklickt");
        hatKnopfErsterheld = new Knopf(386, 180, 100, 25, "erste Person");
        hatKnopfErsterheld.setzeBearbeiterGeklickt("hatKnopfErsterheldGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(621, 179, 300, 300, "Mit Anzeige Buero erweitert");
        hatEtikettJaNein = new Etikett(521, 370, 121, 25, "Ja/nein");
        // Ausrichtung
        hatEtikettJaNein.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfSchlangeLeer = new Knopf(381, 371, 123, 25, "Schlange leer?");
        hatKnopfSchlangeLeer.setzeBearbeiterGeklickt("hatKnopfSchlangeLeerGeklickt");
        hatKnopfBeenden = new Knopf(725, 524, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatKnopfErstenRaus = new Knopf(382, 425, 100, 25, "einlassen");
        hatKnopfErstenRaus.setzeBearbeiterGeklickt("hatKnopfErstenRausGeklickt");
        hatKnopfAlleRaus = new Knopf(382, 472, 164, 25, "Sprechstunde beenden");
        hatKnopfAlleRaus.setzeBearbeiterGeklickt("hatKnopfAlleRausGeklickt");
    
        hatBuero = new Buero2();
        
        Person neu = new Person("Robert");
        hatBuero.hintenAnstellen(neu);
        neu = new Person("Max");
        hatBuero.hintenAnstellen(neu);        
        neu = new Person("Max2");
        hatBuero.hintenAnstellen(neu);        
        neu = new Person("Max3");
        hatBuero.hintenAnstellen(neu);        
        neu = new Person("Max4");
        hatBuero.hintenAnstellen(neu);        
        neu = new Person("Max5");
        hatBuero.hintenAnstellen(neu);
        
        
                
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfEinfuegen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfEinfuegenGeklickt()
    {
        Person neu;
        String nameNeuer = hatTextfeldName.inhaltAlsText();
        neu = new Person(nameNeuer);
        hatBuero.hintenAnstellen(neu);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfErsterheld fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfErsterheldGeklickt()
    {        
        hatZeilenbereich1.haengeAn("erster in der Schlange:");
        hatZeilenbereich1.haengeAn(hatBuero.nameErster());   
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfSchlangeLeer fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSchlangeLeerGeklickt()
    {        
        String antwort="nein";
        if(hatBuero.leer())
          {
              antwort = "ja";
            }
        hatEtikettJaNein.setzeInhalt(antwort);       
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
 * Vorher: Ereignis GeklicktvonhatKnopfErstenRaus fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfErstenRausGeklickt()
    {
        hatBuero.einlassen();       
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfErstenRausUndAnzeigen fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAlleRausGeklickt()
    {
        hatBuero.sprechstundeBeenden();         
        hatZeilenbereich1.haengeAn("Nun sind alle raus!");        
    }

}
