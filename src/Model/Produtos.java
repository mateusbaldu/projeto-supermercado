package Model;

import java.time.LocalDate;
import java.util.Date;

public class Produtos {
    private String codBarras;
    private String nome;
    private String categoria;
    private String marca;
    private String precoCompra;
    private LocalDate dataValidade;

    public Produtos(String codBarras, String nome, String categoria, String marca, String precoCompra, LocalDate dataValidade) {
        setCodBarras(codBarras);
        setNome(nome);
        setCategoria(categoria);
        setMarca(marca);
        setPrecoCompra(precoCompra);
        setDataValidade(dataValidade);
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
