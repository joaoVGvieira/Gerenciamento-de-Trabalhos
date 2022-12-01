package Model;

/**
 *
 */
public enum TipoUsuario {
    PROFESSOR("Professor"),
    ALUNO("Aluno");

    public final String string;

    TipoUsuario(String string) {
        this.string = string;
    }
}
