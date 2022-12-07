import Model.Aluno;
import Model.Professor;
import static Model.TipoUsuario.ALUNO;
import static Model.TipoUsuario.PROFESSOR;
import Model.POC;
import java.time.LocalDate;
import java.time.Month;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
        Aluno a = new Aluno("", "EF15345","curso", ALUNO);
        assertFalse(a.matriculaValida());        
    }
    
    @Test
    public void teste2(){
        Aluno a = new Aluno("nome joao vieira gonçalves","EV04229","curso", ALUNO);
        assertTrue(a.matriculaValida());        
    }    
    
    
    @Test
    public void teste3(){
        Aluno a = new Aluno("nome","EF12345","curso", PROFESSOR);
        assertFalse(a.matriculaValida());        

    }    
    
    @Test
    public void teste4(){
        Professor p = new Professor("lucas Andradé louça", "EF11345","curso", PROFESSOR, true);
        assertTrue(p.matriculaValida());        
    }    
    
    @Test
    public void teste5(){
        Professor p = new Professor("nome", "EF22345","curso", PROFESSOR, true);
        assertTrue(p.matriculaValida());        
    }
    
    @Test
    public void teste6(){
        Professor p = new Professor("nome", "12345","curso", ALUNO, true);
        assertFalse(p.matriculaValida());        
    } 
    
    @Test 
    public void teste7(){
        Aluno a = new Aluno("luís cardoso", "EF09876", "senha", ALUNO);
        assertTrue(a.matriculaValida());
    }
    
    @Test
    public void teste8(){
        POC p = new POC("Meu Póc", "joao firmino silvio", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "corda sonho", "dfsadfdsa sdfsadf", "computação", "www.www.www", "joao");
        assertTrue(p.pocValido());
    }
    
    @Test
    public void teste9(){
        POC p = new POC("132 formas", "joao firmino silvio", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "corda sonho", "dfsadfdsa sdfsadf", "computação", "www.www.www", "joao");
        assertTrue(p.pocValido());
    }
    
    @Test
    public void teste10(){
        POC p = new POC("Meu Póc", "", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "corda sonho", "dfsadfdsa sdfsadf", "computação", "www.www.www", "joao");
        assertFalse(p.pocValido());
    }
    
    @Test
    public void teste11(){
        POC p = new POC("Meu Póc", "marcos roberto joao", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "", "dfsadfdsa sdfsadf", "computação", "www.www.www", "joao");
        assertFalse(p.pocValido());
    }
    
    @Test
    public void teste12(){
        POC p = new POC("Meu Póc", "tabata ronaldo Ricardo", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "corda sonho", "45455346543", "computação", "www.www.www", "joao");
        assertTrue(p.pocValido());
    }
    
    @Test
    public void teste13(){
        POC p = new POC("Meu Póc", "", "marcelo", "mirela", 
                LocalDate.of(2022, Month.MARCH, 22), "corda sonho", "dfsadfdsa sdfsadf", "computação", "www.www.www", "joao");
        assertFalse(p.pocValido());
    }
    
    @Test
    public void teste14(){
        POC p = new POC("Meu Trabalho", "michele antonio marcos", "marcelo", "mirela", 
                LocalDate.of(2022, Month.APRIL, 26), "corda sonho algoritmo", "dfsadfdsa sdfsadf", "computação", "www.www.www", "jorge");
        assertTrue(p.pocValido());
    }
}
