
package DAO;

import Controller.AlunoController;
import Controller.POCController;
import Controller.ProfessorController;
import Model.Aluno;
import Model.POC;
import Model.Professor;

/**
 * 
 */

public abstract class Context {

    public static Aluno alunoLogado;
    public static AlunoController alunoController = new AlunoController();
    public static AlunoDAO alunoDAO = new AlunoDAO();
    
    public static Professor professorLogado;
    public static ProfessorController professorController = new ProfessorController();
    public static ProfessorDAO professorDAO = new ProfessorDAO();
    
    public static POC pocAnalisando;
    public static POCDAO pocDAO = new POCDAO();
    public static POCController pocController = new POCController();
    public static Aluno professsorLogado;
    
    
}