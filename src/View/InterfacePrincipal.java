package View;

import DAO.Context;

/**
 *
 */
public class InterfacePrincipal {

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
                                Ip.pesquisarPOC();
                            }else if(acao == 2){                                
                                i.mostrarOpcao2(Context.alunoLogado);
                            }else if(acao == 3 ){
                                break;
                            }
                            else{
                                System.out.println("Opcao Invalida!!!");
                            }
                        }while(acao!=3);
                        
                    } else {
                        try {
                            throw new Exception("Login e/ou senha incorretos");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                }
                //PROFESSOR 
                else if (opcao == 2) {
                    Context.professorLogado = Context.professorController.logar(Ip.lerLoginProfessor());
                    if (Context.professorLogado != null) {
                            if(Context.professorLogado.isAdm()){
                                do {
                                    Ip.mostrarOpcaoProfessorAdmintrador();
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
                                       //EDITAR USUARIO
                                       else if(acao == 5){
                                           Ip.editarUsuarios();
                                       }//VOLTAR
                                       else if(acao == 6){
                                          
                                       }//VOLTAR
                                        
                                        else{
                                            System.out.println("opcao invalida!!!");
                                        }
                                } while (acao!=6);
                                    
                            }else{
                                do {
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
                               //VOLTAR
                               else if(acao == 5){
                                   break;
                               }
                               else{
                                   System.out.println("opcao invalida!!!");
                               } 
                                } while (acao!=5);                              
                            }
                    }
                    else {
                        try {
                            throw new Exception("Login e/ou senha incorretos");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
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


