package Model;

import java.math.BigDecimal;
import java.util.Date;

public class Estoque {
    private Long idEstoque;
    private Produto codBarras;
    private BigDecimal precoVenda;
    private BigDecimal precoCompra;
    private int quantidade;
    private Date data_validade;
    private String status;
    private boolean baixoEstoque;


    public Estoque(Long idEstoque, BigDecimal precoVenda, BigDecimal precoCompra, int quantidade, Date data_validade, String status, boolean baixoEstoque) {
        setIdEstoque(idEstoque);
        setPrecoVenda(precoVenda);
        setPrecoCompra(precoCompra);
        setQuantidade(quantidade);
        setData_validade(data_validade);
        setStatus(status);
        setBaixoEstoque(baixoEstoque);
    }

    public Long getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Long idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Produto getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Produto codBarras) {
        this.codBarras = codBarras;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBaixoEstoque() {
        return baixoEstoque;
    }

    public void setBaixoEstoque(boolean baixoEstoque) {
        this.baixoEstoque = baixoEstoque;
    }
}
