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
            if(opcao == 1 || opcao == 2){
                if(opcao == 1){
                    System.out.println("Matricula:");
                }
            }
            else{
                System.out.println("Opcao Invalida!!!");
            }
        }
    }

}



