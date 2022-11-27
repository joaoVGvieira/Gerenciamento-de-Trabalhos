
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
    public POC getPOC(){
        return this.pocs.get(0);
    }
    
    
    public POC procuraPOC(POC poc){
        for(POC p : pocs){
            if(p.getDataPostagem().equals(poc.getDataPostagem()) && 
                    p.getTitulo().equals(poc.getTitulo())){
                return p;
            }
        }
        return null;
    }
    
    public ArrayList<POC> pesquisarAutor(String autor){;
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            if(p.getListaDeAutores().contains(autor)){
                resultado.add(p);
            }
        }
        return resultado;

    }
     
    
    public POC pesquisarOrientador(String orientador){
        for(POC p : pocs){
            if(p.getOrientador().equals(orientador)){
                return p;
            }
        }
        return null;
    }
    
 
    public POC pesquisarResumo(String resumo){
        for(POC p : pocs){
            
            if(p.getResumo().equals(resumo)){
                return p;
            }
        }
        return null;
    }
    
    public POC pesquisarArea(String area){
         for(POC p : pocs){
            
            if(p.getArea().equals(area)){
                return p;
            }
        }
        return null;
    }
    
    public POC pesquisarTitulo(String titulo){
         for(POC p : pocs){
            
            if(p.getTitulo().equals(titulo)){
                return p;
            }
        }
        return null;
    }
    
    public POC pesquisarAno(String ano){
         for(POC p : pocs){
            
            if(p.getDataPostagem().equals(ano)){
                return p;
            }
        }
        return null;
    }

   
}