package Controller;

import DAO.Context;
import Model.Professor;
import Model.TipoUsuario;
import Model.Usuario;
import java.util.regex.*;

/**
 *
 */
public class ProfessorController {

    public void cadastrarProfessor(Professor a) {
        //Verificar se todos os atributos de professor sao validos
        //Chamar o DAOProfessor para cadastrar o professor

        if (Context.professorDAO.buscarProfessor(a) == null) {
            Context.professorDAO.adicionarProfessor(a);
        }

    }

    public Professor logar(Professor a) {
        return Context.professorDAO.buscarProfessor(a);
    }
}
