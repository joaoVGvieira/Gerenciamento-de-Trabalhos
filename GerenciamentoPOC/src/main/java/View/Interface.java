/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import java.util.Scanner;

/**
 *
 */
public class Interface {
    public void mostrarOpcoesIniciais(){
        System.out.println("----GetPoc----");
        System.out.println("1- Logar");
        System.out.println("2- Cadastrar");
    }
    public void mostrarOpcaoLogar(){
        System.out.println("\n---------\n");
        System.out.println("Voce é:");
        System.out.println("1- Aluno");
        System.out.println("2- Professor");
    }
    public void mostrarAcoesAluno(){
        System.out.println("Acoes");
        System.out.println("1 - Buscar POC");
    }
    
    public boolean logarCadastrar(){
        return true;
    }
    
    public void exibirInterface(){
        Scanner s = new Scanner(System.in);
        int opcao;
        while(true){
            this.mostrarOpcoesIniciais();
            opcao = s.nextInt();
            if(opcao > 0 && opcao < 3){
                this.mostrarOpcaoLogar();
                opcao = s.nextInt();
                if(opcao == 1){
                    System.out.print("Usuario: ");
                    String usuario = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    Aluno a = new Aluno(null, usuario, senha, 0, TipoUsuario.ALUNO);
                    Context.alunoLogado = Context.alunoController.logar(a);
                    if(Context.alunoLogado != null){
                        this.mostrarAcoesAluno();
                        int acao = s.nextInt();
                        if(acao == 1){
                            System.out.print("Nome do POC: ");
                            String nomePoc = s.next();
                            System.out.println("Você buscou um POC");
                            //TODO: chamar a controladora do poc pra pesquisar com base no nome
                        }
                    }else{
                        System.out.println("Aluno não cadastrado.");
                    }
                }else if(opcao == 2){
                    //Mesma logica de cima
                }
            }
        }
    }
    
}
