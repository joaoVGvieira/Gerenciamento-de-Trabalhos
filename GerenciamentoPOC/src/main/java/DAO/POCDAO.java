
package DAO;

import Model.POC;
import java.util.ArrayList;


/**
 *
 */
public class POCDAO {
    
    private ArrayList<POC> pocs;
    
    public POCDAO(){
        this.pocs = new ArrayList<>();
    }
    
    public void adicionarPOC(POC p){
        //Antes de adicionar eh preciso verificar se ja existe tal poc ja no sistema
        pocs.add(p);
    }
    
}
