import sum.kern.*;

public class dreiecksturm
{
    private Bildschirm hatBildschirm;
    private Stift hatStift;
    
    public dreiecksturm()
    {
        hatBildschirm = new Bildschirm(600, 600);
        hatStift = new Stift();
        hatStift.bewegeBis(300, 580);
        this.zeichneDreiecksturm(200);
    }
    
    public void zeichneDreieck(int pLaenge)
    {
        hatStift.runter();
        hatStift.bewegeUm(pLaenge / 2);   //Unten
        hatStift.dreheUm(120);
        hatStift.bewegeUm(pLaenge);       //Rechts
        hatStift.dreheUm(120);
        hatStift.bewegeUm(pLaenge);       //Links
        hatStift.dreheUm(120);
        hatStift.bewegeUm(pLaenge);       //Unten
        hatStift.dreheUm(120);
        hatStift.bewegeUm(pLaenge);       //Rechts
        hatStift.dreheUm(240);
        hatStift.hoch();
    }
    
    public void zeichneDreiecksturm(int pLaenge)
    {
        if(pLaenge > 10)
        {
            this.zeichneDreieck(pLaenge);
            this.zeichneDreiecksturm(pLaenge * 2/3);
        }
    }
}
