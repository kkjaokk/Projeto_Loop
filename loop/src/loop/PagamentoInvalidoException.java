/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

/**
 *
 * @author João Henrique
 */
public class PagamentoInvalidoException extends Exception {
    
    public PagamentoInvalidoException(double valor, double valorP) {
        super("Pagamento nao efetuado, saldo insuficiente: "+valor+"\nValor do Pedido: "+valorP);
    }
    
}
