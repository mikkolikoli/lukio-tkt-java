/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 2.12.2019
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettUeberschrift;
    private Knopf hatKnopfEnde;
    private Etikett hatEtikettBruder1;
    private Etikett hatEtikettBruder2;
    private Etikett hatEtikettBruder3;
    private Etikett hatEtikettBruder4;
    private Textfeld hatTextfeldBruder1;
    private Textfeld hatTextfeldBruder2;
    private Textfeld hatTextfeldBruder3;
    private Textfeld hatTextfeldBruder4;
    private Knopf hatKnopfBruder1;
    private Knopf hatKnopfBruder2;
    private Knopf hatKnopfBruder3;
    private Knopf hatKnopfBruder4;
    private Knopf hatKnopfRandomBruder1;
    private Knopf hatKnopfRandomBruder2;
    private Knopf hatKnopfRandomBruder3;
    private Knopf hatKnopfRandomBruder4;
    private Etikett hatEtikettBesterWurfVon;
    private Textfeld hatTextfeldBester;
    private Knopf hatKnopfBester;
    private Etikett hatEtikettBesterWurfGesamt;
    private Textfeld hatTextfeldBesterWurfGesamt;
    private Knopf hatKnopfBesterWurfGesamt;
    private Etikett hatEtikettVerbesserung;
    private Textfeld hatTextfeldVerbesserung;
    private Knopf hatKnopfVerbesserung;
    private Etikett hatEtikettDurchschnittVon;
    private Textfeld hatTextfeldDurchschnitt;
    private Knopf hatKnopfDurchschnitt;
    private Knopf hatKnopfBesterwerferdurchschnitt;
    private Knopf hatKnopfBesterwurf;
    private Zeilenbereich hatZeilenbereich1;
    
    private Bruederverwaltung gruppe; 
    private Rechner hatRechner;

    //Konstruktor
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1699, 1100);

        hatEtikettUeberschrift = new Etikett(282, 91, 100, 25, "Kegelbrueder");
        // Ausrichtung
        hatEtikettUeberschrift.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfEnde = new Knopf(368, 810, 100, 25, "Ende");
        hatKnopfEnde.setzeBearbeiterGeklickt("hatKnopfEndeGeklickt");
        hatEtikettBruder1 = new Etikett(91, 191, 100, 25, "Bruder1");
        // Ausrichtung
        hatEtikettBruder1.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettBruder2 = new Etikett(93, 252, 100, 25, "Bruder2");
        // Ausrichtung
        hatEtikettBruder2.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettBruder3 = new Etikett(95, 317, 100, 25, "Bruder3");
        // Ausrichtung
        hatEtikettBruder3.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettBruder4 = new Etikett(97, 376, 100, 25, "Bruder4");
        // Ausrichtung
        hatEtikettBruder4.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldBruder1 = new Textfeld(225, 190, 100, 25, "Bruder1");
        // Ausrichtung
        hatTextfeldBruder1.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldBruder2 = new Textfeld(227, 256, 100, 25, "Bruder2");
        // Ausrichtung
        hatTextfeldBruder2.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldBruder3 = new Textfeld(228, 323, 100, 25, "Bruder3");
        // Ausrichtung
        hatTextfeldBruder3.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldBruder4 = new Textfeld(227, 384, 100, 25, "Bruder4");
        // Ausrichtung
        hatTextfeldBruder4.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfBruder1 = new Knopf(357, 189, 100, 25, "Bruder1");
        hatKnopfBruder1.setzeBearbeiterGeklickt("hatKnopfBruder1Geklickt");
        hatKnopfBruder2 = new Knopf(361, 256, 100, 25, "Bruder2");
        hatKnopfBruder2.setzeBearbeiterGeklickt("hatKnopfBruder2Geklickt");
        hatKnopfBruder3 = new Knopf(363, 323, 100, 25, "Bruder3");
        hatKnopfBruder3.setzeBearbeiterGeklickt("hatKnopfBruder3Geklickt");
        hatKnopfBruder4 = new Knopf(363, 380, 100, 25, "Bruder4");
        hatKnopfBruder4.setzeBearbeiterGeklickt("hatKnopfBruder4Geklickt");
        
        //Zufallswurf
        hatKnopfRandomBruder1 = new Knopf(480, 189, 100, 25, "Zufall Bruder1");
        hatKnopfRandomBruder1.setzeBearbeiterGeklickt("hatKnopfRandomBruder1Geklickt");
        hatKnopfRandomBruder2 = new Knopf(480, 256, 100, 25, "Zufall Bruder2");
        hatKnopfRandomBruder2.setzeBearbeiterGeklickt("hatKnopfRandomBruder2Geklickt");
        hatKnopfRandomBruder3 = new Knopf(480, 323, 100, 25, "Zufall Bruder3");
        hatKnopfRandomBruder3.setzeBearbeiterGeklickt("hatKnopfRandomBruder3Geklickt");
        hatKnopfRandomBruder4 = new Knopf(480, 380, 100, 25, "Zufall Bruder4");
        hatKnopfRandomBruder4.setzeBearbeiterGeklickt("hatKnopfRandomBruder4Geklickt");
        
        hatEtikettBesterWurfVon = new Etikett(91, 483, 100, 25, "Bester Wurf von");
        // Ausrichtung
        hatEtikettBesterWurfVon.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldBester = new Textfeld(228, 483, 100, 25, "Bester Wurf von");
        // Ausrichtung
        hatTextfeldBester.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfBester = new Knopf(368, 483, 100, 25, "Bester Wurf von");
        hatKnopfBester.setzeBearbeiterGeklickt("hatKnopfBesterwurfGeklickt");
        
        //Bester Wurf gesamt
        hatKnopfBesterWurfGesamt = new Knopf(368, 700, 100, 25, "Bester Wurf");
        hatKnopfBesterWurfGesamt.setzeBearbeiterGeklickt("hatKnopfBesterwurfGesamtGeklickt");
        
        //Verbesserung
        hatEtikettVerbesserung = new Etikett(91, 770, 100, 25, "Verbesserung");
        // Ausrichtung
        hatEtikettVerbesserung.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldVerbesserung = new Textfeld(228, 770, 100, 25, "Bruder");
        // Ausrichtung
        hatTextfeldVerbesserung.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfVerbesserung = new Knopf(368, 770, 100, 25, "Verbesserung");
        hatKnopfVerbesserung.setzeBearbeiterGeklickt("hatKnopfVerbesserungGeklickt");
        
        hatEtikettDurchschnittVon = new Etikett(88, 542, 100, 25, "Durchschnitt von");
        // Ausrichtung
        hatEtikettDurchschnittVon.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldDurchschnitt = new Textfeld(228, 542, 100, 25, "Durchschnitt");
        // Ausrichtung
        hatTextfeldDurchschnitt.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfDurchschnitt = new Knopf(369, 541, 100, 25, "Durchschnitt");
        hatKnopfDurchschnitt.setzeBearbeiterGeklickt("hatKnopfDurchschnittGeklickt");
        hatKnopfBesterwerferdurchschnitt = new Knopf(372, 595, 170, 25, "BesterWerferDurchschnitt");
        hatKnopfBesterwerferdurchschnitt.setzeBearbeiterGeklickt("hatKnopfBesterwerferdurchschnittGeklickt");
        hatKnopfBesterwurf = new Knopf(372, 634, 174, 27, "Bester");
        hatKnopfBesterwurf.setzeBearbeiterGeklickt("hatKnopfBesterGeklickt");
        hatZeilenbereich1 = new Zeilenbereich(670, 192, 652, 604, "");
        
        gruppe = new Bruederverwaltung(4);
        hatRechner = new Rechner();
    }
    
    public void hatKnopfEndeGeklickt()
    {
        this.beenden();
    }
    
    public void hatKnopfBruder1Geklickt()
    {
        gruppe.addWurf(0,hatTextfeldBruder1.inhaltAlsGanzeZahl());
    }
    
    public void hatKnopfBruder2Geklickt()
    {
        gruppe.addWurf(1,hatTextfeldBruder2.inhaltAlsGanzeZahl());
    }
    
    public void hatKnopfBruder3Geklickt()
    {
        gruppe.addWurf(2,hatTextfeldBruder3.inhaltAlsGanzeZahl());
    }
    
    public void hatKnopfBruder4Geklickt()
    {
        gruppe.addWurf(3,hatTextfeldBruder4.inhaltAlsGanzeZahl());
    }
    
    public void hatKnopfRandomBruder1Geklickt()
    {
        for(int i=0; i<hatTextfeldBruder1.inhaltAlsGanzeZahl(); i++)
        {
            gruppe.addWurf(0,hatRechner.ganzeZufallszahl(0, 9));
        }
    }
    
    public void hatKnopfRandomBruder2Geklickt()
    {
        for(int i=0; i<hatTextfeldBruder2.inhaltAlsGanzeZahl(); i++)
        {
            gruppe.addWurf(1,hatRechner.ganzeZufallszahl(0, 9));
        }
    }
    
    public void hatKnopfRandomBruder3Geklickt()
    {
        for(int i=0; i<hatTextfeldBruder3.inhaltAlsGanzeZahl(); i++)
        {
            gruppe.addWurf(2,hatRechner.ganzeZufallszahl(0, 9));
        }
    }
    
    public void hatKnopfRandomBruder4Geklickt()
    {
        for(int i=0; i<hatTextfeldBruder4.inhaltAlsGanzeZahl(); i++)
        {
            gruppe.addWurf(3,hatRechner.ganzeZufallszahl(0, 9));
        }
    }
    
    public void hatKnopfBesterGeklickt()
    {
        double best = gruppe.gibGesamtWert(0);
        int werfer = 1;
        for(int i = 1; i<4;i++)
        {
            if(gruppe.gibGesamtWert(i) > best)
            {
                best = gruppe.gibGesamtWert(i);
                werfer = i + 1;
            }
        }
        
        hatZeilenbereich1.haengeAn("Der beste Werfer war Bruder" + werfer + " mit einer Gesamtpunktzahl von " + best);
    }
    
    public void hatKnopfDurchschnittGeklickt()
    {
        int bruder = hatTextfeldDurchschnitt.inhaltAlsGanzeZahl();
        if(bruder < 4 && bruder >= 0)
        {
            double durchschnitt = gruppe.gibDurchschnitt(bruder);
            hatZeilenbereich1.haengeAn("Durchschnitt von " + bruder + " ist: " + durchschnitt);
        }
        else
        {
            hatZeilenbereich1.haengeAn("Whether we wanted it or not,");
            hatZeilenbereich1.haengeAn("we've stepped into a war with the Cabal on Mars.");
            hatZeilenbereich1.haengeAn("So let's get to taking out their command, one by one.");
            hatZeilenbereich1.haengeAn("Valus Ta'aurc.");
            hatZeilenbereich1.haengeAn("From what I can gather,");
            hatZeilenbereich1.haengeAn("he commands the Siege Dancers from an Imperial Land Tank");
            hatZeilenbereich1.haengeAn("just outside of Rubicon.");
            hatZeilenbereich1.haengeAn("He's well protected but with the right team,");
            hatZeilenbereich1.haengeAn("we can punch through those defenses,");
            hatZeilenbereich1.haengeAn("take this beast out, and break their grip on Freehold.");
        }
    }
    
    public void hatKnopfBesterwerferdurchschnittGeklickt()
    {
        double best = gruppe.gibDurchschnitt(0);
        int werfer = 1;
        for(int i = 1; i<4; i++)
        {
            if(gruppe.gibDurchschnitt(i) > best)
            {
                best = gruppe.gibDurchschnitt(i);
                werfer = i + 1;
            }
        }
        
        hatZeilenbereich1.haengeAn("Bruder" + werfer + " hatte den besten Durchschnitt mit einem Durchschnitt von " + best);
    }
    
    public void hatKnopfBesterwurfGeklickt()
    {
        int bruder = hatTextfeldBester.inhaltAlsGanzeZahl();
        if(bruder < 4 && bruder >= 0)
        {
            int best = gruppe.besterWurf(bruder);
            bruder++;
            hatZeilenbereich1.haengeAn("Der beste Wurf von Bruder" + bruder + " war " + best);
        }
        else
        {
            hatZeilenbereich1.haengeAn("You just never quit, do you?");
            hatZeilenbereich1.haengeAn("Took out Ghaul, woke up the Traveller");
            hatZeilenbereich1.haengeAn("and now half of what I hear is how much you");
            hatZeilenbereich1.haengeAn("and your clan are making a difference.");
            hatZeilenbereich1.haengeAn("This is why I started this whole clan thing in the beginning.");
            hatZeilenbereich1.haengeAn("People are waiting for the vanguard to lead the way,");
            hatZeilenbereich1.haengeAn("but it's time for a change.");
            hatZeilenbereich1.haengeAn("And Guardians like you are making it happen.");
        }
    }
    
    public void hatKnopfBesterwurfGesamtGeklickt()
    {
        int best = gruppe.besterWurf(0);
        int werfer = 1;
        for(int i = 1; i<4; i++)
        {
            if(gruppe.besterWurf(i) > best)
            {
                best = gruppe.besterWurf(i);
                werfer = i + 1;
            }
        }
        
        hatZeilenbereich1.haengeAn("Der beste Wurf überhaupt war " + best + " von Bruder" + werfer);
    }
    
    public void hatKnopfVerbesserungGeklickt()
    {
        int bruder = hatTextfeldVerbesserung.inhaltAlsGanzeZahl();
        if(bruder < 4 && bruder >= 0)
        {
            int verbesserung = gruppe.verbesserung(bruder);
            bruder++;
            hatZeilenbereich1.haengeAn("Bruder" + bruder + " hat sich um " + verbesserung + " verbessert.");
        }
        else
        {
            hatZeilenbereich1.haengeAn("Indeed.");
        }
    }
}
