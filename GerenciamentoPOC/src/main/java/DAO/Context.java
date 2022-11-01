/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Controller.AlunoController;
import Model.Aluno;
import Model.Professor;
import Model.TipoUsuario;

/**
 *
 */
public abstract class Context {
    public static Aluno alunoLogado;
    public static Professor professorLogado;
    public static AlunoController alunoController = new AlunoController();
    public static AlunoDAO alunoDAO = new AlunoDAO();
}
