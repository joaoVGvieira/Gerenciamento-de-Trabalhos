/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import Model.Usuario;

/**
 *
 */
public class AlunoController {
    
    
    public AlunoController(){
        
    }
    
    public void cadastrarAluno(Aluno a){
        if(a.getTipo().equals(TipoUsuario.ALUNO) && a.getMatricula() > 1234){
            Context.alunoDAO.adicionarAluno(a);
        }
    }
    
    public Aluno logar(Aluno a){
        return Context.alunoDAO.buscarAluno(a);
    }
}
