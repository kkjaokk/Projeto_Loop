/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

import java.util.List;

/**
 *
 * @author João Henrique
 */
public abstract class Produto {
    
    private int codigo;
    private String nome;
    private Double preco;
    
    
    
    public Produto(){
        
        
    }
    
    public Produto(int codigo, String nome, double preco){
        
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        
    }


    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public abstract void detalhes();
    
    
    
}
