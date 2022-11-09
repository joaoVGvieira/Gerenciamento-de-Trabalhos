package DAO;

import Model.Professor;
import java.util.ArrayList;

/**
 *
 */
public class ProfessorDAO {
    private ArrayList<Professor> professores;
    
    public ProfessorDAO(){
        professores = new ArrayList<>();
    }
    
    public void adicionarProfessor(Professor p){
        //verificar se o professor ja existe, se nao adicionar
        professores.add(p);
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
}