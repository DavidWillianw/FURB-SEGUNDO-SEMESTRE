/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunse
 */
public class Venda {
    
    private List<Produto> produtos = new ArrayList<>();
    private TipoEntrega tipo;
    private Vendedor vendedor;
    private Produto produto;
    private Cliente cliente;
    
    
public double calcularValorEntrega() {
    if (tipo == null) {
        throw new IllegalArgumentException("Tipo de entrega não definido.");
    }
    switch (tipo) {
        case RETIRADA_LOCAL -> {
            return 0.00;
            }
        case SEDEX -> {
            return 15.00 + 0.045 * produto.getPeso();
            }
        case ENCOMENDA_PAC -> {
            return 9.75;
            }
        default -> throw new IllegalArgumentException("Tipo de entrega inválido.");
    }
}

    public double calcularValorProdutos(){
        double valorTotal = 0;

        for (Produto produtos : produtos) {
            valorTotal += produtos.getValor(); 
        }

        return valorTotal;
    
    }
  public double calcularComissao() {
    double comissao = 0;

    double valorTotalProdutos = calcularValorProdutos();
    
    comissao = valorTotalProdutos * (vendedor.getPercentualComissao() / 100);
    
    return comissao;
}

    
     public void inserirProduto(Produto produto) {
        if (produtos.size() > 10) {
    throw new IllegalArgumentException("A lista está no limite máximo.");
}
        produtos.add(produto); 
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
     public TipoEntrega getTipoEntrega() {
        return tipo;
    }

    public void setTipoEntrega(TipoEntrega tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
