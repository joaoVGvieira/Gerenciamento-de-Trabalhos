package PRINCIPAL;

import gerenciamentopoc_controller.*;
import POC_model.*;
import POC_view.*;

public class main {

    public static void main(String[] args) {
        Aluno alu;
        alu = new Aluno();
        alu.Cadastrar_aluno();
        alu.imprimir_aluno();
    }
    
}

