/*
--- UFV - Ciência da Computação ---
Disciplina{ 
    CCF 313 - Programação Orientada a Objetos
    }	
Professor{ 
    Fabrício Silva
    }
Alunos{
    Cleidimar L. dos Passos - [EF03473]
    João Vitor G. Vieira - [EF04212]
    Juan Pablo A. Avelar - [EF04229]
    Leonardo Araujo R. Aguiar - [EF04702]
    Vinicius Augusto A. Ferreira -  [EF04242]
    }
*/
package DAO;

import Model.Professor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 */
public class ProfessorDAO {
    private ArrayList<Professor> professores;
    
    public ProfessorDAO(){
        Connection cn = Conexao.getConexaoMySQL();
        Queries lista=new Queries();
        this.professores = new ArrayList<>();
        try {
            if(!lista.getProfessorestb().isEmpty()){
                this.professores = lista.getProfessorestb();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void adicionarProfessor(Professor p){
        //verificar se o professor ja existe, se nao adicionar
        professores.add(p);
        Queries insereprof = new Queries();
        
        insereprof.InsertProfessor(p);
    }
    
    public Professor buscarProfessor(Professor p){
        for(Professor p1 : professores){
            if(p1.getMatricula().equals(p.getMatricula()) && 
                    p1.getSenha().equals(p.getSenha())){
                return p1;
            }
        }
        return null;
    }
    
    public ArrayList<Professor> listarProfessores(){
        return this.professores;
    }
    
     public Professor buscarMatProfessor(String a){
        for(Professor p1 : professores){
            if(p1.getMatricula().equals(a))
                return p1;
            }
            return null;
    }

}
