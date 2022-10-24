package DAO;
import POC_model.Poc;
import java.util.ArrayList;

public class PocDAO {
    
    private static ArrayList<Poc> listaDePocs;


    public PocDAO() {
        this.listaDePocs = new ArrayList<>();
    }

    public void armazenarPoc(Poc poc){
        listaDePocs.add(poc);
    }

}
