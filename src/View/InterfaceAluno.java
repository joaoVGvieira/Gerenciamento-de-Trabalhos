package View;

import Model.Aluno;
import Model.TipoUsuario;
import java.util.Scanner;

public class InterfaceAluno {
    
    public void mostrarOpcaoAluno(){
        System.out.println("----- Opcoes do Aluno -----");
        System.out.println("1- Pesquisar POC");
        System.out.println("2- Informações do aluno");
         System.out.println("3- Voltar Menu Inicial");
        System.out.println("---------------------------");
    }
    
    public void mostrarOpcao1(){ // Pesquisar POC
        System.out.println("1- Pesquisar por Autores");
        System.out.println("2- Pesquisar por Orientador");
        System.out.println("3- Pesquisar por resumo");
        System.out.println("4- Pesquisar por Area");
        System.out.println("5- Pesquisar por Título");
    }
    
    public void mostrarOpcao2(Aluno alunoLogado){ // Informações do Aluno
        System.out.println("Nome: " + alunoLogado.getNome());
        System.out.println("Matricula: " + alunoLogado.getMatricula());
        System.out.println("Senha: " + alunoLogado.getSenha());
    }
    
    public int lerOpcao(){
        int opcao;
        Scanner s = new Scanner(System.in);
        try{
           opcao = s.nextInt();
        }catch(Exception e){
            System.out.println("Digite uma opção válida!");
            opcao = lerOpcao();
        }
        return opcao;
    }
    
    public Aluno lerLoginAluno(){
        Scanner s = new Scanner(System.in);
        System.out.print("Matricula: ");
        String mat = s.next();
        System.out.print("Senha: ");
        String senha = s.next();
        Aluno a = new Aluno(null, mat, senha, TipoUsuario.ALUNO);
        return a;
    }
    
    public Aluno cadastrarAluno(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        String Nome = s.nextLine();
        System.out.print("Matricula: ");
        String mat = s.next();
        System.out.print("Senha: ");
        String senha = s.next();
        Aluno a = new Aluno(Nome, mat, senha, TipoUsuario.ALUNO);
        return a;
    }
}