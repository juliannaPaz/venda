package com.produto.venda.controller;

import com.produto.venda.controller.dto.MaquiagemDto;
import com.produto.venda.controller.dto.VendaDto;
import com.produto.venda.service.MaquiagemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("maquiagem")
public class MaquiagemController {

    private MaquiagemService service;

    public MaquiagemController(final MaquiagemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> salvaMaquiagem(@RequestBody MaquiagemDto maquiagemDto){
        service.salvaMaquiagem(maquiagemDto);
        return ResponseEntity.ok(null);
    }

}
