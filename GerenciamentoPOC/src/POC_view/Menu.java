/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POC_view;

/**
 *
 * @author cleid
 */
import java.util.Scanner;
import POC_model.*;
public class Menu {
    private int escolha;
    
    
    public Menu(){
        int choice;
        Scanner scan =new Scanner(System.in);
        System.out.println("escolha um  item");
        System.out.println("1-cadastro");
        System.out.println("outro-sair");
        choice=scan.nextInt();
        switch (choice) {
            case 1:
                //Usuario user = new Usuario();
                System.out.println("cadastro de aluno ou professor");
                break;
            default:
                throw new AssertionError();
        }
        
    }
}