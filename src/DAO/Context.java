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