
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
        System.out.println("5- Voltar");
        System.out.println("-------------------------------");
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

    public void opcaoAlterarPOC(){
        System.out.println("-------------------------------");
        System.out.println("1 - Alterar Autores");
        System.out.println("2 - Alterar Orientador");
        System.out.println("3 - Alterar resumo");
        System.out.println("4 - Alterar Area");
        System.out.println("5 - Alterar Título");
        System.out.println("6 - Alterar Data-Postagem");
        System.out.println("7 - Alterar Co-Orientador");
        System.out.println("8 - Alterar Palavras-Chave");
        System.out.println("9 - Alterar Caminho PDF");
        System.out.println("10 - Voltar");
        System.out.println("-------------------------------");
    }
    
    public void cadastrarPOC(){ //TODO
        Scanner s = new Scanner(System.in);
        //s.nextLine();
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
        String data_postagem = s.next();
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

        String usuarioCadastro = Context.professorLogado.getMatricula();

        int dia = Integer.parseInt(data_postagem.substring(0, 2));
        int mes = Integer.parseInt(data_postagem.substring(3, 5));
        int ano = Integer.parseInt(data_postagem.substring(6, 10));
        
        POC p = new POC(titulo, lista_de_autores, orientador, coOrientador, LocalDate.of(ano, mes, dia) , palavras_chave, resumo, area, caminhoPDF, usuarioCadastro);
        Context.pocController.CadastrarPOC(p);
    
    }
    
    public void pesquisarPOC(){ //TODO
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
                ArrayList<POC> resultado = Context.pocDAO.pesquisarOrientador(orientadorr);

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
                ArrayList<POC> resultado = Context.pocDAO.pesquisarResumo(resumoo);

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
                ArrayList<POC> resultado = Context.pocDAO.pesquisarArea(areaa);

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
                ArrayList<POC> resultado = Context.pocDAO.pesquisarTitulo(tituloo);

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
    
    
    
    public void editarPOC(){ //TODO
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Titulo do POC que deseja alterar: ");
        String tituloAlt = s.next();
        System.out.println("Digite o ano da postagem da POC que deseja alterar: ");
        int ano_postagem = s.nextInt();

        ArrayList<POC> resultadoTitulo = Context.pocDAO.pesquisarTitulo(tituloAlt);
        ArrayList<POC> resultadoAno = Context.pocDAO.pesquisarAno(ano_postagem);

        POC alteracao = null;
        int encontrada = 0;
        for(POC p1 :resultadoTitulo){
            for(POC p2 : resultadoAno){
                if(p1 == p2){
                    System.out.println("POC encontrada");
                    p1.printar();
                    alteracao = p1;
                    encontrada = 1;
                }
                
            }
        }
        if(encontrada == 0){
            System.out.println("POC não encontrada");
            return;
        }
        
        int acao;
        do{
            this.opcaoAlterarPOC();
            acao = this.lerOpcao();
            
            //AUTHOR
            if (acao == 1) {
                System.out.println("Digite os novos nomes dos autores: ");
                String autores = s.next();
                alteracao.setListaDeAutores(autores);
                System.out.println("Alteração realizada com sucesso");                
            }

            //ORIENTADOR
            else if (acao == 2) {
                System.out.println("Digite o nome do novo orientador: ");
                String orientador = s.next();
                alteracao.setOrientador(orientador);
                System.out.println("Alteração realizada com sucesso");    
            
            //RESUMO
            } else if (acao == 3) {
                System.out.println("Digite o novo resumo: ");
                String resumo = s.next();
                alteracao.setResumo(resumo);
                System.out.println("Alteração realizada com sucesso");

            //AREA  
            } else if (acao == 4) {
                System.out.println("Digite a nova área da POC: ");
                String area = s.next();
                alteracao.setArea(area);
                System.out.println("Alteração realizada com sucesso");
            }
            //TITULO
            else if (acao == 5) {
                System.out.println("Digite o novo titulo da POC: ");
                String titulo = s.next();
                alteracao.setTitulo(titulo);
                System.out.println("Alteração realizada com sucesso");
            }   
            //ANO
            else if (acao == 6) {
                System.out.println("Digite a nova data do POC(dd/mm/yyyy): ");
                String novaData = s.next();
                s.nextLine();
                int dia = Integer.parseInt(novaData.substring(0, 2));
                int mes = Integer.parseInt(novaData.substring(3, 5));
                int ano = Integer.parseInt(novaData.substring(6, 10));
                LocalDate dataNova = LocalDate.of(ano, mes, dia);
                alteracao.setDataPostagem(dataNova);
                System.out.println("Alteração realizada com sucesso");
            }
            //CO-ORIENTADOR
            else if(acao == 7){
                System.out.println("Digite o novo co-orientador da POC: ");
                String coorientador = s.next();
                alteracao.setCoOrientador(coorientador);
                System.out.println("Alteração realizada com sucesso");
                
            }
            //PALAVRAS-CHAVE
            else if(acao == 8){
                System.out.println("Digite as novas palavras-chave da POC: ");
                String palavrasChave = s.next();
                alteracao.setPalavrasChave(palavrasChave);
                System.out.println("Alteração realizada com sucesso");
                
            }
            //CAMINHO PDF
            else if(acao == 9){
                System.out.println("Digite o novo caminho do PDF da POC: ");
                String caminhoPDF = s.next();
                alteracao.setCaminhoPDF(caminhoPDF);
                System.out.println("Alteração realizada com sucesso");
                
            }
            else if (acao == 10) {
                break;
            } else {
                System.out.println("Opcao Invalida!!!");
            }

        } while (acao != 10);
    }
    
    public void removerPOC(){ //TODO
        if(Context.pocDAO.getPOC() == null){
            System.out.println("Nao ha POCs cadastrados");
        }
        else{
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o titulo do POC que deseja remover: ");
            String titulo = s.next();
            Context.pocDAO.removerPOC(titulo);
        }
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