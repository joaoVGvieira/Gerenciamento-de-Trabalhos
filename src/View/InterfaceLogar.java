package View;

import DAO.Context;
import Model.Aluno;
import Model.Professor;
import Model.TipoUsuario;
import java.util.Scanner;

/**
 *
 */
public class InterfaceLogar {

    public void mostrarOpcoesIniciais() {
        System.out.println("----GetPoc----");
        System.out.println("1- Logar");
        System.out.println("2- Cadastrar");
    }

    public void mostrarOpcaoLogar() {
        System.out.println("\n---------\n");
        System.out.println("Voce é:");
        System.out.println("1- Aluno");
        System.out.println("2- Professor");
    }

    public void mostrarAcoesAluno() {
        System.out.println("Acoes");
        System.out.println("1 - Buscar POC");
    }
    private void mostrarAcoesProfessor(){
        System.out.println("1 - Cadastrar POC");
        System.out.println("2 - Pesquisar POC");
        System.out.println("3 - Alterar POC");
        System.out.println("4 - Excluir POC");
    }

    public boolean logarCadastrar() {
        return true;
    }

    public void exibirInterface() {
        Scanner s = new Scanner(System.in);
        int opcao;
        while (true) {
            this.mostrarOpcoesIniciais();
            opcao = s.nextInt();
            if (opcao == 1){
                this.mostrarOpcaoLogar();
                opcao = s.nextInt();
                if (opcao == 1) {
                    System.out.print("Matricula: ");
                    String mat = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    Aluno a = new Aluno(null, mat, senha, TipoUsuario.ALUNO);
                    Context.alunoLogado = Context.alunoController.logar(a);
                    if (Context.alunoLogado != null) {
                        InterfaceAluno i = new InterfaceAluno();
                        i.mostrarOpcaoAluno();
                        int acao = s.nextInt();
                        if (acao == 1) {
                            System.out.print("Nome do POC: ");
                            String nomePoc = s.next();
                            System.out.println("Você buscou um POC");
                            //TODO: chamar a controladora do poc pra pesquisar com base no nome
                        }
                    } else {
                        System.out.println("Aluno não cadastrado.");
                    }
                } 
                else if (opcao == 2) {
                    //Mesma logica de cima
                    System.out.print("Matricula: ");
                    String mat = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    Professor b = new Professor(null, mat, senha, TipoUsuario.PROFESSOR, true);
                    Context.professorLogado = Context.professorController.logar(b);
               
                    if (Context.professorLogado != null) {
                        this.mostrarAcoesProfessor();
                        int acao = s.nextInt();
                        if (acao == 1) {
                            System.out.print("Nome do POC: ");
                            String nomePoc = s.next();
                            System.out.println("Você buscou um POC");
                            //TODO: chamar a controladora do poc pra pesquisar com base no nome
                        }
                    } else {
                        System.out.println("Professor não cadastrado.");
                    }
                }
            }else if(opcao == 2){
                this.mostrarOpcaoLogar();
                opcao = s.nextInt();
                if (opcao == 1) {
                    System.out.print("Nome: ");
                    String Nome = s.next();
                    System.out.print("Matricula: ");
                    String mat = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    Aluno a = new Aluno(Nome, mat, senha, TipoUsuario.ALUNO);
                    if (Context.alunoController.cadastrarAluno(a) == true) {
                            System.out.println("Aluno Cadastrado!!!");
                        }
                    else {
                        System.out.println("Aluno não cadastrado.");
                    }
                }
                else if (opcao == 2) {
                    
                    System.out.print("Nome: ");
                    String Nome = s.next();
                    System.out.print("Matricula: ");
                    String mat = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    System.out.print("O professor é ADMNISTRADOR:\n 1.SIM | 2. NAO\n");
                    System.out.print("R=");
                    int opc = s.nextInt();
                    Professor b = new Professor(Nome, mat, senha, TipoUsuario.PROFESSOR, false);
                    if(opc == 1){
                        b.setIsAdm(true);
                        Context.professorController.cadastrarProfessor(b);

                    }
                    else if(opc == 2){
                        
                        Context.professorController.cadastrarProfessor(b);

                    }   
                    if (Context.professorController.cadastrarProfessor(b) == true) {
                          System.out.println("Professor Cadastrado!!!");

                    } else {
                        System.out.println("Professor não cadastrado.");
                    }
                }
            }
            else{
                System.out.println("Opcao Invalida!!!");
            }
        }
    }

}


