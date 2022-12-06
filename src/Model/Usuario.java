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


    public boolean matriculaValida() {
        
        try {
            if (getNome().matches("^[a-zA-Z-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ \\s]*$") && getNome().length() != 0 && (getMatricula().matches("E[F|V]\\d\\d\\d\\d\\d")) && (getTipo().equals(TipoUsuario.ALUNO))) {
                return true;
            }else{
                throw new IllegalArgumentException("Matricula invalida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return false; 
    }    
        
    
}
