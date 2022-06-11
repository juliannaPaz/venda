package com.produto.venda.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@JsonTypeName("maquiagem")
public class Maquiagem extends Produto {
    @Enumerated(EnumType.STRING)
    private TipoMaquiagem tipoMaquiagem;

    public Maquiagem() {
    }

    @Override
    public void retiraDoEstoque(final int quantidade) {
       setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
    }

    public Maquiagem(final String id, final String descricao, final BigDecimal preco, final int quantidadeEmEstoque, final TipoMaquiagem tipoMaquiagem) {
        super(id, descricao, preco, quantidadeEmEstoque);
        this.tipoMaquiagem = tipoMaquiagem;
    }

    public TipoMaquiagem getTipoMaquiagem() {
        return tipoMaquiagem;
    }

    public void setTipoMaquiagem(final TipoMaquiagem tipoMaquiagem) {
        this.tipoMaquiagem = tipoMaquiagem;
    }

    public enum TipoMaquiagem{
        RIMEL, BLUSH, PRIME, SOMBRA;
    }
}


