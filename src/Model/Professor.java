
package Model;

import java.util.regex.Pattern;

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
    public boolean matriculaValida() {

        try {
            if (getNome().matches("^[a-zA-Z-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ \\s]*$") && getNome().length() != 0 && (getMatricula().matches("E[F|V]\\d\\d\\d\\d\\d")) && (getTipo().equals(TipoUsuario.PROFESSOR))) {
                return true;
            }else{
                throw new IllegalArgumentException("Matricula invalida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return false; 
    } 
    
    
    @Override
    public String toString(){  
        if(isAdm){
            return "Nome " + getNome()+ "\n" + "Matricula " + getMatricula() + "\n" + "Tipo " + getTipo().string + "\n" + "É admininistrador\n";
        }
        return "Nome " + getNome()+ "\n" + "Matricula " + getMatricula() + "\n" + "Tipo " + getTipo().string + "\n" + "Não é administrador";
    }
    
    
}