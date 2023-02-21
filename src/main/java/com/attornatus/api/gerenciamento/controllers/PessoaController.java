package com.attornatus.api.gerenciamento.controllers;

import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import com.attornatus.api.gerenciamento.services.impl.PessoaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {

    private PessoaServiceImpl pessoaService;

    public PessoaController(PessoaServiceImpl pessoaService) {
        this.pessoaService = pessoaService;
    }

    //------------------------------------------------------------------------------------------------------------------

    @PostMapping
    public ResponseEntity<PessoaResponseDto> salvarPessoa (@RequestBody PessoaRequestDto pessoaRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaRequestDto));
    }
}
