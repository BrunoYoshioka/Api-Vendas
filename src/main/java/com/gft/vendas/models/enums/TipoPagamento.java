package com.gft.vendas.models.enums;

public enum TipoPagamento {
    AVISTA(1, "A vista"),
    APRAZO(2, "A prazo");

    private Integer cod;
    private String descricao;

    TipoPagamento(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
