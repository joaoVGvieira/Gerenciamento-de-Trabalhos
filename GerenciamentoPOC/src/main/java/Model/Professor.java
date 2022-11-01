/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 */
public class Professor extends Usuario{
    
    private boolean isAdm;
    private String curso;

    public Professor(String nome, String matricula, String senha, TipoUsuario tipo, String curso, boolean isAdm) {
        super(nome, matricula, senha, tipo);
        this.isAdm = isAdm;
        this.curso = curso;
    }
    
    //public void pocCadastrar(){}

    public boolean isIsAdm() {
        return isAdm;
    }

    public void setIsAdm(boolean isAdm) {
        this.isAdm = isAdm;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
