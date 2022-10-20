package POC_model;

import java.util.ArrayList;

import java.util.Scanner;

public class Aluno {
    Usuario aluno;
    public String nome;
    public int matricula;
  
    ArrayList<Usuario> alunos = new ArrayList<>();
   
    Scanner Entrada = new Scanner(System.in) ;

    public void Cadastrar_aluno() {
        aluno = new Usuario();
        System.out.println("Digite o nome do aluno:");
        nome = Entrada.nextLine();
        aluno.setnome(nome);
        System.out.println("Digite a matricula do aluno:");
        matricula = Entrada.nextInt();
        aluno.setmatricula(matricula);
        aluno.usuario(nome, matricula, "chocolate");
        alunos.add(aluno);
    }    

    public void imprimir_aluno() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Nome: " + alunos.get(i).getnome(nome));
            System.out.println("Matricula: " + alunos.get(i).getmatricula(nome));
        }
    }
    
       
}
