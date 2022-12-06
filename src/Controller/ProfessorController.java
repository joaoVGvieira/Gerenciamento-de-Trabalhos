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
