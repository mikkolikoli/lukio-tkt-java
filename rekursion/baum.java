import sum.kern.*;

public class baum
{
    private Bildschirm hatBildschirm;
    private Stift hatStift;

    public baum()
    {
        hatBildschirm = new Bildschirm(600, 600);
        hatStift = new Stift();
        hatStift.bewegeBis(300, 580);
        hatStift.dreheUm(90);
        hatStift.runter();
        this.zeichneBaum(150);
    }

    public void zeichneBaum(int pLaenge)
    {
        if(pLaenge > 10)
        {
            hatStift.bewegeUm(pLaenge);
            hatStift.dreheUm(60);
            this.zeichneBaum(pLaenge * 2/3);           //Links
            hatStift.dreheUm(-120);
            this.zeichneBaum(pLaenge * 2/3);           //Rechts
            hatStift.dreheUm(60);
            hatStift.bewegeUm(-pLaenge);
        }
    }
}
