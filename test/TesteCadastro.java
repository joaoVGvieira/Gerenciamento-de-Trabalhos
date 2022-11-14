import Model.Aluno;
import Model.Professor;
import static Model.TipoUsuario.ALUNO;
import static Model.TipoUsuario.PROFESSOR;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.Test;

/**
 *
 * @author juan_
 */
public class TesteCadastro {
   
    public TesteCadastro(){    
    }
    
    @Test
    public void teste1(){
        Aluno a = new Aluno("nome", "EF12345","curso", ALUNO);
        assertFalse(a.matriculaValida());        
    }
    
    @Test
    public void teste2(){
        Aluno a = new Aluno("nome","12345","curso", ALUNO);
        assertTrue(a.matriculaValida());        
    }    
    
    
    @Test
    public void teste3(){
        Aluno a = new Aluno("nome","12345","curso", PROFESSOR);
        assertFalse(a.matriculaValida());        

    }    
    
    @Test
    public void teste4(){
        Professor p = new Professor("nome", "EF12345","curso", PROFESSOR, true);
        assertFalse(p.matriculaValida());        
    }    
    
    @Test
    public void teste5(){
        Professor p = new Professor("nome", "12345","curso", PROFESSOR, true);
        assertTrue(p.matriculaValida());        
    }
    
    @Test
    public void teste6(){
        Professor p = new Professor("nome", "12345","curso", ALUNO, true);
        assertFalse(p.matriculaValida());        
    } 
}
