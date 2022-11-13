
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
            if(p.getData_postagem().equals(poc.getData_postagem()) && 
                    p.getTitulo().equals(poc.getTitulo())){
                return p;
            }
        }
        return null;
    }
    
    public POC pesquisarAutor(String autor){  
        for(POC p : pocs){
            
            if(p.getLista_de_autores().equals(autor)){
                 System.out.println(p.getLista_de_autores());
                 System.out.println("bodsaodl");
                return p;
            }
            System.out.println(p.getLista_de_autores());
        }
        System.out.println(autor);
        return null;

    }
     
    
    public POC pesquisarOrientador(String orientador){
        for(POC p : pocs){
            
            if(p.getCoOrientador().equals(orientador)){
                System.out.println("dasdsafsa certo");
                return p;
            }
                        System.out.println(p.getCoOrientador());

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
            
            if(p.getData_postagem().equals(ano)){
                return p;
            }
        }
        return null;
    }

   
}