package Model;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
    private Long idPedido;
    private Produto codBarras;
    private Fornecedor cpnjFornecedor;
    private int quantidade;
    private Date dataPedido;
    private BigDecimal preco;

    public Pedido(Long idPedido, Produto codBarras, Fornecedor cpnjFornecedor, int quantidade, Date dataPedido, BigDecimal preco) {
        setIdPedido(idPedido);
        setCodBarras(codBarras);
        setCpnjFornecedor(cpnjFornecedor);
        setQuantidade(quantidade);
        setDataPedido(dataPedido);
        setPreco(preco);
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Produto getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Produto codBarras) {
        this.codBarras = codBarras;
    }

    public Fornecedor getCpnjFornecedor() {
        return cpnjFornecedor;
    }

    public void setCpnjFornecedor(Fornecedor cpnjFornecedor) {
        this.cpnjFornecedor = cpnjFornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
