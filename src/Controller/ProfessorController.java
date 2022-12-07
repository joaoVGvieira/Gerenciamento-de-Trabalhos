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
import Model.Professor;

/**
 *
 */
public class ProfessorController {

    public boolean cadastrarProfessor(Professor a) {
        
        //Verificar se todos os atributos de professor sao validos
        //Chamar o DAOProfessor para cadastrar o professor
        if(a.matriculaValida()){                  
            if(Context.professorDAO.buscarProfessor(a) == null){
                Context.professorDAO.adicionarProfessor(a);
                return true;
            }
        }
        return false;
    }

    public Professor logar(Professor a) {
        return Context.professorDAO.buscarProfessor(a);
    }
}
