package POC_model;


public class professor extends Usuario{
    
    String email;
    String telefone;
    String endereco;

    public professor(String nome, int matricula, String senha, String email, String telefone, String endereco){

        super(nome, matricula, senha);

        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    
    public void poc_cadastrar(){
        poc POC = new poc(email, email, email, email, telefone, endereco, email);


    }



}

