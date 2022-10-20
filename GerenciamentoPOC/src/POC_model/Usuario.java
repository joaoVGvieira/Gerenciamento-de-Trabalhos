package POC_model;
public class Usuario {
    

    private String nome;
    private int matricula;
    private String senha;

    //Construtor
    public void usuario(String nome, int matricula, String senha){
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }
  
    public void setnome(String nome){
        this.nome=nome;
    }
    
    public void setmatricula(int matricula){
        this.matricula=matricula;
    }
    
    public String getnome(String nome){
        return this.nome;
    }
    
    public int getmatricula(String nome){
        return this.matricula;
    }
    
}
