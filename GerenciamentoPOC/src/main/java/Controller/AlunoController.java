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
 *String nome, String usuario, String senha, int matricula, TipoUsuario tipo
 */
public class AlunoController {
    
    
    public AlunoController(){
        
    }
    
    public void cadastrarAluno(Aluno a){
        // verificar se todos os atributos do aluno estão corretos
        // se nome só possui letras
        // se matricula so possui numeros e etc
        // Ao final se td estiver certo chamar o DAO aluno para adiciona-lo no sistea
        
    }
    
    public Aluno logar(Aluno a){
        return Context.alunoDAO.buscarAluno(a);
    }
}
