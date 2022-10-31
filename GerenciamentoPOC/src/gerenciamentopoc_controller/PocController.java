package gerenciamentopoc_controller;
import DAO.*;
import POC_model.Professor;

// TUDO ABAIXO DEVE SER POSSÍVEL FAZER APENAS SE FOR O PROFESSOR (EXCETO PESQUISAR!!!!!)
//todo: cadastrar poc
//todo: pesquisar poc  
//todo: editar
//todo: remover
// private String titulo;
//     private String[] lista_de_autores;
//     private String data_postagem;
//     private String[] palavras_chave;
//     private String resumo;
//     private String area;
//     private String caminhoPDF;


public class PocController extends Professor{
    
    
    //Aqui acho interesante saber qual professora vai cadastras/editar/remover o poc
    public PocController(String nome, int matricula, String senha, String email, String telefone, String endereco) {
        super(nome, matricula, senha, email, telefone, endereco);
        //TODO Auto-generated constructor stub
    }


    /*public void cadastrarPoc(poc novoPoc){
        

        
        armazenarPoc(novoPoc);
    }*/

    public void editarPoc(){

    }

    public void removerPoc(){

    }

    public void pesquisarPoc(){

    }


}

