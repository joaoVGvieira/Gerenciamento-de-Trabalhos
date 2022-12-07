
package Model;

/**
 *
 */
public class Aluno extends Usuario{
    
    
    public Aluno(String nome, String matricula, String senha, TipoUsuario tipo){
        super(nome, matricula, senha, tipo);
    }

    @Override
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
    
    @Override
    public String toString(){        
        return "Nome " + this.getNome() + "\n" + "Matricula " + this.getMatricula() + "\n" + "Tipo " + getTipo().string + "\n";
    }

    
}
