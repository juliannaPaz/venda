package com.produto.venda.service;

import com.produto.venda.controller.dto.VendaDto;
import com.produto.venda.domain.Produto;
import com.produto.venda.repository.MaquiagemRepository;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
    private MaquiagemRepository maquiagemRepository;

    public VendaService(final MaquiagemRepository maquiagemRepository) {
        this.maquiagemRepository = maquiagemRepository;
    }

    public Produto realizaVenda(VendaDto vendaDto){
        var produto = maquiagemRepository.findById(vendaDto.getProdutoId())
            .orElseThrow(() -> new RuntimeException("Produto não foi encontrado"));
        produto.retiraDoEstoque(vendaDto.getQuantidade());
        return maquiagemRepository.save(produto);
    }

}
