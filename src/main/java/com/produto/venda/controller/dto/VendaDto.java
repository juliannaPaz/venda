package com.produto.venda.controller.dto;

public class VendaDto {

    private String produtoId;
    private int quantidade;

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(final String produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(final int quantidade) {
        this.quantidade = quantidade;
    }
}
