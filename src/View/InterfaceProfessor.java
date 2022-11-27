
package View;

//TODO interface que aparecera para o professor 

import DAO.Context;
import Model.Aluno;
import Model.POC;
import Model.Professor;
import Model.TipoUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceProfessor {
    
    public void mostrarOpcaoProfessor(){
        System.out.println("----- Opcoes do Professor -----");
        System.out.println("1- Cadastrar POC");
        System.out.println("2- Pesquisar POC");
        System.out.println("3- Editar POC");
        System.out.println("4- Remover POC");
        System.out.println("5- Mudar senha de usuario");
        System.out.println("6- Voltar");
        System.out.println("-------------------------------");
    }
    
    public void Opcao1(){ //TODO
        Scanner s = new Scanner(System.in);
        s.nextLine();
        System.out.println("Titulo: ");
        String titulo = s.nextLine();
        System.out.println("Lista de autores: ");
        String lista_de_autores = s.nextLine();
        System.out.println("Orientador: ");
        String orientador = s.next();
        s.nextLine();
        System.out.println("Co-orientador: ");
        String coOrientador = s.next();
        s.nextLine();
        System.out.println("Data de postagem(dd/mm/yyyy): ");
        int data_postagem = s.nextInt();
        s.nextLine();
        System.out.println("Palavras-chave: ");
        String palavras_chave = s.nextLine();
        //s.nextLine();
        System.out.println("Resumo: ");
        String resumo = s.nextLine();
        //s.nextLine();
        System.out.println("Area: ");
        String area = s.next();
        s.nextLine();
        System.out.println("Caminho do PDF: ");
        String caminhoPDF = s.next();
        s.nextLine();

        int dia = Integer.parseInt(Integer.toString(data_postagem).substring(0, 2));
        int mes = Integer.parseInt(Integer.toString(data_postagem).substring(3, 5));
        int ano = Integer.parseInt(Integer.toString(data_postagem).substring(6, 10));
        
        POC p = new POC(titulo, lista_de_autores, orientador, coOrientador, LocalDate.of(ano, mes, dia) , palavras_chave, resumo, area, caminhoPDF);
        Context.pocController.CadastrarPOC(p);
    
    }
    
    public void Opcao2(){ //TODO
        Scanner s = new Scanner(System.in);
        int acao;
        do{
            this.opcaoPesquisa();
            acao = this.lerOpcao();
            //AUTHOR
            if (acao == 1) {
                System.out.println("Digite o nome do autor: ");
                String autores = s.next();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAutor(autores);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
                
            }

            //ORIENTADOR
            else if (acao == 2) {
                System.out.println("Digite o nome do orientador: ");
                String orientadorr = s.next();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAutor(orientadorr);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
            
            //RESUMO
            } else if (acao == 3) {
                System.out.println("Digite o resumo: ");
                String resumoo = s.next();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAutor(resumoo);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
            

            //AREA  
            } else if (acao == 4) {
                System.out.println("Digite a area: ");
                String areaa = s.next();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAutor(areaa);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
            }
            //TITULO
            else if (acao == 5) {
                System.out.println("Digite o titulo: ");
                String tituloo = s.next();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAutor(tituloo);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
            }   
            //ANO
            else if (acao == 6) {
                System.out.println("Digite o ano: ");
                int anoo = s.nextInt();
                ArrayList<POC> resultado = Context.pocDAO.pesquisarAno(anoo);

                if(resultado.size() == 0){
                    System.out.println("Nenhum resultado encontrado");
                }
                else{
                    for(POC p : resultado){
                        p.printar();
                    }
                }
            }
            else if (acao == 7) {
                break;
            } else {
                System.out.println("Opcao Invalida!!!");
            }

        } while (acao != 7);
        

    }
    
    public void opcaoPesquisa(){ 
        System.out.println("-------------------------------");
        System.out.println("1- Pesquisar por Autores");
        System.out.println("2- Pesquisar por Orientador");
        System.out.println("3- Pesquisar por resumo");
        System.out.println("4- Pesquisar por Area");
        System.out.println("5- Pesquisar por Título");
        System.out.println("6- Pesquisar por Ano");
        System.out.println("7- Voltar");
        System.out.println("-------------------------------");
        
    }
    
    public void mostrarOpcao3(){ //TODO
        
    }
    
    public void mostrarOpcao4(){ //TODO
        
    }
    public void mostrarOpcao5(){ //TODO
        
    }
    
    public Professor lerLoginProfessor(){
        Scanner s = new Scanner(System.in);
        System.out.print("Matricula: ");
        String mat = s.next();
        System.out.print("Senha: ");
        String senha = s.next();
        Professor b = new Professor(null, mat, senha, TipoUsuario.PROFESSOR, true);
        return b;
    }
    
    public int lerOpcao(){
        int opcao;
        Scanner s = new Scanner(System.in);
        opcao = s.nextInt();
        return opcao;
    }
    
    public Professor cadastrarProfessor(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        String Nome = s.next();
        System.out.print("Matricula: ");
        String mat = s.next();
        System.out.print("Senha: ");
        String senha = s.next();
        System.out.print("O professor é ADMNISTRADOR:\n1.SIM | 2. NAO\n");
        System.out.print("R=");
        int opc = this.lerOpcao();
        Professor b = new Professor(Nome, mat, senha, TipoUsuario.PROFESSOR, false);
        if (opc == 1) {
            b.setIsAdm(true);
        }
        return b;
        
    }
}