/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;

/**
 *
 * @author joaok
 */
public class Item {

    private Integer quantidade;
    private Produto produto;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal calcularSubtotal() {
        if (produto != null && quantidade != null) {
            return new BigDecimal(quantidade).multiply(produto.getPreco());
        } else {
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return produto.getNome() + " " + quantidade + " x R$ " + produto.getPreco() + " = R$ " + calcularSubtotal();

    }

}
