
package nezet;

import java.util.Scanner;


public class KonzolNezet extends CUInezet{
    
    private static final Scanner sc = new Scanner(System.in);
    
    @Override
    public void megjelenit(String uzenet) {
        System.out.println(uzenet);
        
    
    }
    @Override
    public int bekeres() {
    
        megjelenit("Melyik ládában van  akincs? 1,2,3?");
         return sc.nextInt()-1;
    
    }
    
    
    
}
