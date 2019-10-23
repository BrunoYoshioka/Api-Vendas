package com.gft.vendas.models.enums;

public enum StatusPagamento {

    PAGO(1, "Pago"),
    PENDENTE(2, "Pendente"),
    CANCELADO(3, "Cancelado");

    private Integer id;
    private String descricao;

    StatusPagamento(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
