
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
    
    @Override
    public String toString(){  
        if(isAdm){
            return "Nome " + getNome()+ "\n" + "Matricula " + getMatricula() + "\n" + "Tipo " + getTipo().string + "\n" + "É admininistrador\n";
        }
        return "Nome " + getNome()+ "\n" + "Matricula " + getMatricula() + "\n" + "Tipo " + getTipo().string + "\n" + "Não é administrador";
    }
    
}