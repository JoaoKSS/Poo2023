/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author joaok
 */
public class Compra {

    private Long notaFiscal;
    private Pessoa Pessoa;
    private ArrayList<Item> item;

    public Compra() {
        item = new ArrayList<>();
    }

    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.Pessoa = Pessoa;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Item itens : item) {
            total = total.add(itens.calcularSubtotal());
        }
        return total;
    }

    @Override
    public String toString() {
        return "Compra{" + "notaFiscal=" + notaFiscal + ", Pessoa=" + Pessoa + ", item=" + item + '}';
    }

}
