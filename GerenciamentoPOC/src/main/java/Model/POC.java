/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 */
public class POC {
    private String titulo;
    private String[] lista_de_autores;
    private String orientador;
    private String coOrientador;
    private String data_postagem;
    private String[] palavras_chave;
    private String resumo;
    private String area;
    private String caminhoPDF;

    public POC(String titulo, String lista_de_autores, String orientador, String coOrientador, String data_postagem, String palavras_chave, String resumo, String area, String caminhoPDF) {
        this.titulo = titulo;
        this.lista_de_autores = lista_de_autores.split(","); // Separar os nomes por vírgula
        this.orientador = orientador;
        this.coOrientador = coOrientador;
        this.data_postagem = data_postagem;
        this.palavras_chave = palavras_chave.split(" "); // Separar as palavras chave por espaço
        this.resumo = resumo;
        this.area = area;
        this.caminhoPDF = caminhoPDF;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setLista_de_autores(String lista_de_autores) {
        this.lista_de_autores = lista_de_autores.split(",");
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public void setCoOrientador(String coOrientador) {
        this.coOrientador = coOrientador;
    }

    public void setPalavras_chave(String palavras_chave) {
        this.palavras_chave = palavras_chave.split(" ");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setdata_postagem(String data_postagem) {
        this.data_postagem = data_postagem;
    }

    public void setcaminhoPDF(String caminhoPDF){
        this.caminhoPDF = caminhoPDF;
    }

    public String getArea() {
        return area;
    }

    public String getdata_postagem() {
        return this.data_postagem;
    }

    public String[] getLista_de_autores() {
        return lista_de_autores;
    }

    public String getOrientador() {
        return orientador;
    }

    public String getCoOrientador() {
        return coOrientador;
    }

    public String[] getPalavras_chave() {
        return palavras_chave;
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
}

