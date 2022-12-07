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
package Controller;

import DAO.Context;
import Model.POC;


/**
 *
 */
public class POCController {
    
    public void CadastrarPOC(POC a){
        //Verificar se todos os atributos do POC sao validos
        if (a.pocValido()){
            //Chamar o DAO do POC para adicionar-lo
            if(Context.pocDAO.procuraPOC(a) == null){ // verificando se esse poc ja foi cadastrado
                Context.pocDAO.adicionarPOC(a);
            }
            else{
                System.out.println("POC Cadastrado!!!");
            }
        }
    }

}