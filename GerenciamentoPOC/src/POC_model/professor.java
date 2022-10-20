package POC_model;


public class professor extends Usuario{
    
    String email;
    String telefone;
    String endereco;

    public professor(String nome, int matricula, String senha, String email, String telefone, String endereco){

        //super(nome, matricula, senha);

        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    
    public void poc_cadastrar(String titulo, String lista_de_autores,String data_postagem, String palavras_chave, String resumo, String area, String caminhoPDF){
        poc POC = new poc (titulo, lista_de_autores, data_postagem, palavras_chave, resumo, area, caminhoPDF);


    }



}

