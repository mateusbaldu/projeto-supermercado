package Model;

import java.math.BigDecimal;

public class DetalhesVenda {
    private Long idDetalhes;
    private Venda idVenda;
    private Produto codBarras;
    private String nomeItem;
    private int quantidade;
    private BigDecimal preco;
    private BigDecimal subtotal;

    public DetalhesVenda(Long idDetalhes, Venda idVenda, Produto codBarras, String nomeItem, int quantidade, BigDecimal preco, BigDecimal subtotal) {
        setIdDetalhes(idDetalhes);
        setIdVenda(idVenda);
        setCodBarras(codBarras);
        setNomeItem(nomeItem);
        setQuantidade(quantidade);
        setPreco(preco);
        setSubtotal(subtotal);
    }

    public Long getIdDetalhes() {
        return idDetalhes;
    }

    public void setIdDetalhes(Long idDetalhes) {
        this.idDetalhes = idDetalhes;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    public Produto getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Produto codBarras) {
        this.codBarras = codBarras;
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
