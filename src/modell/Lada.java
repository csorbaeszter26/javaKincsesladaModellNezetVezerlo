
package modell;


public class Lada {
    //adattagok:
    private String anyag, felirat;
    private boolean kincs;

    
    
    public Lada(String anyag, String felirat) { //konstruktor
        this(anyag,felirat, false);
        
    }

    
    
    public Lada(String anyag, String felirat, boolean kincs) {//konstruktor
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

    //public void setKincs(boolean kincs) {
        //this.kincs = kincs;
    //}
    //nemjoo ez itt felül
   //2 metodusra bontom:
    public void kincsetELhelyez(){
        this.kincs = true;
    }
    
    public void kincsetKivesz(){
        this.kincs = false;
    }
   
    
    
}
