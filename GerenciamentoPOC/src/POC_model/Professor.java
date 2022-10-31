package POC_model;


public class Professor extends Usuario{
    
    private String email;
    private String telefone;
    private String endereco;
    public Professor(String nome, int matricula, String senha, String email, String telefone, String endereco) {
        super(nome, matricula, senha);
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void poc_cadastrar(String titulo, String lista_de_autores,String data_postagem, String palavras_chave, String resumo, String area, String caminhoPDF){
        //poc POC = new poc (titulo, lista_de_autores, data_postagem, palavras_chave, resumo, area, caminhoPDF);


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

