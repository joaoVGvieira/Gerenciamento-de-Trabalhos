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
    
    public void mostrarOpcao1(){ // Pesquisar POC
        System.out.println("1- Pesquisar por Autores");
        System.out.println("2- Pesquisar por Orientador");
        System.out.println("3- Pesquisar por Co-Orientador");
        System.out.println("4- Pesquisar por Data");
        System.out.println("5- Pesquisar por Palavras Chave");
        System.out.println("6- Pesquisar por Area");
    }
    
    public void mostrarOpcao2(Aluno alunoLogado){ // Informações do Aluno
        System.out.println("Nome: " + alunoLogado.getNome());
        System.out.println("Matricula: ");
        System.out.println("Senha: ");
    }
    
    public void mostrarOpcao3(){ // Trocar senha
        //TODO digitar senha antiga para poder trocar para nova
    }
}