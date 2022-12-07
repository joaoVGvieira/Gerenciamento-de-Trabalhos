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

public class Conexao {
               public static String status = "Não conectou...";

//Método Construtor da Classe//

        public Conexao() {

    }



//Método de Conexão//

public static Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection



try {

// Carregando o JDBC Driver padrão

String driverName = "com.mysql.cj.jdbc.Driver";

Class.forName(driverName);
    


// Configurando a nossa conexão com um banco de dados//

        String serverName = "localhost";    //caminho do servidor do BD

        String mydatabase ="get_poc";        //nome do seu banco de dados

        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";        //nome de um usuário de seu BD

        String password = "";      //sua senha de acesso

        connection = DriverManager.getConnection(url, username, password);



        //Testa sua conexão//

        if (connection != null) {

            status = ("STATUS--->Conectado com sucesso!");
            
        } else {

            status = ("STATUS--->Não foi possivel realizar conexão");
            

        }



        return connection;



        } catch (ClassNotFoundException e) {  //Driver não encontrado



            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

//Não conseguindo se conectar ao banco

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }


}



}
