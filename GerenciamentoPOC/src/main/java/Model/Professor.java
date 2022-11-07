
package Model;

/**
 *
 */
public class Professor extends Usuario{
    
    private boolean isAdm;

    public Professor(String nome, String matricula, String senha, TipoUsuario tipo, boolean isAdm) {
        super(nome, matricula, senha, tipo);
        this.isAdm = isAdm;
    }
    

    public boolean isAdm() {
        return isAdm;
    }

    public void setIsAdm(boolean isAdm) {
        this.isAdm = isAdm;
    }
    
}
