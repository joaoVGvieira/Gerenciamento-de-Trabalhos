/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;

/**
 *
 */
public class POC {
    
    
    //TODO adicionar usuario que fez o cadastro do POC
    private String titulo;
    private String listaDeAutores;
    private String orientador;
    private String coOrientador;
    private LocalDate dataPostagem;
    private String[] palavrasChave;
    private String resumo;
    private String area;
    private String caminhoPDF;
    private String usuarioCadastro;
    

    

    public POC(String titulo, String listaDeAutores, String orientador, String coOrientador, LocalDate data,
            String palavrasChave, String resumo, String area, String caminhoPDF, String usuarioCadastro) {
        this.titulo = titulo;
        this.listaDeAutores = listaDeAutores;
        this.orientador = orientador;
        this.coOrientador = coOrientador;
        this.dataPostagem = data;
        this.palavrasChave = palavrasChave.split(" "); // Separar as palavras chave por espaço
        this.resumo = resumo;
        this.area = area;
        this.caminhoPDF = caminhoPDF;
        this.usuarioCadastro = usuarioCadastro;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setListaDeAutores(String listaDeAutores) {
        this.listaDeAutores = listaDeAutores;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public void setCoOrientador(String coOrientador) {
        this.coOrientador = coOrientador;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave.split(" ");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setDataPostagem(LocalDate dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public void setCaminhoPDF(String caminhoPDF){
        this.caminhoPDF = caminhoPDF;
    }

    public String getArea() {
        return area;
    }

    public LocalDate getDataPostagem() {
        return this.dataPostagem;
    }

    public String getListaDeAutores() {
        return listaDeAutores;
    }

    public String getOrientador() {
        return orientador;
    }

    public String getCoOrientador() {
        return coOrientador;
    }

    public String[] getPalavrasChave() {
        return palavrasChave;
    }

    public String getResumo() {
        return resumo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String caminhoPDF(){
        return caminhoPDF;
    }
    
    public String getUsuarioCadastro(){
        return this.usuarioCadastro;
    }
    public void printar(){
        System.out.println(".................................");
        System.out.println("Titulo: " + this.titulo);
        System.out.print("Lista de autores: " + getListaDeAutores());
        System.out.println("\nOrientador: " + this.orientador);
        System.out.println("Co-orientador: " + this.coOrientador);
        System.out.println("Data da postagem: " + this.dataPostagem);
        System.out.print("Palavras chave: ");
        for (String palavras_chave1 : this.palavrasChave) {
            System.out.print(palavras_chave1 + " ");
        }
        System.out.println("\nResumo: " + this.resumo);
        System.out.println("Area: " + this.area);
        System.out.println("Caminho PDF: " + this.caminhoPDF);
        //System.out.println("Usuário que cadastrou: " + this.usuarioCadastro); //Não necessário printar
        System.out.println(".................................");
        
    }
    
}
