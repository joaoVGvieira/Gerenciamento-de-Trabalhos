
package DAO;

import Model.Aluno;
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
        pocs.add(p);
    }
    
    public POC procuraPOC(POC poc){
        for(POC p : pocs){
            if(p.getData_postagem().equals(poc.getData_postagem()) && 
                    p.getTitulo().equals(poc.getTitulo())){
                return p;
            }
        }
        return null;
    }
    
}