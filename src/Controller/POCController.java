
package Controller;

import DAO.Context;
import Model.POC;


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
        else{
            System.out.println("POC Cadastrado!!!");
        }
    }

}