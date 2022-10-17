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
    
    
    private Tipo usuario;
    private String nome;
    private String matricula;
    private String senha;
  
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
