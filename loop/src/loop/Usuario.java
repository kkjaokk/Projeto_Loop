package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Usuario {

    private int codigoU, telefone;
    private int codSelecionado;
    private String nome, nickname, email, senha, endereco, cpf;
    private double saldo;
    private List<JogoDigital> biblioteca;
    JogoDigital jogoU = new JogoDigital();
    Random random = new Random();
    
   
    
    public Usuario() {
       
        this.biblioteca = new ArrayList<>();
    }

    public void adicionarJogo(JogoDigital jogo) {
        biblioteca.add(jogo);
    }

    public void removerJogo(JogoDigital jogo) {
        biblioteca.remove(jogo);
    }

    public List<JogoDigital> getBiblioteca() {
        return biblioteca;
    }

    public int getCodSelecionado() {
        return codSelecionado;
    }

    public void setCodSelecionado(int codSelecionado) {
        this.codSelecionado = codSelecionado;
    }

    public JogoDigital getJogoU() {
        return jogoU;
    }

    public void setJogoU(JogoDigital jogoU) {
        this.jogoU = jogoU;
    } 
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    public int getCodigoU() {
        return random.nextInt(10000);
    }

    public void setCodigoU(int codigoU) {
        this.codigoU = codigoU;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void atualizaSaldo(double valor){
        
        this.saldo = saldo - valor;
        
    }

    public void dadosConta(){
        
        System.out.println("Codigo da conta: "+this.codigoU);
        System.out.println("Nome de usuario: "+this.nome);
        System.out.println("E-mail: "+this.email);
        System.out.println("Senha: "+this.senha);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endenreco: "+this.endereco);
        System.out.println("Saldo disponivel na carteira Loop: "+this.saldo);
        
        
    }
    
    
    
}
