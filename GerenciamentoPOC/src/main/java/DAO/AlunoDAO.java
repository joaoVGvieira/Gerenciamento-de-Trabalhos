
package DAO;

import Model.Aluno;
import java.util.ArrayList;

/**
 *
 */
public class AlunoDAO {
    private ArrayList<Aluno> alunos;
    
    
    public AlunoDAO(){
        alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno a){
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
}
