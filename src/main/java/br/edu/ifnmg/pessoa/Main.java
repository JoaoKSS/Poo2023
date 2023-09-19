/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;

/**
 *
 * @author joaok
 */
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        try {
            pessoa1.setNome("Ana Zaira");
        } catch (Exception ex) {
            System.out.println("Erro ao definir a nome: " + ex.getMessage());
        }
        pessoa1.setNascimento(LocalDate.parse("29/01/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        Credencial credencial1 = new Credencial();
        credencial1.setEmail("ana.zaira@mail.com");
        try {
            credencial1.setSenha("asdf123");
        } catch (Exception e) {
            System.out.println("Erro ao definir a senha: " + e.getMessage());
        }
        credencial1.setAdministrador(true);

        pessoa1.setCredencial(credencial1);
        credencial1.setPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        try {
            pessoa2.setNome("Beatriz Yana");
        } catch (Exception ex) {
            System.out.println("Erro ao definir a nome: " + ex.getMessage());
        }
        pessoa2.setNascimento(LocalDate.parse("28/01/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        Credencial credencial2 = new Credencial();
        credencial2.setEmail("beatriz.yana@mail.com");
        try {
            credencial2.setSenha("123asdf");
        } catch (Exception e) {
            System.out.println("Erro ao definir a senha: " + e.getMessage());
        }
        credencial2.setAdministrador(false);

        pessoa2.setCredencial(credencial2);
        credencial2.setPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        try {
            pessoa3.setNome("Cecília Xerxes");
        } catch (Exception ex) {
            System.out.println("Erro ao definir a nome: " + ex.getMessage());
        }
        pessoa3.setNascimento(LocalDate.parse("27/01/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        Credencial credencial3 = new Credencial();
        credencial3.setEmail("cecilia.xerxes@mail.com");
        try {
            credencial3.setSenha("123123");
        } catch (Exception e) {
            System.out.println("Erro ao definir a senha: " + e.getMessage());
        }
        credencial3.setAdministrador(false);

        pessoa3.setCredencial(credencial3);
        credencial3.setPessoa(pessoa3);

        Endereco e1 = new Endereco();
        e1.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e1.setLogradouro("A1");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e1.setNumero(1011);
        try {
            e1.setBairro("Santa Ana I");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e1.setCep(39401111);

        Endereco e2 = new Endereco();
        e2.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e2.setLogradouro("A2");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e2.setNumero(1012);
        try {
            e2.setBairro("Santa Ana II");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e2.setCep(39401112);
        pessoa1.getEndereco().add(e1);
        pessoa1.getEndereco().add(e2);

        Endereco e3 = new Endereco();
        e3.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e3.setLogradouro("B");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e3.setNumero(2022);
        try {
            e3.setBairro("Santa Beatriz");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e3.setCep(39402222);
        pessoa2.getEndereco().add(e3);

        Endereco e4 = new Endereco();
        e4.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e4.setLogradouro("C1");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e4.setNumero(3031);
        try {
            e4.setBairro("Santa Cecília I");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e4.setCep(39403331);

        Endereco e5 = new Endereco();
        e5.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e5.setLogradouro("C2");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e5.setNumero(3032);
        try {
            e5.setBairro("Santa Cecília II");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e5.setCep(39403332);

        Endereco e6 = new Endereco();
        e6.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        try {
            e6.setLogradouro("C3");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Logradouro: " + e.getMessage());
        }
        e6.setNumero(3033);
        try {
            e6.setBairro("Santa Cecília III");
        } catch (Exception e) {
            System.out.println("Erro ao definir a Bairro: " + e.getMessage());
        }
        e6.setCep(39403333);
        pessoa3.getEndereco().add(e4);
        pessoa3.getEndereco().add(e5);
        pessoa3.getEndereco().add(e6);

        Telefone t1 = new Telefone();
        t1.setDdd((byte) 38);
        t1.setNumero(12341234);
        pessoa1.getTelefone().add(t1);

        Telefone t2 = new Telefone();
        t2.setDdd((byte) 38);
        t2.setNumero(23452345);

        Telefone t3 = new Telefone();
        t3.setDdd((byte) 38);
        t3.setNumero(923452345);
        pessoa2.getTelefone().add(t2);
        pessoa2.getTelefone().add(t3);

        Telefone t4 = new Telefone();
        t4.setDdd((byte) 38);
        t4.setNumero(934563456);

        Telefone t5 = new Telefone();
        t5.setDdd((byte) 38);
        t5.setNumero(834563456);
        pessoa3.getTelefone().add(t4);
        pessoa3.getTelefone().add(t5);

        Produto produto1 = new Produto();
        try {
            produto1.setNome("Abacaxi");
        } catch (Exception ex) {
            System.out.println("Erro ao definir o nome do produto: " + ex.getMessage());
        }
        produto1.setPreco(new BigDecimal("1.99"));

        Produto produto2 = new Produto();
        try {
            produto2.setNome("Banana");
        } catch (Exception ex) {
            System.out.println("Erro ao definir o nome do produto: " + ex.getMessage());
        }
        produto2.setPreco(new BigDecimal("2.99"));

        Produto produto3 = new Produto();
        try {
            produto3.setNome("Caqui");
        } catch (Exception ex) {
            System.out.println("Erro ao definir o nome do produto: " + ex.getMessage());
        }
        produto3.setPreco(new BigDecimal("3.99"));

        Produto produto4 = new Produto();
        try {
            produto4.setNome("Damasco");
        } catch (Exception ex) {
            System.out.println("Erro ao definir o nome do produto: " + ex.getMessage());
        }
        produto4.setPreco(new BigDecimal("4.99"));

        Produto produto5 = new Produto();
        try {
            produto5.setNome("Espinafre");
        } catch (Exception ex) {
            System.out.println("Erro ao definir o nome do produto: " + ex.getMessage());
        }
        produto5.setPreco(new BigDecimal("5.99"));

        Compra c1 = new Compra();
        String notaFiscalString1 = "000.100.101";
        notaFiscalString1 = notaFiscalString1.replace(".", "");
        c1.setNotaFiscal(Long.valueOf(notaFiscalString1));
        pessoa1.getCompra().add(c1);
        c1.setPessoa(pessoa1);

        Compra c2 = new Compra();
        String notaFiscalString2 = "000.200.202";
        notaFiscalString2 = notaFiscalString2.replace(".", "");
        c2.setNotaFiscal(Long.valueOf(notaFiscalString2));

        Compra c3 = new Compra();
        String notaFiscalString3 = "000.200.212";
        notaFiscalString3 = notaFiscalString3.replace(".", "");
        c3.setNotaFiscal(Long.valueOf(notaFiscalString3));
        pessoa2.getCompra().add(c2);
        pessoa2.getCompra().add(c3);
        c2.setPessoa(pessoa2);
        c3.setPessoa(pessoa2);

        Compra c4 = new Compra();
        String notaFiscalString4 = "000.300.303";
        notaFiscalString4 = notaFiscalString4.replace(".", "");
        c4.setNotaFiscal(Long.valueOf(notaFiscalString4));
        pessoa3.getCompra().add(c4);
        c4.setPessoa(pessoa3);

        Item item = new Item();
        item.setQuantidade(11);
        c1.getItem().add(item);
        item.setProduto(produto1);

        Item item11 = new Item();
        item11.setQuantidade(11);

        Item item12 = new Item();
        item12.setQuantidade(12);

        Item item13 = new Item();
        item13.setQuantidade(13);

        Item item14 = new Item();
        item14.setQuantidade(14);
        c2.getItem().add(item11);
        c2.getItem().add(item12);
        c2.getItem().add(item13);
        c2.getItem().add(item14);
        item11.setProduto(produto2);
        item12.setProduto(produto3);
        item13.setProduto(produto4);
        item14.setProduto(produto5);

        Item item21 = new Item();
        item21.setQuantidade(21);

        Item item22 = new Item();
        item22.setQuantidade(22);

        Item item23 = new Item();
        item23.setQuantidade(23);

        c3.getItem().add(item21);
        c3.getItem().add(item22);
        c3.getItem().add(item23);
        item21.setProduto(produto1);
        item22.setProduto(produto3);
        item23.setProduto(produto5);

        Item item31 = new Item();
        item31.setQuantidade(31);

        Item item32 = new Item();
        item32.setQuantidade(32);

        Item item33 = new Item();
        item33.setQuantidade(33);
        c4.getItem().add(item31);
        c4.getItem().add(item32);
        c4.getItem().add(item33);
        item31.setProduto(produto1);
        item32.setProduto(produto3);
        item33.setProduto(produto5);

        System.out.println("\nDados da Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Data de Nascimento: " + pessoa1.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Email: " + pessoa1.getCredencial().getEmail());
        System.out.println("Senha: " + pessoa1.getCredencial().getSenha());
        System.out.println("" + pessoa1.getCredencial().getTipoAdministrador());

        System.out.print("Endereços: [");
        for (int i = 0; i < pessoa1.getEndereco().size(); i++) {
            Endereco endereco = pessoa1.getEndereco().get(i);
            System.out.print(endereco.getTipoLogradouro() + " " + endereco.getLogradouro() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCep());
            if (i < pessoa1.getEndereco().size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println("Telefones: " + pessoa1.getTelefone());

        int j = 1;
        BigDecimal total1 = BigDecimal.ZERO;
        for (Compra compra : pessoa1.getCompra()) {
            total1 = total1.add(compra.calcularTotal());
        }
        System.out.println("Gasto Total: R$ " + total1);
        BigDecimal subTotal1 = BigDecimal.ZERO;

        for (Compra compra : pessoa1.getCompra()) {
            String notaFiscalFormatted = String.format("%09d", compra.getNotaFiscal());
            System.out.println("Compra " + j + ": " + notaFiscalFormatted.substring(0, 3) + "." + notaFiscalFormatted.substring(3, 6) + "." + notaFiscalFormatted.substring(6, 9));
            for (Item itemCompra : compra.getItem()) {
                Produto produto = itemCompra.getProduto();
                System.out.println("" + produto.getNome() + " " + itemCompra.getQuantidade() + " x " + "R$ " + produto.getPreco() + " = R$ " + itemCompra.calcularSubtotal());
                subTotal1 = subTotal1.add(itemCompra.calcularSubtotal());
            }
            System.out.println("SubTotal : R$ " + subTotal1);
            subTotal1 = BigDecimal.ZERO;
            j++;
        }

        System.out.println("\nDados da Pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Data de Nascimento: " + pessoa2.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Idade: " + pessoa2.getIdade() + " anos");
        System.out.println("Email: " + pessoa2.getCredencial().getEmail());
        System.out.println("Senha: " + pessoa2.getCredencial().getSenha());
        System.out.println("" + pessoa2.getCredencial().getTipoAdministrador());

        System.out.print("Endereços: [");
        for (int i = 0; i < pessoa2.getEndereco().size(); i++) {
            Endereco endereco = pessoa2.getEndereco().get(i);
            System.out.print(endereco.getTipoLogradouro() + " " + endereco.getLogradouro() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCep());
            if (i < pessoa2.getEndereco().size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println("Telefones: " + pessoa2.getTelefone());

        int k = 1;
        BigDecimal total2 = BigDecimal.ZERO;
        for (Compra compra : pessoa2.getCompra()) {
            total2 = total2.add(compra.calcularTotal());
        }
        System.out.println("Gasto Total: R$ " + total2);
        BigDecimal subTotal2 = BigDecimal.ZERO;

        for (Compra compra : pessoa2.getCompra()) {
            String notaFiscalFormatted = String.format("%09d", compra.getNotaFiscal());
            System.out.println("Compra " + k + ": " + notaFiscalFormatted.substring(0, 3) + "." + notaFiscalFormatted.substring(3, 6) + "." + notaFiscalFormatted.substring(6, 9));
            for (Item itemCompra : compra.getItem()) {
                Produto produto = itemCompra.getProduto();
                System.out.println("" + produto.getNome() + " " + itemCompra.getQuantidade() + " x " + "R$ " + produto.getPreco() + " = R$ " + itemCompra.calcularSubtotal());
                subTotal2 = subTotal2.add(itemCompra.calcularSubtotal());
            }
            System.out.println("SubTotal : R$ " + subTotal2);
            subTotal2 = BigDecimal.ZERO;
            k++;
        }

        System.out.println("\nDados da Pessoa 3:");
        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Data de Nascimento: " + pessoa3.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Idade: " + pessoa3.getIdade() + " anos");
        System.out.println("Email: " + pessoa3.getCredencial().getEmail());
        System.out.println("Senha: " + pessoa3.getCredencial().getSenha());
        System.out.println("" + pessoa3.getCredencial().getTipoAdministrador());

        System.out.print("Endereços: [");
        for (int i = 0; i < pessoa3.getEndereco().size(); i++) {
            Endereco endereco = pessoa3.getEndereco().get(i);
            System.out.print(endereco.getTipoLogradouro() + " " + endereco.getLogradouro() + ", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCep());
            if (i < pessoa3.getEndereco().size() - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println("Telefones: " + pessoa3.getTelefone());

        int l = 1;
        BigDecimal total3 = BigDecimal.ZERO;
        for (Compra compra : pessoa3.getCompra()) {
            total3 = total3.add(compra.calcularTotal());
        }
        System.out.println("Gasto Total: R$ " + total3);
        BigDecimal subTotal3 = BigDecimal.ZERO;

        for (Compra compra : pessoa3.getCompra()) {
            String notaFiscalFormatted = String.format("%09d", compra.getNotaFiscal());
            System.out.println("Compra " + l + ": " + notaFiscalFormatted.substring(0, 3) + "." + notaFiscalFormatted.substring(3, 6) + "." + notaFiscalFormatted.substring(6, 9));
            for (Item itemCompra : compra.getItem()) {
                Produto produto = itemCompra.getProduto();
                System.out.println("" + produto.getNome() + " " + itemCompra.getQuantidade() + " x " + "R$ " + produto.getPreco() + " = R$ " + itemCompra.calcularSubtotal());
                subTotal3 = subTotal3.add(itemCompra.calcularSubtotal());
            }
            System.out.println("SubTotal : R$ " + subTotal3);
            subTotal3 = BigDecimal.ZERO;
            l++;
        }

    }

}
