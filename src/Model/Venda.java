package Model;

import Enum.Forma_Pagamentos;

import java.math.BigDecimal;
import java.util.Date;

public class Venda {
    private Long idVenda;
    private String codBarrasNF;
    private Forma_Pagamentos forma_pagamento;
    private BigDecimal valorVenda;
    private BigDecimal valorRecebido;
    private BigDecimal valorTroco;
    private Date dataVenda;
    private String cpf_cliente;

    public Venda(Long idVenda, String codBarrasNF, Forma_Pagamentos forma_pagamento, BigDecimal valorVenda, BigDecimal valorRecebido, BigDecimal valorTroco, Date dataVenda, String cpf_cliente) {
        setIdVenda(idVenda);
        setCodBarrasNF(codBarrasNF);
        setForma_pagamento(forma_pagamento);
        setValorVenda(valorVenda);
        setValorRecebido(valorRecebido);
        setValorTroco(valorTroco);
        setDataVenda(dataVenda);
        setCpf_cliente(cpf_cliente);
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public String getCodBarrasNF() {
        return codBarrasNF;
    }

    public void setCodBarrasNF(String codBarrasNF) {
        this.codBarrasNF = codBarrasNF;
    }

    public Forma_Pagamentos getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(Forma_Pagamentos forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(BigDecimal valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public BigDecimal getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = valorTroco;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
}
