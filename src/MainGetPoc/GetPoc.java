package MainGetPoc;

import DAO.Context;
import Model.Aluno;
import Model.POC;
import Model.Professor;
import Model.TipoUsuario;
import View.InterfaceLogar;

/**
 *
 */
public class GetPoc {

    public static void main(String[] args) {
        InterfaceLogar i = new InterfaceLogar();
        
        
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
                "01012022", "Primeiro POC","ABW", "CDC", "KJNJFDJHNJÇKJ");
        Context.pocController.CadastrarPOC(p);

        POC q = new POC("Titulo2", "Autor2 Autor3", "Daniel", "Thais", 
                "03012022", "Segundo POC","wba", "COMPUTAÇÃO", "KJNJFDJHNJJFHUHHÇKJ");
        Context.pocController.CadastrarPOC(q);

        POC s = new POC("Titulo3", "Autor3 Autor1", "Fabricio", "Marcus", 
                "26112022", "Terceiro POC","ABWjhbjhb", "EXATAS", "KJkldsjfiuhdfiNJFDJHNJÇKJ");
        Context.pocController.CadastrarPOC(s);



        i.exibirInterface();
    }
}
