package MainGetPoc;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import View.InterfaceGeral;

/**
 *
 */
public class GetPoc {

    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", "1234", "3861", TipoUsuario.ALUNO); 
        Context.alunoController.cadastrarAluno(a);
        InterfaceGeral i = new InterfaceGeral(); // mudamos para fazer login com mat e senha em vez de nome e senha
        i.exibirInterface();
    }
}