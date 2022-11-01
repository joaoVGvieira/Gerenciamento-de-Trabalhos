/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.getpoc;

import DAO.Context;
import Model.Aluno;
import Model.TipoUsuario;
import View.Interface;

/**
 *
 */
public class GetPoc {

    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", "joao", "1234", 3861, TipoUsuario.ALUNO);
        Context.alunoController.cadastrarAluno(a);
        Interface i = new Interface();
        i.exibirInterface();
    }
}
