package com.produto.venda.domain;

import java.math.BigDecimal;

public class Caneta extends Produto{

    private Cor cor;

    public Caneta(final String id, final String descricao, final BigDecimal preco, final int quantidadeEmEstoque, final Cor cor) {
        super(id, descricao, preco, quantidadeEmEstoque);
        this.cor = cor;
    }

    @Override
    public void retiraDoEstoque(final int quantidade) {
        setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
    }

    public enum Cor{
        AZUL,PRETA,VERMELHO;
    }
}
