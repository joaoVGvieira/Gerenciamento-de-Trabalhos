package POC_model;

public class Administrador extends Usuario {

    public Administrador(String nome, int matricula, String senha) {
        super(nome, matricula, senha);
        this.nivel= Tipo.tipo.Administrador;
    }

    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setSenha(String senha) {
        super.setSenha(senha);
    }

}
