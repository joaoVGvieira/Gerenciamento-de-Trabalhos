
package Model;

import java.util.regex.Pattern;

/**
 *
 */
public class Aluno extends Usuario{
    
    
    public Aluno(String nome, String matricula, String senha, TipoUsuario tipo){
        super(nome, matricula, senha, tipo);
    }


    
    @Override
    public String toString(){        
        return "Nome " + getNome()+ "\n" + "Matricula " + getMatricula() + "\n" + "Tipo " + getTipo().string + "\n";
    }

    @Override
    public boolean matriculaValida() {
        return ((getNome().matches("^[a-zA-Z \\s]*$")) && getNome().length() !=0 && (getMatricula().matches("E[F|V]\\d\\d\\d\\d\\d")) 
            && (getTipo().equals(TipoUsuario.ALUNO)));
    }    
    
}