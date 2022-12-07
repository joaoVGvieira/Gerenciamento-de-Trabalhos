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

package Controller;

import DAO.Context;
import Model.Aluno;

/**
 *String nome, String usuario, String senha, int matricula, TipoUsuario tipo
 */
public class AlunoController {
    
    
    public AlunoController(){
        
    }
    
    public boolean cadastrarAluno(Aluno a){
        if(a.matriculaValida()){                  
            if(Context.alunoDAO.buscarAluno(a) == null){
                Context.alunoDAO.adicionarAluno(a);
                return true;
            }
        }
        return false;
    }
        
        // verificar se todos os atributos do aluno estão corretos
        // se nome só possui letras FEITO
        // se matricula so possui numeros e etc FEITO
        // Ao final se td estiver certo chamar o DAO aluno para adiciona-lo no sistema
        
    
    
    public Aluno logar(Aluno a){
        return Context.alunoDAO.buscarAluno(a);
    }
}
