package POC_model;

public class Poc {

    private String titulo;
    private String[] lista_de_autores;
    private String data_postagem;
    private String[] palavras_chave;
    private String resumo;
    private String area;
    private String caminhoPDF;

    public Poc(String titulo, String lista_de_autores,String data_postagem, String palavras_chave, String resumo, String area, String caminhoPDF) {
        this.titulo = titulo;
        this.lista_de_autores = lista_de_autores.split(","); // Separar os nomes por vírgula
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


        