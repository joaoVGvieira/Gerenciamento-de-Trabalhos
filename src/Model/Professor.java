/*
--- UFV - Ciência da Computação ---
Disciplina{ 
    CCF 313 - Programação Orientada a Objetos
    }	
Professor{ 
    Fabrício Silva
    }
Alunos{
    Cleidimar L. dos Passos - [EF03473]
    João Vitor G. Vieira - [EF04212]
    Juan Pablo A. Avelar - [EF04229]
    Leonardo Araujo R. Aguiar - [EF04702]
    Vinicius Augusto A. Ferreira -  [EF04242]
    }
*/
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