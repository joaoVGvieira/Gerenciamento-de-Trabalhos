package POC_model;
public class Usuario {
    

    protected String nome;

    protected int matricula;

    protected String senha;

    protected Tipo.tipo nivel;

    //Construtor
    public Usuario(String nome, int matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }


    // Aqui nao sei se faz sentido ter get e set senha sentido ter get e set senha, mas optei pq caso hava um cadastro o usuario posso digitar pelo terminal.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
