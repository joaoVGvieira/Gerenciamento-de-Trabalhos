package MainGetPoc;

import DAO.Context;
import Model.Aluno;
import Model.Professor;
import Model.TipoUsuario;
import View.InterfaceLogar;

/**
 *
 */
public class GetPoc {

    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", "1234", "3861", TipoUsuario.ALUNO);
        Context.alunoController.cadastrarAluno(a);
        Professor p = new Professor("fabricio", "4321", "0420", TipoUsuario.PROFESSOR, true);
        Context.professorController.cadastrarProfessor(p);
        InterfaceLogar i = new InterfaceLogar();
        i.exibirInterface();
    }
}
