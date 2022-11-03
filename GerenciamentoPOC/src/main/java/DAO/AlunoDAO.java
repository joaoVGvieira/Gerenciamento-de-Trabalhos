/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Aluno;
import java.util.ArrayList;

/**
 *
 */
public class AlunoDAO {
    private ArrayList<Aluno> alunos;
    
    
    public AlunoDAO(){
        alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno a){
        //verificar se o aluno ja existe se nao, adicionar
        alunos.add(a);
    }
    
    public ArrayList<Aluno> listarAlunos(){
        return this.alunos;
    }
    
    public Aluno buscarAluno(Aluno a){
        for(Aluno a1 : alunos){
            if(a1.getUsuario().equals(a.getUsuario()) && 
                    a1.getSenha().equals(a.getSenha())){
                return a1;
            }
        }
        return null;
    }
}
