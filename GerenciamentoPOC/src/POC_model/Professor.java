/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POC_model;

/**
 *
 * @author cleid
 */
public class Professor {
    private String nome;
    private String cpf;
    private String matricula;
    private String especializacao;
    
    
    public void setnome(String nome){
        this.nome=nome;
    }
    public void setcpf(String nome){
        this.nome=nome;
    }
    public void setmatricula(String nome){
        this.nome=nome;
    }
    
    public String getnome(String nome){
        return this.nome;
    }
    public String getcpf(String nome){
        return this.cpf;
    }
    public String getmatricula(String nome){
        return this.matricula;
    }
    
    public void setEspecializacao(String especializacao){
        this.especializacao=especializacao;
    }
    
    public String getEspecializacao(String nome){
        return this.nome;
    }
}
