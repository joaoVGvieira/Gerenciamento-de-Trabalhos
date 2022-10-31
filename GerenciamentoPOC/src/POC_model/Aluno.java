package POC_model;

import java.util.ArrayList;

import java.util.Scanner;

public class Aluno extends Usuario {

    public Aluno(String nome, int matricula, String senha) {
        super(nome, matricula, senha);
        this.nivel=Tipo.tipo.Aluno;
    }
 
    public int getMatricula() {
        return super.getMatricula();
    }

    public String getNome() {
        return super.getNome();
    }

    public String getSenha(){
        return super.getSenha();
    }

}
