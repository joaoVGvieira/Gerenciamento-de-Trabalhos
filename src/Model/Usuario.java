package Model;

/**
 *
 */
public abstract class Usuario {

    private String nome;
    private String matricula;
    private String senha;
    private TipoUsuario tipo;

    public Usuario(String nome, String matricula, String senha, TipoUsuario tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    public abstract boolean matriculaValida();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
