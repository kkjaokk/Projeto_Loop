/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

/**
 *
 * @author João Henrique
 */
public class PagamentoDigital implements Pagamento{
    
    private int codigoPagamento;
    private String data, valorTotal, tipoPagamento;
    private boolean statusPagamento;
    private Usuario user;

    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    

    @Override
    public boolean pagar(double valorPedido, double saldoUser, JogoDigital jogo, Usuario user) throws PagamentoInvalidoException{ 
       
        
        if(saldoUser >= valorPedido) {
            
          user.atualizaSaldo(valorPedido);
          user.adicionarJogo(jogo);
          System.out.println("Pagamento efetuado com sucesso!");
          System.out.println("Saldo atualizado: "+user.getSaldo());
          return statusPagamento = true;
          
        }else {
            
           throw new PagamentoInvalidoException(saldoUser, valorPedido);
           
        }
            
    }

    @Override
    public void nf(double valorPedido, double saldoUser, JogoDigital jogo, Usuario user, Pedido p) {
        
        if(statusPagamento == true){
            
            System.out.println("\n------------------- Nota Fiscal do Pedido -------------------");
            System.out.println("Pedido de numero: "+p.getCodigoP());
            System.out.println("Codigo do usuario: "+user.getCodigoU());
            System.out.println("Nome do usuario: "+user.getNome());
            System.out.println("E-mail: "+user.getEmail());
            System.out.println("CPF: "+user.getCpf());
            System.out.println("Data de realizacao do pedido: "+p.getDataPedido());
            System.out.println("Produto: "+jogo.getNome()+ "PRODUTO DIGITAL");
            System.out.println("Valor do pedido: "+p.getValorTotal());
            
            
        }
        
    }

    @Override
    public boolean pagarJf(double valorPedido, double saldoUser, JogoFisico jogo, Usuario user) throws PagamentoInvalidoException {
        if(saldoUser >= valorPedido) {
            
          user.atualizaSaldo(valorPedido);
          System.out.println("Pagamento efetuado com sucesso!");
          System.out.println("Saldo atualizado: "+user.getSaldo());
          return statusPagamento = true;
          
        }else {
            
           throw new PagamentoInvalidoException(saldoUser, valorPedido);
           
        }
    }

  

    @Override
    public void nfJf(double totalValor, double saldoUser, JogoFisico jogo, Usuario user, Pedido p) {
        if(statusPagamento == true){
            
            System.out.println("\n------------------- Nota Fiscal do Pedido -------------------");
            System.out.println("Pedido de numero: "+p.getCodigoP());
            System.out.println("Codigo do usuario: "+user.getCodigoU());
            System.out.println("Nome do usuario: "+user.getNome());
            System.out.println("E-mail: "+user.getEmail());
            System.out.println("CPF: "+user.getCpf());
            System.out.println("Data de realizacao do pedido: "+p.getDataPedido());
            System.out.println("Produto: "+jogo.getNome()+ "PRODUTO FISICO");
            System.out.println("Plataforma: "+jogo.getNome());
            System.out.println("Valor do pedido: "+p.getValorTotal());
            System.out.println("Endereco de entrega: "+user.getEndereco());
            System.out.println("Previsão de entrega: "+jogo.getPrevisao());
            
            
        }
    }
    
    
    
}
