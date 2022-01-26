
/**
 * Beschreiben Sie hier die Klasse Sort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Random;
public class Sort
{
    private int[] zahlen;
    private int[] zahlenKopie;
    private int laenge = 10;
    public Sort()
    {
        zahlen = new int[laenge];
        zahlenKopie = new int[laenge];
        
        initialisiere();
        
        copy(zahlen,zahlenKopie);
        
        System.out.println("Bubblesort:");
        ausgeben();
        
        bubblesort();
        
        System.out.println();
        System.out.println("Insertionsort:");
        
        //initialisiere();
        copy(zahlenKopie,zahlen);
        
        ausgeben();
        
        insertionsort();
        
        System.out.println();
        System.out.println("Selectionsort:");
        
        //initialisiere();
        copy(zahlenKopie,zahlen);
        
        ausgeben();
        
        selectionsort();
        
        System.out.println();
    }
    public void copy(int[] a, int[] b){
        for(int i = 0;i< a.length;i++){
            b[i] = a[i];
        }
    }
    public void initialisiere(){
        Random r = new Random();
        int randomIndex1 = 0;
        int randomIndex2 = 0;
        int temp = 0;
        for(int i = 0;i<zahlen.length;i++){
            zahlen[i] = i+1;
        }
        for(int i = 0;i<zahlen.length*2;i++){
            randomIndex1 = r.nextInt(zahlen.length);
            randomIndex2 = r.nextInt(zahlen.length);
            temp = zahlen[randomIndex1];
            zahlen[randomIndex1] = zahlen[randomIndex2];
            zahlen[randomIndex2] = temp;
        }
    }
    public void ausgeben(){
        for(int i = 0;i<zahlen.length;i++){
            System.out.print(zahlen[i] + " ");
        }
        System.out.println();
    }
    public void bubblesort(){
        int temp = 0;
        for(int i = zahlen.length-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(zahlen[j]>zahlen[j+1]){
                    temp = zahlen[j];
                    zahlen[j] = zahlen[j+1];
                    zahlen[j+1] = temp;
                    //ausgeben();
                }
            }
            //ausgeben();
        }
    }
    public void insertionsort(){
        int temp = 0;
        for(int i = 1;i<zahlen.length;i++){
            for(int j = i;j>0 && zahlen[j-1]> zahlen[j];j--){
                temp = zahlen[j];
                zahlen[j] = zahlen[j-1];
                zahlen[j-1] = temp;
                ausgeben();
            }
            //ausgeben();
        }
    }
    public void selectionsort(){
        int temp = 0;
        for(int i = 0;i<zahlen.length;i++){
            for(int j = i+1;j<zahlen.length;j++){
                if(zahlen[i]>zahlen[j]){
                    temp = zahlen[j];
                    zahlen[j] = zahlen[i];
                    zahlen[i] = temp;
                    ausgeben();
                }
            }
            //ausgeben();
        }
    }
}
