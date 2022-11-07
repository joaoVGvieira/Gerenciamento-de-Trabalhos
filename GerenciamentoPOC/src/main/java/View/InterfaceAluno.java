package View;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import java.util.Scanner;

public class InterfaceAluno {
    
    public void mostrarOpcaoAluno(){
        System.out.println("----- Opcoes do Aluno -----");
        System.out.println("1- Pesquisar POC");
        System.out.println("2- Informações do aluno");
        System.out.println("3- Trocar a senha");
        System.out.println("---------------------------");
    }
    
    public void mostrarOpcao1(){
        System.out.println("");
    }
    
    public void mostrarOpcao2(Aluno alunoLogado){
        System.out.println("Nome: " + alunoLogado.getNome());
        System.out.println("Matricula: ");
        System.out.println("Senha: ");
    }
}
