
package DAO;

import Controller.AlunoController;
import Model.Aluno;
import Model.Professor;
import Model.TipoUsuario;

/**
 * Nao tem oq mexer nesse arquivo
 */
public abstract class Context {
    public static Aluno alunoLogado;
    public static Professor professorLogado;
    public static AlunoController alunoController = new AlunoController();
    public static AlunoDAO alunoDAO = new AlunoDAO();
}
