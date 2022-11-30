package MainGetPoc;

import DAO.Context;
import Model.Aluno;
import Model.POC;
import Model.Professor;
import Model.TipoUsuario;
import View.InterfacePrincipal;
import java.time.LocalDate;

/**
 *
 */
public class GetPoc {

    public static void main(String[] args) {
        InterfacePrincipal i = new InterfacePrincipal();
        
        
        Aluno b = new Aluno("Cleidimar", "EF03473","passos", TipoUsuario.ALUNO);
        Context.alunoDAO.adicionarAluno(b);

        Aluno c = new Aluno("João", "EF04212","vieira", TipoUsuario.ALUNO);
        Context.alunoDAO.adicionarAluno(c);

        Aluno a = new Aluno("Juan", "EF04229","avelar", TipoUsuario.ALUNO);
        Context.alunoDAO.adicionarAluno(a);

        Professor d = new Professor("Leonardo", "EF04702","aguiar", TipoUsuario.PROFESSOR, true);
        Context.professorDAO.adicionarProfessor(d);
        
        Professor e = new Professor("Vinícius", "EF04242","ferreira", TipoUsuario.PROFESSOR, true);
        Context.professorDAO.adicionarProfessor(e);

        
        POC p = new POC("Titulo1", "Autor1 Autor2", "Fabricio", "Daniel", 
                LocalDate.of(2022, 01, 01), "Primeiro POC","ABW", "CDC", "KJNJFDJHNJÇKJ", "inicial");
        Context.pocController.CadastrarPOC(p);

        POC q = new POC("Titulo2", "Autor2 Autor3", "Daniel", "Thais", 
                LocalDate.of(2022, 01, 03), "Segundo POC","wba", "COMPUTAÇÃO", "KJNJFDJHNJJFHUHHÇKJ", "inicial");
        Context.pocController.CadastrarPOC(q);

        POC s = new POC("Titulo3", "Autor3 Autor1", "Fabricio", "Marcus", 
                LocalDate.of(2022, 11, 26), "Terceiro POC","ABWjhbjhb", "EXATAS", "KJkldsjfiuhdfiNJFDJHNJÇKJ", "inicial");
        Context.pocController.CadastrarPOC(s);



        i.exibirInterface();
    }
}
