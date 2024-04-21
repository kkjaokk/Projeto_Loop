/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

/**
 *
 * @author João Henrique
 */
public interface Pagamento {
    
    boolean pagar(double totalValor, double saldoUser, JogoDigital jogo, Usuario user) throws PagamentoInvalidoException;
    
    boolean pagarJf(double totalValor, double saldoUser, JogoFisico jogo, Usuario user) throws PagamentoInvalidoException;
    
    public void nf(double totalValor, double saldoUser, JogoDigital jogo, Usuario user, Pedido p);
    
    public void nfJf(double totalValor, double saldoUser, JogoFisico jogo, Usuario user, Pedido p);
    
}
