package Model;

import Enum.Forma_Pagamentos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Vendas {
    private Long idVenda;
    private String codBarrasNF;
    private Forma_Pagamentos forma_pagamento;
    private BigDecimal precoTotalVenda;
    private BigDecimal valorRecebido;
    private BigDecimal valorTroco;
    private LocalDate dataVenda;
    private String cpf_cliente;

    public Vendas(Long idVenda, String codBarrasNF, Forma_Pagamentos forma_pagamento, BigDecimal precoTotalVenda, BigDecimal valorRecebido, BigDecimal valorTroco, LocalDate dataVenda, String cpf_cliente) {
        setIdVenda(idVenda);
        setCodBarrasNF(codBarrasNF);
        setForma_pagamento(forma_pagamento);
        setPrecoTotalVenda(precoTotalVenda);
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

    public BigDecimal getPrecoTotalVenda() {
        return precoTotalVenda;
    }

    public void setPrecoTotalVenda(BigDecimal precoTotalVenda) {
        this.precoTotalVenda = precoTotalVenda;
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

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
}
