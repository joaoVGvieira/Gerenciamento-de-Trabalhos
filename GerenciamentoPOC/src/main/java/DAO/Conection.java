/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author cleid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conection {
    public static String status="nao conectado";
    
    public Conection(){
        
    }
    
    public static java.sql.Connection getConectionMysql(){
        Connection conexao = null;
        
        try{
            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);
            
            String serverName = "127.0.0.1";
            String mydatabase = "get_poc" ;
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            
            String username = "root";        

            String password = ""; 
            
            conexao = DriverManager.getConnection(url, username, password);
            if (conexao != null) {

            status = ("STATUS--->Conectado com sucesso!");

            } else {

            status = ("STATUS--->Não foi possivel realizar conexão");

            }
            
            return conexao;
            
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }
    }
    
    public static String statusConexao(){
        return status;
    }
    

    
    
}
