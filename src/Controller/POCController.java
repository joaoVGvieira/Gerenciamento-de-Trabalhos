
package Controller;

import DAO.Context;
import Model.POC;
import Model.TipoUsuario;
import Model.Usuario;
import Model.Aluno;


/**
 *
 */
public class POCController {
    
    public void CadastrarPOC(POC a){
        //Verificar se todos os atributos do POC sao validos
        //Chamar o DAO do POC para adicionar-lo
        if(Context.pocDAO.procuraPOC(a) == null){ // verificando se esse poc ja foi cadastrado
            Context.pocDAO.adicionarPOC(a);
        }
    }

    public void pesquisarAutor(POC a, String autor){
        for(int i = 0; i < a.getLista_de_autores().length; i++){
            if(a.getLista_de_autores().equals(autor)){
                System.out.println(a);
            }
            else{
                System.out.println("POC com autor não encontrado");
            }
        }
    }
    public void pesquisarOrientador(POC a, String orientador){
        if(a.getOrientador().equals(orientador)){
            System.out.println(a);
        }
        else{
            System.out.println("POC com orientador não encontrado");
        }
    }
    public void pesquisarResumo(POC a, String resumo){
        if(a.getResumo().equals(resumo)){
            System.out.println(a);
        }
        else{
            System.out.println("POC com resumo não encontrado");
        }
    }
    public void pesquisarArea(POC a, String area){
        if(a.getArea().equals(area)){
            System.out.println(a);
        }
        else{
            System.out.println("POC com area não encontrado");
        }
    }
    public void pesquisarTitulo(POC a, String titulo){
        if(a.getTitulo().equals(titulo)){
            System.out.println(a);
        }
        else{
            System.out.println("POC com titulo não encontrado");
        }
    }
    public void pesquisarAno(POC a, String ano){
        if(a.getData_postagem().equals(ano)){
            System.out.println(a);
        }
        else{
            System.out.println("POC com ano não encontrado");
        }
    }

}