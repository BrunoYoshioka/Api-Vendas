package com.gft.vendas.models;

import com.gft.vendas.models.enums.StatusPagamento;
import com.gft.vendas.models.enums.TipoPagamento;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date data;
    private String notaFiscal;
    private BigDecimal total;
    private Integer numeroParcelas;
    private BigDecimal desconto;
    private BigDecimal valorPago;
    private BigDecimal totalLiquido;
    private BigDecimal troco;
    private StatusPagamento statusPagamento;
    private TipoPagamento tipoPagamento;

    @ManyToOne
    private Cliente cliente;

    public Venda() {
    }

    public Venda(Integer id, Date data, String notaFiscal, BigDecimal total, Integer numeroParcelas, BigDecimal desconto, BigDecimal valorPago,
                 BigDecimal totalLiquido, BigDecimal troco, StatusPagamento statusPagamento, TipoPagamento tipoPagamento, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.notaFiscal = notaFiscal;
        this.total = total;
        this.numeroParcelas = numeroParcelas;
        this.desconto = desconto;
        this.valorPago = valorPago;
        this.totalLiquido = totalLiquido;
        this.troco = troco;
        this.statusPagamento = statusPagamento;
        this.tipoPagamento = tipoPagamento;
        this.cliente = cliente;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(BigDecimal totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
