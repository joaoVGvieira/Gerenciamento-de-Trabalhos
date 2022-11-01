/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 */
public class Aluno extends Usuario{
    public Aluno(String nome, String usuario, String senha, int matricula, TipoUsuario tipo){
        super(nome, usuario, senha, tipo);
        this.matricula = matricula;
    }
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
