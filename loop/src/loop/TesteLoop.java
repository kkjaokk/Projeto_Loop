package loop;

import java.util.Scanner;


public class TesteLoop {
    
    
    public static int Menu() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n--------------------------- Bem vindo ao Loop! --------------------------- ");
        System.out.println("1. Minha Conta");
        System.out.println("2. Biblioteca");
        System.out.println("3. Loja");
        System.out.println("4. Versao do software");
        System.out.println("0. Sair");
        System.out.printf("\nNavegue: %n");
        return scanner.nextInt();
    }

    
    
    public static void main(String[] args) throws PagamentoInvalidoException {
        
        int op = 0;
        int op2 = 0;
        Usuario user = new Usuario();
        Scanner scanner = new Scanner(System.in);
        
        Categoria cat1 = new Categoria("Acao", "futurista", 2);
        Categoria cat2 = new Categoria("Aventura", "Monstros", 2);
        
        Desenvolvedora dev1 = new Desenvolvedora("CD Project RED", "cdprojectred@gmail.com", 4000);
        Desenvolvedora dev2 = new Desenvolvedora("From Software", "fromsoftware@gmail.com", 2000);
        
        JogoDigital loja = new JogoDigital();
        JogoDigital jogo1 = new JogoDigital(1, "Elden ring", "12/03/21", 200, dev2, cat2);
        JogoDigital jogo2 = new JogoDigital(2, "Cyberpunk 2077", "12/03/21", 250, dev1, cat1);
        JogoDigital jogo3 = new JogoDigital(3, "The witcher 3", "16/05/24", 350, dev1, cat2);
        JogoDigital jogo4 = new JogoDigital(7, "Call Of Duty", "12/03/21", 200, dev2, cat1);
        JogoDigital jogo5 = new JogoDigital(8, "Gwent", "15/03/23", 150, dev1, cat1);
        JogoDigital jogo6 = new JogoDigital(9, "Dark Souls 4", "11/03/24", 350, dev2, cat2);
        
        JogoFisico lojaF = new JogoFisico();
        JogoFisico jogof1 = new JogoFisico(4, "Elden ring", "12/03/21", 200, dev2, cat2, "Sim", 20, "Xbox", "30/02/24");
        JogoFisico jogof2 = new JogoFisico(5, "Homem Aranha 2", "17/08/24", 200, dev2, cat2, "Sim", 30, "Playstation", "21/02/24");
        JogoFisico jogof3 = new JogoFisico(6, "Halo Reach", "18/03/23", 200, dev2, cat2, "Esgotado", 0, "Xbox", "24/02/24");
        
        
        
        user.setNome("Dimitri Payet");
        user.setCpf("103.454.345-32");
        user.setEmail("dimitrivasco@gmail.com");
        user.setSenha("aquievascoporra");
        user.setTelefone(99999999);
        user.setSaldo(250);
        user.setEndereco("CT VASCO DA GAMA");
        
        loja.cadastroJogo(jogo1);
        loja.cadastroJogo(jogo2);
        loja.cadastroJogo(jogo3);
        
        user.adicionarJogo(jogo4);
        user.adicionarJogo(jogo5);
        user.adicionarJogo(jogo6);
        
        lojaF.cadastroJogo(jogof1);
        lojaF.cadastroJogo(jogof2);
        lojaF.cadastroJogo(jogof3);
        
        
        
        PagamentoDigital pg = new PagamentoDigital();
        Pedido p = new Pedido("12/03/24");
         
        do{
            
            op = Menu();
            
     switch(op){
                
         case 1:
             user.dadosConta();
             break;
             
             
         case 2: 
             System.out.println("Biblioteca de " + user.getNome() + ":");
             for (JogoDigital jogo : user.getBiblioteca()) {
                 System.out.println("- " + jogo.getNome() + " (" + jogo.getDataLancamento() + ")");
             }
         
             break;
             
         case 3:
             
             System.out.println(" --------------- Loja Loop ---------------");
             System.out.println("\n---- Confira as nossas ofertas do dia! ----");
             System.out.println("1. Sessao Jogos Digitais");
             System.out.println("2. Sessao Jogos Fisicos");
             
             op2 = scanner.nextInt();
             
             if(op2 == 1){
                 
                System.out.println("\nDigite o codigo do jogo que deseja comprar: ");
                System.out.println("\n");
                System.out.println("Secao JOGOS DIGITAIS - compre para sua conta loop!");
                System.out.println("\n");
                    for (JogoDigital jogo : loja.getLoja()) {
                         jogo.detalhes();
                 
                    }
                    
                    
                    int codigoSelecionado = scanner.nextInt();
                    JogoDigital jogoSelecionado = null;

                    for (JogoDigital jogo : loja.getLoja() ) {
                        if(codigoSelecionado == jogo.getCodigo()) {

                            jogoSelecionado = jogo;
                            p.calcularTotal(jogo.getPreco());

                        }   
                    }

                    double valorP = p.getValorTotal();
                    double saldoU = user.getSaldo();

                    try{

                        pg.pagar(valorP, saldoU, jogoSelecionado, user);
                        pg.nf(valorP, saldoU, jogoSelecionado, user, p);

                    }catch (PagamentoInvalidoException ex) {
                        System.out.println(ex.getMessage());
                    }
                
                 
             } else if(op2 == 2){
                 
                System.out.println("Secao JOGOS FISICOS - chega na sua casa rapidinho!");
                System.out.println("\n");
                for (JogoFisico jogo : lojaF.getLoja()) {
                jogo.detalhes();
                 
                }
                int codigoFSelecionado = scanner.nextInt();
                JogoFisico jogoFSelecionado = null;
                for (JogoFisico jogof : lojaF.getLoja()) {
                     if(codigoFSelecionado == jogof.getCodigo()) {

                         jogoFSelecionado = jogof;
                         p.calcularTotal(jogof.getPreco());

                     }   
                 }

                double valorPf = p.getValorTotal();
                double saldoUf = user.getSaldo();

                try{

                    pg.pagarJf(valorPf, saldoUf, jogoFSelecionado, user);
                    pg.nfJf(valorPf, saldoUf, jogoFSelecionado, user, p);

                }catch (PagamentoInvalidoException ex) {
                    System.out.println(ex.getMessage());
                }
                    
                 
             }
 
             scanner.nextLine();

             break;
         
         
         case 4:
             System.out.println("Versao 2.0");
             System.out.println("Desenvolvedores: Joao Henrique e Enrique Rocha");
             System.out.printf("Copyright Todos os direitos reservados Loop LTDA", "UTF-8");    
             break;  
         }
     
         System.out.println("\nPressione a tecla enter...");
         scanner.nextLine();   
            
          
        
            
        }while(op!=0);

        
        
    }
    
}
