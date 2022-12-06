
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

    
}