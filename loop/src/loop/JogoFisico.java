/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Henrique
 */
public class JogoFisico extends Produto{
   
   private String plataforma;
   private String  dataLancamento;
   private int estoque;
   private String disponibilidade;
   private String previsao;
   private Desenvolvedora dev;
   private Categoria cat;
   private List<JogoFisico> Loja;
   
   JogoFisico(){
       
       this.Loja = new ArrayList<>();
       
   }
   
   public void cadastroJogo(JogoFisico jogo) {
        Loja.add(jogo);
    }

    public void descadastrarJogo(JogoFisico jogo) {
        Loja.remove(jogo);
    }

    public List<JogoFisico> getLoja() {
        return Loja;
    }
   
   JogoFisico(int codigo, String nome, String data, double preco, Desenvolvedora dev, Categoria cat, String disponivel, int estoque, String plataforma, String previsao){
       super(codigo, nome, preco);
       this.dataLancamento = data;
       this.dev = dev;
       this.cat = cat;
       this.disponibilidade = disponivel;
       this.estoque = estoque;
       this.plataforma = plataforma;
       this.previsao = previsao;
   }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String dispoibilidade) {
        this.disponibilidade = dispoibilidade;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

   

    @Override
    public void detalhes() {
        System.out.println("Codigo do jogo: "+this.getCodigo()+" | "+this.getNome()+" | "+this.getCat().getGenero()+
                " "+this.getDataLancamento()+" | "+this.getDev().getNomeDev()+" | "+this.getPreco()+" Disponivel? "+this.getDisponibilidade()+" Estoque: "+this.getEstoque()+" Previsao de chegada: "+this.getPrevisao());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           
    }
    
}
