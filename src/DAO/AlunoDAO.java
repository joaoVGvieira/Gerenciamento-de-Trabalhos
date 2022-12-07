
package DAO;

import Model.Aluno;
import java.util.ArrayList;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 */
public class AlunoDAO {
    private ArrayList<Aluno> alunos;
    
    
    public AlunoDAO(){
        boolean listabd;
        this.alunos = new ArrayList<>();
        listabd = getLista();
        if(listabd){
            System.out.println("lista alunos recebida do banco");
        }

    }
    public boolean getLista(){
        Queries pegalista = new Queries();
        
        try {
            if(!pegalista.getAlunostb().isEmpty()) {
                this.alunos = pegalista.getAlunostb();
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void adicionarAluno(Aluno a){
        Queries inserealuno = new Queries();
        
        inserealuno.InsertAluno(a);
        
        alunos.add(a);


    }
    
    public ArrayList<Aluno> listarAlunos(){
        return this.alunos;
    }
    
    public Aluno buscarAluno(Aluno a){
        for(Aluno a1 : alunos){
            if(a1.getMatricula().equals(a.getMatricula()) && 
                    a1.getSenha().equals(a.getSenha())){
                return a1;
            }
        }
        return null;
    }
    
     public Aluno buscarMatAluno(String a){
        for(Aluno a1 : alunos){
            if(a1.getMatricula().equals(a))
                return a1;
            }
            return null;
    }

}
