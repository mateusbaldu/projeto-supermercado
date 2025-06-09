package Model;

import java.math.BigDecimal;

public class DetalhesVenda {
    private Long idDetalhesVenda;
    private Vendas idVendas;
    private Produtos codigoDeBarrasProduto;
    private String nomeItem;
    private int quantidade;
    private BigDecimal preco;
    private BigDecimal subtotal;

    public DetalhesVenda(Long idDetalhes, Vendas idVendas, Produtos codigoDeBarrasProduto, String nomeItem, int quantidade, BigDecimal preco, BigDecimal subtotal) {
        setIdDetalhes(idDetalhes);
        setIdVenda(idVendas);
        setCodigoDeBarrasProduto(codigoDeBarrasProduto);
        setNomeItem(nomeItem);
        setQuantidade(quantidade);
        setPreco(preco);
        setSubtotal(subtotal);
    }

    public Long getIdDetalhes() {
        return idDetalhesVenda;
    }

    public void setIdDetalhes(Long idDetalhes) {
        this.idDetalhesVenda = idDetalhes;
    }

    public Vendas getIdVenda() {
        return idVendas;
    }

    public void setIdVenda(Vendas idVendas) {
        this.idVendas = idVendas;
    }

    public Produtos getCodigoDeBarrasProduto() {
        return codigoDeBarrasProduto;
    }

    public void setCodigoDeBarrasProduto(Produtos codigoDeBarrasProduto) {
        this.codigoDeBarrasProduto = codigoDeBarrasProduto;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
