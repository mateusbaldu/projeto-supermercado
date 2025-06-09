package Model;

import java.util.Date;

public class Produto {
    private String codBarras;
    private String nome;
    private String categoria;
    private String marca;
    private String precoCompra;
    private Date dataValidade;

    public Produto(String codBarras, String nome, String categoria, String marca, String precoCompra, Date dataValidade) {
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

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
