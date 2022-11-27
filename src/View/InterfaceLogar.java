package View;

import DAO.AlunoDAO;
import DAO.Context;
import Model.Aluno;
import Model.POC;
import Model.Professor;
import Model.TipoUsuario;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 */
public class InterfaceLogar {

    public void mostrarOpcoesIniciais() {
        System.out.println("----GetPoc----");
        System.out.println("1 - Logar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Sair");
    }

    public void mostrarOpcaoLogar() {
        System.out.println("---------\n");
        System.out.println("Voce é:");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Voltar");
    }

 
    public boolean logarCadastrar() {
        return true;
    }

    public void exibirInterface() {
        int opcao,acao;
        InterfaceAluno i = new InterfaceAluno();
        InterfaceProfessor Ip = new InterfaceProfessor();
        while (true) {
            this.mostrarOpcoesIniciais();
            opcao =  i.lerOpcao();
            //LOGAR
            if (opcao == 1){
                this.mostrarOpcaoLogar();
                opcao = i.lerOpcao();
                //ALUNO
                if (opcao == 1) {
                    Context.alunoLogado = Context.alunoController.logar(i.lerLoginAluno());
                    if (Context.alunoLogado != null) {
                        do{
                            i.mostrarOpcaoAluno();
                             acao = i.lerOpcao();
                            if (acao == 1) {
                                i.mostrarOpcao1();
                                acao = i.lerOpcao();
                                switch (acao) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    default:
                                        break;
                                }
                            }else if(acao == 2){
                                Aluno aluno = Context.alunoDAO.buscarAluno(i.lerLoginAluno());
                                 i.mostrarOpcao2(aluno);
                            }else if(acao == 3 ){
                                break;
                            }
                            else{
                                System.out.println("Opcao Invalida!!!");
                            }
                        }while(acao!=3);
                        
                    } else {
                        System.out.println("Aluno não cadastrado.");
                    }
                }
                //PROFESSOR 
                else if (opcao == 2) {
                    Context.professorLogado = Context.professorController.logar(Ip.lerLoginProfessor());
                    if (Context.professorLogado != null) {
                        do{
                            Ip.mostrarOpcaoProfessor();
                             acao = Ip.lerOpcao();
                            //CADASTRAR POC
                            if (acao == 1) {
                                Ip.cadastrarPOC();
                            }
                            //PESQUISAR POC
                            else if(acao == 2){
                                Ip.pesquisarPOC();
                            }
                            //EDITAR POC
                            else if(acao == 3){
                                Ip.editarPOC();
                            }
                            //REMOVER POC
                            else if(acao==4){
                                Ip.removerPOC();
                            }
                            //MUDAR SENHA
                            else if(acao == 5){
                                Ip.mudarSenhaPOC();
                            }
                            else if(acao == 6){
                                break;
                            }
                            //VOLTAR
                            else{
                                System.out.println("opcao invalida!!!");
                            }
                            
                        }while(acao!=6);
                    }    
                    else {
                        System.out.println("Professor não cadastrado.");
                    }
                }    
                //VOLTAR
                else if(opcao == 3){
                    this.exibirInterface();
                }
                else{
                    System.out.println("Opcao invalida!!!");
                }
            }
            //CADASTRAR
            else if(opcao == 2){
               
                this.mostrarOpcaoLogar();
                opcao = i.lerOpcao();
                if (opcao == 1) {
                    if (Context.alunoController.cadastrarAluno(i.cadastrarAluno()) == true) {
                            System.out.println("Aluno Cadastrado!!!");
                        }
                    else {
                        System.out.println("Aluno não cadastrado.");
                    }
                }
                else if (opcao == 2) {
                    if (Context.professorController.cadastrarProfessor(Ip.cadastrarProfessor()) == true) {

                        System.out.println("Professor Cadastrado!!!");

                    } else {
                        System.out.println("Professor não cadastrado.");
                    }
                }
            }
            //SAIR
            else if(opcao == 3){
                System.out.println("Saindo...");
                break;
            }
            else{
                System.out.println("Opcao Invalida!!!");
            }
        }
    }

}


