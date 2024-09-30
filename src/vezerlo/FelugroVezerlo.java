
package vezerlo;

import modell.JatekModell;
import nezet.FelugroNezet;


public class FelugroVezerlo {
    
    private JatekModell modell;
    private FelugroNezet nezet;
    
    //peldanyositjuk ezta kettőt:
    public FelugroVezerlo(JatekModell modell, FelugroNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        start();
    }
    
    public void start(){
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
        
    }
    
}
