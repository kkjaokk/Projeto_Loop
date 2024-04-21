package loop;

import java.util.ArrayList;
import java.util.List;


public class JogoDigital extends Produto {

   private String  dataLancamento;
   private double avaliacao;
   private Desenvolvedora dev;
   private Categoria cat;
   private List<JogoDigital> Loja;
   
   JogoDigital(){
       
       this.Loja = new ArrayList<>();
       
   }
   
   public void cadastroJogo(JogoDigital jogo) {
        Loja.add(jogo);
    }

    public void descadastrarJogo(JogoDigital jogo) {
        Loja.remove(jogo);
    }

    public List<JogoDigital> getLoja() {
        return Loja;
    }
   
   JogoDigital(int codigo, String nome, String data, double preco, Desenvolvedora dev, Categoria cat){
       super(codigo, nome, preco);
       this.dataLancamento = data;
       this.dev = dev;
       this.cat = cat;
   }

    public Desenvolvedora getDev() {
        return dev;
    }

    public void setDev(Desenvolvedora dev) {
        this.dev = dev;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
   
    

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public void detalhes() {
        System.out.println("Codigo do jogo: "+this.getCodigo()+" | "+this.getNome()+" | "+this.getCat().getGenero()+
                " "+this.getDataLancamento()+" | "+this.getDev().getNomeDev()+" | "+this.getPreco());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
           
    }
    
    
}
