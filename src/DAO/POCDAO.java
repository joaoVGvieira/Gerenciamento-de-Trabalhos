
package DAO;

import Model.Aluno;
import Model.POC;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 */
public class POCDAO {
    
    private ArrayList<POC> pocs;
    
    public POCDAO(){
        this.pocs = new ArrayList<>();
        
        Queries pegalista =new Queries();
        
        try {
            if(!pegalista.getPOCStb().isEmpty()){
                this.pocs = pegalista.getPOCStb();
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(POCDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void adicionarPOC(POC p){
        pocs.add(p);
        Queries inserepoc = new Queries();
        
        inserepoc.InsertPoc(p);
        
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
     
    
    public ArrayList<POC> pesquisarOrientador(String orientador){
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            if(p.getOrientador().contains(orientador)){
                resultado.add(p);
            }
        }
        return resultado;
    }
    
 
    public ArrayList<POC> pesquisarResumo(String resumo){
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            
            if(p.getResumo().contains(resumo)){
                resultado.add(p);
            }
            
        }
        return resultado;
    }
    
    public ArrayList<POC> pesquisarArea(String area){
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            
            if(p.getArea().contains(area)){
                resultado.add(p);
            }
        }
        return resultado;
    }
    
    public ArrayList<POC> pesquisarTitulo(String titulo){
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            
            if(p.getTitulo().contains(titulo)){
                resultado.add(p);
            }
        }
        return resultado;
    }
    
    public ArrayList<POC> pesquisarAno(int ano){
        ArrayList<POC> resultado = new ArrayList<>();
        for(POC p : pocs){
            
            if(p.getDataPostagem().getYear() == ano){
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void removerPOC(String titulo){
        ArrayList<POC> resultado = pesquisarTitulo(titulo);
        if(resultado.size() == 0){
            System.out.println("Nenhum resultado encontrado");
        }
        else{
            for(POC p : resultado){
                System.out.println("Removendo POC: ");
                p.printar();
                pocs.remove(p);
            }
       }
        
        
    }

   
}