/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sunse
 */
public class Produto {

   private String produto;
   private String descricao;
   private double preco;
   private Disponivel disponivel;
   private static ArrayList<Produto> produtos = new ArrayList<>();

    public Disponivel getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Disponivel disponivel) {
        this.disponivel = disponivel;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
       public ArrayList<Produto> getProdutos() {
        return produtos;
    }
   
    public void incluirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void removerAluno(Produto produto){
        produtos.remove(produto);
    }
    
    
    
    public Produto obterPreçoMaior(){
        Produto PrecoMaior = produtos.get(0);
        
        for (Produto prod : produtos){
            if (prod.getPreco()> PrecoMaior.getPreco()){
               PrecoMaior = prod;   
            }
        }
        
        return PrecoMaior;
    }

   
}
