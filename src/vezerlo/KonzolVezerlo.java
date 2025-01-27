
package vezerlo;

import modell.JatekModell;
import nezet.CUInezet;
import nezet.KonzolNezet;


public class KonzolVezerlo {
    
    private JatekModell modell;
    private CUInezet nezet;
    
    //peldanyositjuk ezta kettőt:
    public KonzolVezerlo(JatekModell modell, CUInezet nezet) {
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
