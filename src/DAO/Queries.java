/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.*;

import java.util.ArrayList;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author cleid
 */
public class Queries {
    
    private boolean done;
    
    public ArrayList getProfessorestb() throws SQLException{
        Professor aux;
        ArrayList<Professor> professores = new ArrayList<>();
        int cont = 1;
        Connection cn = Conexao.getConexaoMySQL();
        try (Statement brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE)) {
            ResultSet fdbk=brdg.executeQuery("SELECT * FROM professor");
            while(fdbk.absolute(cont)==true){
                aux=new Professor(fdbk.getString("nome"),fdbk.getString("matricula") , fdbk.getString("senha"), TipoUsuario.PROFESSOR, fdbk.getBoolean("e_ADM"));
                this.done = professores.add(aux);
                cont++;
            }
        }
        return professores;

    }
    
    public ArrayList getAlunostb() throws SQLException{
        Aluno aux;
        ArrayList<Aluno> alunos= new ArrayList<>();
        int cont = 1;
        Connection cn = Conexao.getConexaoMySQL();
        Statement brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
        ResultSet.CONCUR_UPDATABLE);
        
        ResultSet fdbk=brdg.executeQuery("SELECT * FROM aluno");
        while(fdbk.absolute(cont)){
            aux = new Aluno(fdbk.getString("nome"),fdbk.getString("matricula") , fdbk.getString("senha"), TipoUsuario.ALUNO);
            
            
            alunos.add(aux);
            
            cont++;
        }
        brdg.close();
        return alunos;

    }
    
    public ArrayList getPOCStb() throws SQLException{
        POC aux;
        ArrayList<POC> pocs = new ArrayList<>();
        int cont = 1;
        Connection cn = Conexao.getConexaoMySQL();
        Statement brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
        
            ResultSet fdbk=brdg.executeQuery("SELECT * FROM poc");
            while(fdbk.absolute(cont)){
                aux=new POC(fdbk.getString("titulo"), fdbk.getString("lista_autores"), fdbk.getString("orientador"),fdbk.getString("coorientador"),
                        fdbk.getDate("data_postagem").toLocalDate(), fdbk.getString("palavras_chave"), fdbk.getString("resumo"), fdbk.getString("area"),
                        fdbk.getString("caminho_PDF"), fdbk.getString("usuarioCadastro"));
                pocs.add(aux);
                
                cont++;
            }
            
            
        
        return pocs;

    }
    
    public boolean InsertProfessor(Professor pf){
        Connection cn = Conexao.getConexaoMySQL();
        if(!SearchMatriculaProfessor(pf.getMatricula())){
            try {
                Statement brdg = cn.createStatement();
                brdg.executeUpdate( "INSERT INTO professor(nome, matricula, senha, e_ADM) VALUES('"+pf.getNome()+"',"
                        + "'"+pf.getMatricula()+"','"+pf.getSenha()+"',"+pf.isAdm()+")");
                brdg.close();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("professor ja cadastrado");
        }
            
        return false;
    }

    public boolean InsertAluno(Aluno alu){
        Connection cn = Conexao.getConexaoMySQL();
        if(!SearchMatriculaAluno(alu.getMatricula())){
            try {
                System.out.println("><");
                Statement brdg = cn.createStatement();
                brdg.executeUpdate( "INSERT INTO aluno(nome, matricula, senha) VALUES('"+alu.getNome()+"',"
                        + "'"+alu.getMatricula()+"','"+alu.getSenha()+"')");
                brdg.close();
                return true;                        
            }catch (SQLException ex) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Aluno ja cadastrado!");
        }
        return false;
    }
    public boolean InsertPoc(POC p){
        Connection cn = Conexao.getConexaoMySQL();
        if(!SearchPocTitulo(p.getTitulo())){
            try {
            Statement brdg = cn.createStatement();
            
            brdg.executeUpdate( "INSERT INTO `poc`(`titulo`, `lista_autores`, `orientador`, `coorientador`,"
                    + " `data_postagem`, `palavras_chave`, `resumo`, `area`, `caminho_PDF`, `usuarioCadastro`) "
                    + "VALUES ('"+p.getTitulo()+"','"+p.getListaDeAutores()+"','"+p.getOrientador()+"','"+p.getCoOrientador()+"','"
                    +Date.valueOf(p.getDataPostagem())+"','"+String.join("-", p.getPalavrasChave())+
                    "','"+p.getResumo()+"','"+p.getArea()+"','"+p.caminhoPDF()+"','"+p.getUsuarioCadastro()+"')");
            brdg.close();
            return true;
            } catch (SQLException ex) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("POC com mesmo titulo ja cadastrado");
        }
        return false;
    }
    public boolean Deletepoc(String titulo){
        Connection cn = Conexao.getConexaoMySQL();
        try {
            Statement brdg = cn.createStatement();
            brdg.executeUpdate( "DELETE FROM poc WHERE titulo = '"+titulo+"'");
            brdg.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean Deletealuno(String matricula){
        Connection cn = Conexao.getConexaoMySQL();
        try {
            Statement brdg = cn.createStatement();
            brdg.executeUpdate( "DELETE FROM Aluno WHERE matricula = '"+matricula+"'");
            brdg.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean DeleteProfessor(String matricula){
        Connection cn = Conexao.getConexaoMySQL();
        try {
            Statement brdg = cn.createStatement();
            brdg.executeUpdate( "DELETE FROM professor WHERE matricula = '"+matricula+"'");
            brdg.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean SearchMatriculaAluno(String m ){
       
        
        Connection cn = Conexao.getConexaoMySQL();
        Statement brdg;
        try {
            brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet fdbk=brdg.executeQuery("SELECT * FROM aluno WHERE matricula='"+m+"'");
            if(!fdbk.absolute(1)){
                System.out.println("Sem registros");
                cn.close();
                return false;
            }else{
                System.out.println("nome:"+fdbk.getString("nome"));
                cn.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha na conexao");
        }
        
        return false;   
    }
    
    public boolean SearchMatriculaProfessor(String m ){
       
        
        Connection cn = Conexao.getConexaoMySQL();
        Statement brdg;
        try {
            brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet fdbk=brdg.executeQuery("SELECT * FROM professor WHERE matricula='"+m+"'");
            if(!fdbk.absolute(1)){
                System.out.println("Sem registros");
                cn.close();
                return false;
            }else{
                System.out.println("nome:"+fdbk.getString("nome"));
                cn.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha na conexao");
        }
        
        return false;   
    }
    
    public boolean SearchPocTitulo(String t){
        Connection cn = Conexao.getConexaoMySQL();
        Statement brdg;
        try {
            brdg = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet fdbk=brdg.executeQuery("SELECT * FROM poc WHERE titulo='"+t+"'");
            if(!fdbk.absolute(1)){
                System.out.println("Sem registros");
                cn.close();
                return false;
            }else{
                System.out.println("titulo:"+fdbk.getString("titulo"));
                cn.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha na conexao");
        }
        
        return false;
    }
}

    
