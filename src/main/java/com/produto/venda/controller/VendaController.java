package com.produto.venda.controller;

import com.produto.venda.controller.dto.MaquiagemDto;
import com.produto.venda.controller.dto.VendaDto;
import com.produto.venda.domain.Produto;
import com.produto.venda.service.MaquiagemService;
import com.produto.venda.service.VendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
public class VendaController {

    private VendaService service;

    public VendaController(final VendaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Produto> salvaMaquiagem(@RequestBody VendaDto vendaDto){
        var produto = service.realizaVenda(vendaDto);
        return ResponseEntity.ok(produto);
    }

}
