package com.attornatus.api.gerenciamento.controllers;

import com.attornatus.api.gerenciamento.models.dtos.requests.PessoaRequestDto;
import com.attornatus.api.gerenciamento.models.dtos.responses.PessoaResponseDto;
import com.attornatus.api.gerenciamento.services.impl.PessoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {

    private PessoaServiceImpl pessoaService;

    @Autowired
    public PessoaController(PessoaServiceImpl pessoaService) {
        this.pessoaService = pessoaService;
    }

    //------------------------------------------------------------------------------------------------------------------

    @PostMapping
    public ResponseEntity<PessoaResponseDto> salvarPessoa (@RequestBody PessoaRequestDto pessoaRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> buscarPorId(@PathVariable(value = "id") Long idPessoa){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.buscarPorId(idPessoa));

    }
}
