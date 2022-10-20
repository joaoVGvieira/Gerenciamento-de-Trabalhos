/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentopoc_controller;

/**
 *
 * @author cleid
 */
import POC_model.*;
public class Cadastro {
    private Usuario usuario;

public Cadastro(Usuario usuario,String nome, int matricula, String senha, String tipo){
    if(tipo.equalsIgnoreCase(Tipo.tipo.Administrador.getLevel())){
        this.insereUsuario(usuario, nome, matricula, senha,Tipo.tipo.Administrador.getLevel());
    }else if(tipo.equalsIgnoreCase(Tipo.tipo.Aluno.getLevel())){
        this.insereUsuario(usuario, nome, matricula, senha,Tipo.tipo.Aluno.getLevel());
    }else if(tipo.equalsIgnoreCase(Tipo.tipo.Professor.getLevel())){
        this.insereUsuario(usuario, nome, matricula, senha,Tipo.tipo.Professor.getLevel());
    }else{
        System.out.println("Nivel informado invalido!!!");
    }
}    
public void insereUsuario(Usuario usuario,String nome, int matricula, String senha, String nivel){
    if(usuario==null){
        usuario=new Usuario(nome, matricula, senha,nivel);
    }else{
        insereUsuario(usuario.getProximo(), nome, matricula, senha, nivel);
    }
}
}
