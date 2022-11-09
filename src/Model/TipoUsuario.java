package Model;

/**
 *
 */
public enum TipoUsuario {
    PROFESSOR("Professor"),
    ALUNO("Aluno");

    final String string;

    TipoUsuario(String string) {
        this.string = string;
    }
}
