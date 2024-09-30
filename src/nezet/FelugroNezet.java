
package nezet;

import javax.swing.JOptionPane;




public class FelugroNezet {
    
    //private static final Scanner sc = new Scanner(System.in);
    
    public void megjelenit(String uzenet) {
        JOptionPane.showMessageDialog(null, uzenet);
        
    
    }
    
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyik ládában van  akincs? 1,2,3?");
       
        return Integer.parseInt(v)-1;
    
    }
    
}
