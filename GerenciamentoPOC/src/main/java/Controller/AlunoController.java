package Controller;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import Model.Usuario;
import java.util.regex.*;

/**
 *String nome, String usuario, String senha, int matricula, TipoUsuario tipo
 */
public class AlunoController {
    
    
    public AlunoController(){
        
    }
    
    public void cadastrarAluno(Aluno a){
        
        if(Pattern.matches("/^[A-Za-z]+$/", a.getNome())){//TODO}
        if(Pattern.matches("/^[0-9]+$/", a.getMatricula())){//TODO}
        
        // verificar se todos os atributos do aluno estão corretos
        // se nome só possui letras
        // se matricula so possui numeros e etc
        // Ao final se td estiver certo chamar o DAO aluno para adiciona-lo no sistema
        
    }
    
    public Aluno logar(Aluno a){
        return Context.alunoDAO.buscarAluno(a);
    }
}
