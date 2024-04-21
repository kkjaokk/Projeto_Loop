package loop;

public class Categoria {
    
    private int qtdPlayer;
    private String genero, tema;
    
    
    public Categoria(){
        
        
        
    }
    
    public Categoria (String genero, String tema, int qtdPlayer){
        
        this.genero = genero;
        this.tema = tema;
        this.qtdPlayer = qtdPlayer;
        
    }

    public int getQtdPlayer() {
        return qtdPlayer;
    }

    public void setQtdPlayer(int qtdPlayer) {
        this.qtdPlayer = qtdPlayer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    
}
