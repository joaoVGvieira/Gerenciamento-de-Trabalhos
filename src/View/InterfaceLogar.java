package View;

import DAO.Context;
import Model.Aluno;
import Model.POC;
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
        System.out.println("3- Sair");
    }

    public void mostrarOpcaoLogar() {
        System.out.println("\n---------\n");
        System.out.println("Voce é:");
        System.out.println("1- Aluno");
        System.out.println("2- Professor");
        System.out.println("3- ADM");
        System.out.println("4- Voltar");
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
            
            //LOGAR
            if (opcao == 1){
                this.mostrarOpcaoLogar();
                opcao = s.nextInt();
                //ALUNO
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
                            i.mostrarOpcao1();
                            acao = s.nextInt();
                            if(acao==1){
                                
                            }else if(acao==2){
                                
                            }else if(acao == 3){
                                
                            }else if(acao == 4 ){
                                
                            }else if(acao == 5){
                                
                            }
                        }else if(acao == 2){
                            i.mostrarOpcao2(a);
                        }
                    } else {
                        System.out.println("Aluno não cadastrado.");
                    }
                }
                //PROFESSOR 
                else if (opcao == 2) {
                    System.out.print("Matricula: ");
                    String mat = s.next();
                    System.out.print("Senha: ");
                    String senha = s.next();
                    Professor b = new Professor(null, mat, senha, TipoUsuario.PROFESSOR, true);
                    Context.professorLogado = Context.professorController.logar(b);
                    if (Context.professorLogado != null) {
                        InterfaceProfessor Ip = new InterfaceProfessor();
                        Ip.mostrarOpcaoProfessor();
                        int acao = s.nextInt();
                        
                        //CADASTRAR POC
                        if (acao == 1) {
                            System.out.println("Titulo: ");
                            String titulo = s.next();
                            System.out.println("Lista de autores: ");
                            String lista_de_autores = s.next();
                            System.out.println("Orientador: ");
                            String orientador = s.next();
                            System.out.println("Co-orientador: ");
                            String coOrientador = s.next();
                            System.out.println("Data de postagem: ");
                            String data_postagem = s.next();
                            System.out.println("Palavras-chave: ");
                            String palavras_chave = s.next();
                            System.out.println("Resumo: ");
                            String resumo = s.next();
                            System.out.println("Area: ");
                            String area = s.next();
                            System.out.println("Caminho do PDF: ");
                            String caminhoPDF = s.next();
                            POC p = new POC(titulo, lista_de_autores, orientador, coOrientador, data_postagem, palavras_chave, resumo, area, caminhoPDF);
                            Context.pocController.CadastrarPOC(p);
                        }
                        //PESQUISAR POC
                        else if(acao == 2){
                            Ip.opcaoPesquisa();
                            acao = s.nextInt();
                            if(acao==1){
                                System.out.println("Digite o nome do autor: ");
                                String autor = s.next();
                                Context.pocController.pesquisarAutor(Context.pocDAO.getPOC(), autor);

                            }else if(acao==2){
                                
                            }else if(acao == 3){
                                
                            }else if(acao == 4 ){
                                
                            }else if(acao == 5){
                                
                            }
                        }
                        //EDITAR POC
                        else if(acao == 3){
                            Ip.mostrarOpcao3();
                        }
                        //REMOVER POC
                        else if(acao==4){
                            Ip.mostrarOpcao4();
                        }
                        //MUDAR SENHA
                        else if(acao == 5){
                            Ip.mostrarOpcao5();
                        }
                        //VOLTAR
                        else if(acao == 6){
                            this.mostrarOpcaoLogar();
                        }
                        else{
                            System.out.println("opcao invalida!!!");
                        }

                    } else {
                        System.out.println("Professor não cadastrado.");
                    }
                }
                //ADMINISTRADOR
                else if(opcao == 3){
                    break;
                }
                //VOLTAR
                else if(opcao == 4){
                    this.exibirInterface();
                }
                else{
                    System.out.println("Opcao invalida!!!");
                }
            }
            //CADASTRAR
            else if(opcao == 2){
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
                    System.out.print("O professor é ADMNISTRADOR:\n1.SIM | 2. NAO\n");
                    System.out.print("R=");
                    int opc = s.nextInt();
                    Professor b = new Professor(Nome, mat, senha, TipoUsuario.PROFESSOR, false);
                    if(opc == 1){
                        b.setIsAdm(true);
                    } 
                    if (Context.professorController.cadastrarProfessor(b) == true) {
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


