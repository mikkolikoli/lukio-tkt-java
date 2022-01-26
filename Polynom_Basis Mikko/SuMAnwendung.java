/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 2.9.2018
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettPolynomGrad3;
    private Etikett hatEtikettFxAXBXCxD;
    private Etikett hatEtikettX;
    private Etikett hatEtikettA;
    private Etikett hatEtikettB;
    private Etikett hatEtikettC;
    private Etikett hatEtikettD;
    private Textfeld hatTextfeldx;
    private Textfeld hatTextfelda;
    private Textfeld hatTextfeldb;
    private Textfeld hatTextfeldc;
    private Textfeld hatTextfeldd;
    private Knopf hatKnopfBerechne;
    private Knopf hatKnopfBeenden;
    private Etikett hatEtikett8;
    private Knopf hatKnopfErsteabl;
    private Knopf hatKnopfZweiteabl;
    private Knopf hatKnopfDritteabl;
    private Etikett hatEtikettErsteAbl;
    private Etikett hatEtikettZweiteAbl;
    private Etikett hatEtikettDritteAbl;
    private Zeilenbereich hatZeilenbereich1;
    private Knopf hatKnopfF1;
    private Knopf hatKnopfF2;
    private Knopf hatKnopfF3;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1697, 971);

        hatEtikettPolynomGrad3 = new Etikett(308, 66, 100, 25, "Polynom Grad 3");
        // Ausrichtung
        hatEtikettPolynomGrad3.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettFxAXBXCxD = new Etikett(90, 156, 172, 31, "f(x) = a x³ + b x² + cx + d");
        // Ausrichtung
        hatEtikettFxAXBXCxD.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettX = new Etikett(89, 214, 28, 25, "x =");
        // Ausrichtung
        hatEtikettX.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettA = new Etikett(89, 253, 29, 26, "a =");
        // Ausrichtung
        hatEtikettA.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettB = new Etikett(89, 298, 31, 25, "b =");
        // Ausrichtung
        hatEtikettB.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettC = new Etikett(88, 345, 31, 26, "c =");
        // Ausrichtung
        hatEtikettC.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettD = new Etikett(86, 391, 31, 25, "d =");
        // Ausrichtung
        hatEtikettD.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldx = new Textfeld(139, 215, 39, 25, "2");
        // Ausrichtung
        hatTextfeldx.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfelda = new Textfeld(137, 258, 43, 25, "3");
        // Ausrichtung
        hatTextfelda.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldb = new Textfeld(140, 303, 37, 26, "4");
        // Ausrichtung
        hatTextfeldb.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldc = new Textfeld(140, 346, 35, 25, "5");
        // Ausrichtung
        hatTextfeldc.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldd = new Textfeld(139, 393, 39, 25, "6");
        // Ausrichtung
        hatTextfeldd.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfBerechne = new Knopf(84, 434, 100, 25, "berechne");
        hatKnopfBerechne.setzeBearbeiterGeklickt("hatKnopfBerechneGeklickt");
        hatKnopfBeenden = new Knopf(872, 683, 100, 25, "Beenden");
        hatKnopfBeenden.setzeBearbeiterGeklickt("hatKnopfBeendenGeklickt");
        hatEtikett8 = new Etikett(207, 433, 409, 25, "Etikett 8");
        // Ausrichtung
        hatEtikett8.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfErsteabl = new Knopf(84, 492, 100, 25, "ErsteAbl");
        hatKnopfErsteabl.setzeBearbeiterGeklickt("hatKnopfErsteablGeklickt");
        hatKnopfZweiteabl = new Knopf(84, 544, 100, 25, "ZweiteAbl");
        hatKnopfZweiteabl.setzeBearbeiterGeklickt("hatKnopfZweiteablGeklickt");
        hatKnopfDritteabl = new Knopf(85, 601, 100, 25, "DritteAbl");
        hatKnopfDritteabl.setzeBearbeiterGeklickt("hatKnopfDritteablGeklickt");
        hatEtikettErsteAbl = new Etikett(209, 494, 224, 28, "");
        // Ausrichtung
        hatEtikettErsteAbl.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettZweiteAbl = new Etikett(213, 550, 218, 25, "");
        // Ausrichtung
        hatEtikettZweiteAbl.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettDritteAbl = new Etikett(210, 604, 221, 25, "");
        // Ausrichtung
        hatEtikettDritteAbl.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereich1 = new Zeilenbereich(677, 218, 302, 412, "");
        hatKnopfF1 = new Knopf(455, 496, 100, 25, "f`(x)");
        hatKnopfF1.setzeBearbeiterGeklickt("hatKnopfF1Geklickt");
        hatKnopfF2 = new Knopf(455, 552, 100, 25, "f`` (x)");
        hatKnopfF2.setzeBearbeiterGeklickt("hatKnopfF2Geklickt");
        hatKnopfF3 = new Knopf(458, 605, 100, 25, "f```(x)");
        hatKnopfF3.setzeBearbeiterGeklickt("hatKnopfF3Geklickt");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBerechne fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBerechneGeklickt()
    {
        double x = hatTextfeldx.inhaltAlsZahl();
        double a = hatTextfelda.inhaltAlsZahl();
        double b = hatTextfeldb.inhaltAlsZahl();
        double c = hatTextfeldc.inhaltAlsZahl();
        double d = hatTextfeldd.inhaltAlsZahl();
        
        double fktsWert = a*x*x*x + b * x * x + c * x + d;
        
        String polynom = "f(" + x +")= ";
        
        polynom = polynom + a + " " + x + "³ + ";
        polynom = polynom + b + " " + x + "² + ";
        polynom = polynom + c + " " + x + " + ";
        polynom = polynom + d + " = " + fktsWert;
        
        hatEtikett8.setzeInhalt(polynom);
        
        hatZeilenbereich1.haengeAn(polynom);
        hatZeilenbereich1.haengeAn(" ");

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
 * Vorher: Ereignis GeklicktvonhatKnopfErsteabl fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfErsteablGeklickt()
    {
        double a = hatTextfelda.inhaltAlsZahl();
        double b = hatTextfeldb.inhaltAlsZahl();
        double c = hatTextfeldc.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        double b1 = 2*b;
        double c1 = 1*c;
        
        
        String ersteAbl = "f´(x)= ";
        
        ersteAbl = ersteAbl + a1 + " " + "x" + "² + ";
        ersteAbl = ersteAbl + b1 + " " + "x" + " + ";
        ersteAbl = ersteAbl + c1 + " ";
        
        hatEtikettErsteAbl.setzeInhalt(ersteAbl);
        
        hatZeilenbereich1.haengeAn(ersteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfZweiteabl fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfZweiteablGeklickt()
    {
        double a = hatTextfelda.inhaltAlsZahl();
        double b = hatTextfeldb.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        double b1 = 2*b;
        
        double a2 = 2*a1;
        double b2 = 1*b1;
        
        
        String zweiteAbl = "f´´(x)= ";
        
        zweiteAbl = zweiteAbl + a2 + " " + "x" + " + ";
        zweiteAbl = zweiteAbl + b2 + " ";
        
        hatEtikettZweiteAbl.setzeInhalt(zweiteAbl);
        
        hatZeilenbereich1.haengeAn(zweiteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfDritteabl fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfDritteablGeklickt()
    {
        double a = hatTextfelda.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        
        double a2 = 2*a1;
        
        double a3 = 1*a2;
        
        
        String dritteAbl = "f´´´(x)= ";
        
        dritteAbl = dritteAbl + a3 + " ";
        
        hatEtikettDritteAbl.setzeInhalt(dritteAbl);
        
        hatZeilenbereich1.haengeAn(dritteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfF1 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfF1Geklickt()
    {
        double x = hatTextfeldx.inhaltAlsZahl();
        double a = hatTextfelda.inhaltAlsZahl();
        double b = hatTextfeldb.inhaltAlsZahl();
        double c = hatTextfeldc.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        double b1 = 2*b;
        double c1 = 1*c;
        
        double wert = a1*x*x + b1 * x + c;
        
        String ersteAbl = "f´(" + x+ ")= " + wert;
        
        hatZeilenbereich1.haengeAn(ersteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfF2 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfF2Geklickt()
    {
        double x = hatTextfeldx.inhaltAlsZahl();
        double a = hatTextfelda.inhaltAlsZahl();
        double b = hatTextfeldb.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        double b1 = 2*b;
        
        double a2 = 2*a1;
        double b2 = 1*b1;
        
        double wert = a2*x + b2;
        
        String zweiteAbl = "f´´(" + x+ ")= " + wert;
        
        hatZeilenbereich1.haengeAn(zweiteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfF3 fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfF3Geklickt()
    {
        double x = hatTextfeldx.inhaltAlsZahl();
        double a = hatTextfelda.inhaltAlsZahl();
        
        
        double a1 = 3*a;
        
        double a2 = 2*a1;
        
        double a3 = 1*a2;
        
        double wert = a3;
        
        String dritteAbl = "f´´(" + x+ ")= " + wert;
        
        hatZeilenbereich1.haengeAn(dritteAbl);
        hatZeilenbereich1.haengeAn(" ");
    }

}
