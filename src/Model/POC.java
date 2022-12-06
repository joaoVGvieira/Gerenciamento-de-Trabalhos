
package Model;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private ArrayList<String> palavrasChave;
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
        
        this.palavrasChave = new ArrayList<>();
        String[] aux = palavrasChave.split(" "); // Separar as palavras chave por espaço
        for(String a: aux){
            this.palavrasChave.add(a);
        }
        
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
        String[] aux = palavrasChave.split(" ");
        for(String a: aux){
            this.palavrasChave.add(a);
        }
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

    public String getPalavrasChave() {
        String aux = new String();
        
        for(String a: this.palavrasChave){
            aux = aux.concat(a);
        }
        aux = aux.replaceAll("-", " ");
        return aux;
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
    
    @Override
    public String toString(){
        return "\n................................." 
        +"\nTitulo: " + this.titulo 
        +"\nLista de autores: " + getListaDeAutores() 
        +"\nOrientador: " + this.orientador 
        +"\nCo-orientador: " + this.coOrientador 
        +"\nData da postagem: " + this.dataPostagem 
        +"\nPalavras chave: " + getPalavrasChave()
        +"\nResumo: " + this.resumo
        +"\nArea: " + this.area
        +"\nCaminho PDF: " + this.caminhoPDF
        +"\n.................................\n";
        
    }
    
}
