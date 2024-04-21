package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Pedido {
    
    private int codigoP;
    private String dataPedido;
    private double valorTotal;
    Random random = new Random();
    
    public Pedido(){
        
        
    }
    
 
    
    public Pedido(String dataPedido){
        
       
        this.dataPedido = dataPedido;
        
    }

    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    } 
   
    
    public int getCodigoP() {
        return random.nextInt(10000);
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    

    public void calcularTotal(double valor) {
        valorTotal += valor;
    }
    
    /*@Override 
    public String toString() {
        return "Nota Fiscal{" +
               "id=" + codigoP +
               ", usuario=" + user +
               ", jogos=" + jogos +
               ", total=" + valorTotal +
               '}';
    }
    */
    
}