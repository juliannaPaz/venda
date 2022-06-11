package com.produto.venda.service;

import com.produto.venda.controller.dto.MaquiagemDto;
import com.produto.venda.controller.dto.VendaDto;
import com.produto.venda.domain.Maquiagem;
import com.produto.venda.repository.MaquiagemRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MaquiagemService {

    private MaquiagemRepository maquiagemRepository;

    public MaquiagemService(final MaquiagemRepository maquiagemRepository) {
        this.maquiagemRepository = maquiagemRepository;
    }

    public Maquiagem salvaMaquiagem(MaquiagemDto maquiagemDto) {
        var maquiagem = new Maquiagem(
            UUID.randomUUID().toString(),
            maquiagemDto.getDescricao(),
            maquiagemDto.getPreco(),
            maquiagemDto.getQuantidade(),
            Maquiagem.TipoMaquiagem.valueOf(maquiagemDto.getTipoMaquiagem())
        );

        return maquiagemRepository.save(maquiagem);
    }

}
