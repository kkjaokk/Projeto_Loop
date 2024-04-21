package loop;

public class Desenvolvedora {
    
    private String nomeDev, emailDev;
    private int qtdSeguidores;
    
    public Desenvolvedora(){
        
    }
    
    public Desenvolvedora(String nomeDev,  String emailDev, int qtdSeguidores){
        this.nomeDev = nomeDev;
        this.emailDev = emailDev;
        this.qtdSeguidores = qtdSeguidores;
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public String getContatoDev() {
        return emailDev;
    }

    public void setContatoDev(String contatoDev) {
        this.emailDev = contatoDev;
    }

    public int getQtdSeguidores() {
        return qtdSeguidores;
    }

    public void setQtdSeguidores(int qtdSeguidores) {
        this.qtdSeguidores = qtdSeguidores;
    }
    
    
    
}

