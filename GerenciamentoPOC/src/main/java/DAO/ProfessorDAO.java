/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Professor;
import java.util.ArrayList;

/**
 *
 */
public class ProfessorDAO {
    private ArrayList<Professor> professores;
    
    public ProfessorDAO(){
        professores = new ArrayList<>();
    }
    
    public void adicionarProfessor(Professor p){
        //verificar se o professor ja existe, se nao adicionar
        professores.add(p);
    }
    public ArrayList<Professor> listarProfessores(){
        return this.professores;
    }
}
