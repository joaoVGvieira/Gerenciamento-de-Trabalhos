/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POC_model;

/**
 *
 * @author cleid
 */
public class Usuario {
    

    private String nome;
    private int matricula;
    private String senha;

    //Construtor
    public Usuario(String nome, int matricula, String senha){
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }
  
    public void setnome(String nome){
        this.nome=nome;
    }
    
    public void setmatricula(String nome){
        this.nome=nome;
    }
    
    public String getnome(String nome){
        return this.nome;
    }
    
    public String getmatricula(String nome){
        return this.matricula;
    }
    

}
