package com.produto.venda.controller.dto;

import java.math.BigDecimal;

public class MaquiagemDto {

    private String descricao;
    private int quantidade;
    private BigDecimal preco;
    private String tipoMaquiagem;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(final int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(final BigDecimal preco) {
        this.preco = preco;
    }

    public String getTipoMaquiagem() {
        return tipoMaquiagem;
    }

    public void setTipoMaquiagem(final String tipoMaquiagem) {
        this.tipoMaquiagem = tipoMaquiagem;
    }

}
